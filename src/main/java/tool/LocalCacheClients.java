package tool;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地缓存类
 */
public class LocalCacheClients {
    /**
     * 数据缓存
     */
    private final static ConcurrentHashMap<String, Object> dataMap = new ConcurrentHashMap<>();

    /**
     * 缓存过期时间
     */
    private final static ConcurrentHashMap<String, Long> expireMap = new ConcurrentHashMap<>();

    /**
     * 获取缓存中的数据
     *
     * @param key 键值
     * @return 对应的值
     */
    public static Object get(String key) {
        if (!dataMap.containsKey(key)) {
            return null;
        }
        if (expireMap.containsKey(key)) {
            if (expireMap.get(key) < System.currentTimeMillis()) {
                return null;
            }
        }
        return dataMap.get(key);
    }

    /**
     * 插入数据到缓存（不过期）
     *
     * @param key   键
     * @param value 值
     */
    public static void set(String key, Object value) {
        dataMap.put(key, value);
    }

    /**
     * 插入数据到缓存（设置缓存有效期）
     *
     * @param key   键
     * @param value 值
     * @param TTL   有效时间（毫秒）
     */
    public static void set(String key, Object value, Long TTL) {
        final long expireTime = System.currentTimeMillis() + TTL;
        dataMap.put(key, value);
        expireMap.put(key, expireTime);
        if (dataMap.size() > 2) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Iterator<Map.Entry<String, Object>> iterator = dataMap.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<String, Object> item = iterator.next();
                        if (expireMap.containsKey(item.getKey())) {
                            Long aLong = expireMap.get(item.getKey());
                            if (aLong < System.currentTimeMillis()) {
                                iterator.remove();
                                expireMap.remove(item.getKey());
                            }
                        }
                    }
                }
            }).start();
        }
    }

    /**
     * 判断数据是否存在缓存中
     *
     * @param key 键
     * @return 是否存在
     * true：存在
     * false：不存在
     */
    public static boolean isExist(String key) {
        return dataMap.containsKey(key);
    }
}

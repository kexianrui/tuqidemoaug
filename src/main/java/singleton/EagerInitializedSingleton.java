package singleton;

/**
 * All rights Reserved
 *
 * @Package singleton
 * @author: tuqi（tuqi@maihaoche.com）
 * @date: 2018/8/20 下午5:12
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 饿汉模式
 */
public class EagerInitializedSingleton {

    private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

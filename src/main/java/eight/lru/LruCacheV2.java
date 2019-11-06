package eight.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCacheV2 extends LinkedHashMap {
    private final int capacity;

    public LruCacheV2(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }
}

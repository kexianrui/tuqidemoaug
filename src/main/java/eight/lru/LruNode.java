package eight.lru;

public class LruNode {
    private Integer key;
    private Object value;
    private LruNode pre;
    private LruNode next;

    public LruNode(Integer key, Object value) {
        this.key = key;
        this.value = value;
    }
}

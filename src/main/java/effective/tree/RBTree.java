package effective.tree;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by tuqi on 2018/10/8.
 */
public class RBTree<T extends Comparable<T>> {
    private RBTreeNode<T> root;

    private AtomicLong size = new AtomicLong(0);

    private volatile boolean overrideMode = true;

    public RBTree () {}

    public RBTree (boolean overrideMode) {
        this.overrideMode = overrideMode;
    }

    public long getSize() {
        return size.get();
    }

    private RBTreeNode<T> getRoot() {
        return root.getLeft();
    }

    public T addNode(T value) {
        RBTreeNode<T> node = new RBTreeNode<>(value);
        return addNode((T) node);
    }

    public T find(T target) {
        RBTreeNode root = getRoot();

        while (root != null) {
            int cam = root.getValue().compareTo(target);
            if (cam > 0) {
                root = root.getLeft();
            } else if (cam < 0) {
                root = root.getRight();
            } else {
                return (T) root.getValue();
            }
        }

        return null;
    }

    public T remove(T value) {

        return null;
    }
}

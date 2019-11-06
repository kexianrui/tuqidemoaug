package effective.tree;

/**
 *
 * @author tuqi
 * @date 2018/10/8
 */
public class RBTreeNode<T extends Comparable<T>> {

    private T value;
    private RBTreeNode<T> left;
    private RBTreeNode<T> right;
    private RBTreeNode<T> parent;
    private Boolean red;

    public RBTreeNode(){}

    public RBTreeNode(T value) {
        this.value = value;
    }

    public RBTreeNode(T value, Boolean red) {
        this.value = value;
        this.red = red;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public RBTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(RBTreeNode<T> left) {
        this.left = left;
    }

    public RBTreeNode<T> getRight() {
        return right;
    }

    public void setRight(RBTreeNode<T> right) {
        this.right = right;
    }

    public RBTreeNode<T> getParent() {
        return parent;
    }

    public void setParent(RBTreeNode<T> parent) {
        this.parent = parent;
    }

    public void setRed(Boolean red) {
        this.red = red;
    }

    public Boolean isRed() {
        return red;
    }

    public Boolean isBlack() {
        return !red;
    }

    /**
     * 是否是左节点
     * @return
     */
    public Boolean isLeft() {
        return left == null && right == null;
    }

    public void makeRed() {
        red = true;
    }

    public void makeBlack() {
        red = false;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

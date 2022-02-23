package ua.com.alevel.map;

public class Tree<K, V> {

    private Integer hash;
    private K key;
    private V value;
    private Tree<K, V> left;
    private Tree<K, V> right;
    private Tree<K, V> parent;

    public void put(K key, V value) {
        Tree<K, V> tree = new Tree<>();
        tree.setKey(key);
        tree.setValue(value);
        tree.setHash(key.hashCode());
        if (parent != null) {
            if (tree.getHash() > parent.getHash()) {

            }
        }
    }

    public Integer getHash() {
        return hash;
    }

    public void setHash(Integer hash) {
        this.hash = hash;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Tree<K, V> getLeft() {
        return left;
    }

    public void setLeft(Tree<K, V> left) {
        this.left = left;
    }

    public Tree<K, V> getRight() {
        return right;
    }

    public void setRight(Tree<K, V> right) {
        this.right = right;
    }

    public Tree<K, V> getParent() {
        return parent;
    }

    public void setParent(Tree<K, V> parent) {
        this.parent = parent;
    }
}

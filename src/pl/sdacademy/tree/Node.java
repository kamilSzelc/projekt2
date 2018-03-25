package pl.sdacademy.tree;



public class Node {
    private Node parent;
    private Node left;
    private Node right;
    private Integer value;

    public Node(Integer value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    public Integer getValue() {
        return value;
    }

    public void add(Node node) {
        Node actual = this;
        Node parent = null;
        while (actual != null) {
            parent = actual;
            if(actual.value > node.getValue()) {
                actual = actual.left;
            } else {
                actual = actual.right;
            }
        }

        if (parent.value > node.getValue()) {
            parent.left = node;
            parent.left.parent = parent;
        } else {
            parent.right = node;
            parent.right.parent = parent;
        }
    }

    @Override
    public String toString() {

        return String.valueOf(value);
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}

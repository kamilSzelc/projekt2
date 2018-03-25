package pl.sdacademy.tree;

public class Tree {

    private Node root;

    public void add(Integer value) {
        if (root == null) {
            root = new Node(value, null);
        } else {
            root.add(new Node(value, root));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Root:\n");
        sb.append(root.getValue());
        sb.append("\n");
//        sb.append(root.toString());
        sb.append("Left:\n");
        sb.append(root.getLeft());
        sb.append("\n" + "Right:\n");
        sb.append(root.getRight());
        return sb.toString();
    }

    public boolean search(int value) {
        Node actual = root;
        while (actual != null && actual.getValue() != value) {
            if (actual.getValue() > value) {
                actual = actual.getLeft();
            } else {
                actual = actual.getRight();
            }
        }
        if (actual == null) {
            return false;
        } else {
            return true;
        }
    }
}

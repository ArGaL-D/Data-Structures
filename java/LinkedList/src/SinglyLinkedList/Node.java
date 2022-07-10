package SinglyLinkedList;

public class Node {

    private Object data;
    private Node branch;

    public Node(Object data) {
        this.data = data;
        this.branch = null;
    }

    public Object getData() {
        return data;
    }

    public Node getBranch() {
        return branch;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setBranch(Node branch) {
        this.branch = branch;
    }
}

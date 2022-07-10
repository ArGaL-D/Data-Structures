package SinglyLinkedList;

public class LifoLinkedList {

    private Node head;
    private Node tail;
    private long counter;

    public LifoLinkedList() {
        this.head = null;
        this.tail = null;
        this.counter = 0;
    }

    // Add a node
    public void setNode(Object data) {
        if ( this.head == null && this.tail == null ) {
            this.head = new Node(data);
            this.tail = this.head;
        } else {
            Node tmpNode = this.head;
            this.head = new Node(data);
            this.head.setBranch(tmpNode);
        }
        this.counter += 1;
    }

    // Get node data
    public Object getData(int index) {
        if ( index >= 0 && index < this.counter ) {
            int i = 0;
            Node tmpNode = this.head;

            while( i < index ) {
                tmpNode = tmpNode.getBranch();
                i++;
            }
            return tmpNode.getData();
        }
        else return null;

    }


    public Number length() {
        return this.counter;
    }
}

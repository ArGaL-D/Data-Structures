package SinglyLinkedList;

public class LifoLinkedList {

    private Node head;
    private Node tail;
    private int counter;

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

    public Node getNode(int index) {
        if ( index >= 0 && index < this.counter ) {
            Node tmpNode = this.head;
            int i = 0;

            while ( i < index ) {
                tmpNode = tmpNode.getBranch();
                i++;
            }
            return tmpNode;
        }
        else return null;
    }

    public Node getFirstNode() { return this.head; }

    public Node getLastNode() { return this.tail; }

    public void removeNode(int index) throws Exception {
        if ( index >= 0 && index < this.counter ) {
            if ( index == 0 )
                this.head = this.head.getBranch();
            else {
                Node prevNode = this.head;
                Node nextNode = null;
                int tmpIndex = index - 1;
                int i = 0;

                while ( i < tmpIndex ) {
                    prevNode = prevNode.getBranch();
                    i++;
                }

                if ( index + 1 != this.counter ) {
                    nextNode = prevNode.getBranch().getBranch();
                    prevNode.setBranch( nextNode );
                } else {
                    prevNode.setBranch(null);
                    this.tail = prevNode;
                }
            }
            this.counter--;
        }
        else throw new Exception("Linked list: Index Out Of Bounds");
    }

    public void removeAllNodes() {
        this.head = this.tail = null;
        this.counter = 0;
    }

    public int length() {
        return this.counter;
    }
}

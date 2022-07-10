import SinglyLinkedList.LifoLinkedList;

public class Main {
    public static void main(String[] args) {

        LifoLinkedList linkedList = new LifoLinkedList();
        linkedList.setNode(123);
        linkedList.setNode(33);
        linkedList.setNode(90);
        linkedList.setNode(32);

        System.out.println("[+] Total nodes: " + linkedList.length() );
        System.out.println("[+] Node data: " + linkedList.getData(3) );
        System.out.println("[+] First node: " + linkedList.getFirstNode() );
        System.out.println("[+] Last node: " + linkedList.getLastNode().getData() );

        System.out.println("[-] Node... index(2): " + linkedList.getNode(2) );
    }
}

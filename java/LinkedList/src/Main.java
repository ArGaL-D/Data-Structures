import SinglyLinkedList.LifoLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        LifoLinkedList linkedList = new LifoLinkedList();
        linkedList.setNode(123);
        linkedList.setNode(33);
        linkedList.setNode(90);
        linkedList.setNode(32);

        System.out.println("[+] Total nodes: " + linkedList.length() );
        System.out.println("[+] Node data: " + linkedList.getData(3) );
        System.out.println("[+] First node: " + linkedList.getFirstNode() );
        System.out.println("[+] Last node: " + linkedList.getLastNode().getData() );

        System.out.println("[-] Get a Node: " + linkedList.getNode(3) );

        linkedList.removeNode(2);

        /*
        for ( int i = 0; i < linkedList.length(); i++ ) {
            System.out.println( linkedList.getData(i) );
        }
        */

        System.out.println("[-] Last node: " + linkedList.getLastNode().getData() );

        linkedList.removeAllNodes();

        System.out.println("[-] Node..? " + linkedList.getNode(100));
    }
}

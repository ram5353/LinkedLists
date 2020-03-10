


public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        System.out.println(list.CreateSingleLinkedList(7));
        list.insertInLinkedList(1,0);
        list.insertInLinkedList(2,1);
        list.traverseLinkedList();
        list.searchNode(1);
        list.deletionOfNode(0);
        list.traverseLinkedList();

        CircularSingleLinkedList circular = new CircularSingleLinkedList();
        circular.createCircularSingleLinkedList(4);
        circular.insertInCircularLinkedList(2,0);
        circular.insertInCircularLinkedList(3,1);
        circular.traverseCircularLinkedList();

    }
}








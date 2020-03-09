import java.util.Arrays;
import java.util.List;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        System.out.println(list.CreateSingleLinkedList(7));
        list.insertInLinkedList(1,0);
        list.insertInLinkedList(2,3);
        list.traverseLinkedList();
        list.searchNode(1);
    }
}








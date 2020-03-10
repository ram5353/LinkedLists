import java.security.PublicKey;

public class CircularSingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    SingleNode createCircularSingleLinkedList(int nodeValue) {
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(node);
        head = node;
        tail = node;
        size = 1;// size =1
        return head;
    }

    void insertInCircularLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        System.out.println("Inserting new node at location: " + location);
        if (!existsCircularLikedList()) {
            System.out.println("The linked list does not exist!!");
            return; // Linked List does not exists
        } else if (location == 0) {// insert at first position
            node.setNext(head);
            head = node;
            tail.setNext(node); // update tail
        } else if (location >= size) {// insert at last position
            tail.setNext(node);
            tail = node; // to keep track of last node
            tail.setNext(head); // update tail to circularly point head
        } else // insert at specified location
        {
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {// loop till we reach specified node
                tempNode = tempNode.getNext();
                index++;
            }// insert new node after tempNode
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        size++;
    }

    public void traverseCircularLinkedList() {
        if (existsCircularLikedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getValue());
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Linked List does not exists !");
        }
        System.out.println("\n");
    }

    public void deleteCorcularLinkedList() {
        head = null;
        if (tail == null) {
            System.out.println("linked lIst is deleted");
            return;
        } else {
            tail.setNext(null);
            tail = null;
            System.out.println("LinkedList is deleted succcessfully");
        }
    }

    public boolean existsCircularLikedList() {
        return head!= null;
    }


}

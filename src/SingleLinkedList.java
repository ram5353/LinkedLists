import java.util.LinkedList;

public class SingleLinkedList {
    public SingleNode head;
    public SingleNode tail;
    public int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleNode CreateSingleLinkedList(int nodevalue) {
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodevalue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if (!existsLinkedList()) { // Linked List does not exists
            System.out.println("The linked list does not exist!!");
            return;
        } else if (location == 0) {// insert at first position
            node.setNext(head);
            head = node;
        } else if (location >= size) {// insert at last position
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else {// insert at specified location
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {// loop till we reach specified node
                tempNode = tempNode.getNext();
                index++;
            }//tempNode currently references to node after which we should insert new node
            SingleNode nextNode = tempNode.getNext(); //this is the immediate next node after new node
            tempNode.setNext(node);//update reference of tempNode to reference to new node
            node.setNext(nextNode);//update newly added nodes' next.
        }
        setSize(getSize()+1);
    }

    void traverseLinkedList() {
        if (existsLinkedList()) {
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

    void deleteLinkedList() {
        System.out.println("Deleting liked list");
        head = null;
        tail = null;
    }

    boolean searchNode(int nodeValue) {
        if (existsLinkedList()) {
            SingleNode tempnode = head;
            for (int i = 0; i < getSize(); i++) {
                if (tempnode.getValue() == nodeValue) {
                    System.out.println("found at index = " + i);
                    return true;
                }
                tempnode = tempnode.getNext();
            }
        } else {
            System.out.println("Node not found");
            return false;
        }
        return false;
    }



    public void removeElements(SingleNode head, int value) {
        SingleNode tempnode = head;
        int i = 0;
        while (tempnode != null && tempnode.getNext() != null) {
            if (tempnode.getValue() == value) {

            }
            i++;
        }

    }

    public boolean existsLinkedList() {
        return head != null;
    }

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }
}

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }

    public static void printList(LinkedList list) {
        Node currentNode = list.head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}

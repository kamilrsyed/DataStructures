public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        LinkedList.insert(list, 5);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 6);
        LinkedList.insert(list, 9);
        
        LinkedList.printList(list);
        System.out.println("\n");

        // LinkedList.remove(list);
        // System.out.println("removed node is - " + popped);
        // System.out.println("\n");

        LinkedList.printList(list);
    }
}
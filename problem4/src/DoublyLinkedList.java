public class DoublyLinkedList {
    Node header;

    DoublyLinkedList(){
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item){

        if(item == null) return;
        Node currentP=header;
        while(currentP.next!=null){
            currentP=currentP.next;

        }

        Node newNode = new Node();
        newNode.value = item;
        currentP.next = newNode;
        newNode.previous = currentP;
        newNode.next = null;
    }
    // 2. Remove by passing object
    public boolean remove(String item) {
        if (item == null) return false;

        for (Node currentP = header.next; currentP != null; currentP = currentP.next) {
            if (item.equals(currentP.value)) {
                if (currentP.previous != null) {
                    currentP.previous.next = currentP.next;
                }
                if (currentP.next != null) {
                    currentP.next.previous = currentP.previous;
                }
                return true;
            }
        }
        return false;
    }


    // 3. Remove the First Node

    public boolean removeFirst() {
        if (header.next == null) {
            return false;
        }
        Node currentP = header.next;
        header.next = currentP.next;
        if (currentP.next != null) {
            currentP.next.previous = header;
        }
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        Node currentP = header.next;
        if (currentP == null) {
            System.out.println("[]");
            return;
        }
        while (currentP.next != null) {
            currentP = currentP.next;
        }
        StringBuilder sb = new StringBuilder("After reversing: ");
        while (currentP != header) {
            sb.append(currentP.value);
            currentP = currentP.previous;
            if (currentP != header) {
                sb.append(", ");
            }
        }
        sb.append(" ");
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");

        System.out.println("List now: "+list);
        list.addLast("Carol");
        System.out.println("After adding Carol: "+list);

        list.remove("\nHarry");
        System.out.println("After removing Harry: "+list);

        System.out.println("Before removing first node: "+list);
       list.removeFirst();
        System.out.println("After removing first node: "+list);
        list.removeFirst();
        list.removeFirst();

        list.addLast("Bob");
        list.addLast("Bill");
        list.addLast("Tom");
        System.out.println("\nList now: "+list);
        list.printReverse();





    }
}

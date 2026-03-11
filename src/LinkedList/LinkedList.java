package LinkedList;

public class LinkedList {
    static Node start;

    public LinkedList(){
        this.start=null;
    }

    public void add(int value){
        Node node = new Node(value);
        if(start == null){
            start = node;
        } else {
            Node current = start;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void remove(int value){
        Node current = start;
        if(start.value == value){
            start = start.next;
            return;
        }
        while(current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;

        }
    }

    public void reverseList(LinkedList list){
        Node current = start;
        Node previous = null;

        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        start = previous;
        printList(list);

    }

    public static void search(int value){
        Node current = start;
        while(current.next != null){
            if(current.value == value){
                System.out.println("value find");
                break;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
//        list.remove(30);
        list.reverseList(list);
//        list.search(20);
    }



    public static void printList(LinkedList list){
        Node current = start;
        while(current != null){
            System.out.println(current.value + ",");
            current = current.next;
        }
    }
}

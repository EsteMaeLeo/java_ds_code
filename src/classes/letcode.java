package classes;

public class letcode {
    private Node1 head;
    private Node1 tail;

    class Node1 {
        int value;
        Node1 next;

        Node1(int value) {
            this.value = value;
        }
    }

    public letcode(int value) {
        Node1 newNode = new Node1(value);
        head = newNode;
        tail = newNode;
    }

    public Node1 getHead() {
        return head;
    }

    public Node1 getTail() {
        return tail;
    }

    public void printList() {
        Node1 temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node1 newNode = new Node1(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node1 findMiddleNode(){
        if(head == null){
            return null;
        }
        Node1 temp = head;
        Node1 jump = head;

        while (jump!=null && jump.next!=null){
            temp = temp.next;
            jump = jump.next.next;
        }
        return temp;
    }

}


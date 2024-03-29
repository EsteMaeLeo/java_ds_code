package classes;

public class linkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public linkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /*public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public int getLength() {
        return this.length;

    }*/
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {

        System.out.println("Length: " + length);
    }

    public void printList() {
        System.out.println("List of nodes:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public Node removeLast() {

        if (length == 0) {
            return null;
        }
        Node previousNode = this.head;
        Node temp = this.head;
        while (temp.next != null) {
            previousNode = temp;
            temp = temp.next;
        }
        this.tail = previousNode;
        this.tail.next = null;
        this.length--;

        if (length == 0) {
            this.tail = null;
            this.head = null;
        }
        return temp;

    }
}

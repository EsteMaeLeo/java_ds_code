package classes;

public class linkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        classes.Node next;

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

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public int getLength() {
        return this.length;

    }
}

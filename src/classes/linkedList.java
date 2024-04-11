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

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length--;
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index > this.length) {
            return null;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

   /* public boolean set(int index, int value){
        if(index < 0 || index > this.length){
            return false;
        }
        Node setNode = this.get(index);
        setNode.value = value;
        return true;
    }*/

    public boolean set(int index, int value) {

        Node setNode = this.get(index);
        if (setNode != null) {
            setNode.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) {
            return false;
        }
        if (index == 0) {
            this.prepend(value);
            return true;
        }
        if (index == this.length) {
            this.append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        if (index == 0) {
            return this.removeFirst();
        }
        if (index == this.length -1) {
            return this.removeLast();
        }
        Node before = get(index - 1);
        Node temp = before.next;
        before.next = temp.next;
        temp.next = null;
        this.length--;
        return temp;
    }
}

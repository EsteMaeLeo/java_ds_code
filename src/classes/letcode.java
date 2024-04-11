package classes;

public class letcode {
    private Node1 head;
    private Node1 tail;
    private int length;

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

    public boolean hasLoop() {
        if(head == null){
            return false;
        }
        if(length == 1){
            return false;
        }
        Node1 slow = this.head;
        Node1 fast = this.head;
        while(fast!=null){

            if(fast.next == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public boolean hasLoop2() {
        // Initialize slow pointer to the head of the linked list
        Node1 slow = head;

        // Initialize fast pointer to the head of the linked list
        Node1 fast = head;

        // Traverse the linked list with two pointers: slow and fast
        // slow moves one node at a time, while fast moves two nodes at a time
        while (fast != null && fast.next != null) {
            // Move slow pointer to the next node
            slow = slow.next;

            // Move fast pointer to the next two nodes
            fast = fast.next.next;

            // If slow pointer meets fast pointer, then there is a loop in the linked list
            if (slow == fast) {
                return true;
            }
        }

        // If the loop has not been detected after the traversal, then there is no loop in the linked list
        return false;
    }

}


//

package classes;

public class Main {

    public static void printItems(int n){

        for(int i =0; i<=n; i++){
            System.out.println("number: " + i);
        }

    }
    public static void main(String[] args) {

        linkedList myLinkedList = new linkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.append(2);
        myLinkedList.append(8);
        myLinkedList.append(6);
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();

        System.out.println("Test Remove");
        linkedList myLinkedList2 = new linkedList(1);
        myLinkedList2.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList2.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList2.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList2.removeLast());


        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.append(1);
        System.out.println("\nRemove Linked List:");
        myLinkedList.printList();
        // (2) Items - Returns 2 Node
        System.out.println("Remove first " + myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println("Remove first " + myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println("Remove first " + myLinkedList.removeFirst().value);
        System.out.println("Remove first " + myLinkedList.removeFirst().value);
        System.out.println("Remove first " + myLinkedList.removeFirst().value);
        System.out.println("Remove first " + myLinkedList.removeFirst());

        System.out.println("\nGET Linked List:");
        myLinkedList.append(1);
        myLinkedList.append(12);
        myLinkedList.append(14);
        myLinkedList.append(16);
        myLinkedList.append(2);
        myLinkedList.printList();
        System.out.println("get: " + myLinkedList.get(3).value);

        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insert(3, 22);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 20);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(7, 24);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(3).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(5).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();

        /*printItems(10);

        //Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("red");

        Node newNode = new Node(3);

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());*/
    }
}
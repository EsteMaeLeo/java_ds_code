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

        /*printItems(10);

        //Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("red");

        Node newNode = new Node(3);

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());*/
    }
}
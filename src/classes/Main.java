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
        /*printItems(10);

        //Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("red");

        Node newNode = new Node(3);

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());*/
    }
}
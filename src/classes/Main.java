//

package classes;
import pointers.Node;
public class Main {

    public static void printItems(int n){
        for(int i =0; i<=n; i++){
            System.out.println("number: " + i);
        }

    }
    public static void main(String[] args) {

        printItems(10);

        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("red");

        Node newNode = new Node(3);

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
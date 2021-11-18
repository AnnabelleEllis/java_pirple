import java.util.ArrayList;
import java.util.Scanner;

public class DSArrayList {
    public static void main(String[] args) {

//        When we need a Java Data Structure we should consider where or not a simple array can be used to solve the problem.
//        Is an array sufficient?
//        Downfall with arrays, the size has to be defined.

//        An array list is a DS with additional functionality.
//        The ArrayList class is a resizable array, which can be found in the java.util package.
//        The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be
//        modified (if you want to add or remove elements to/from an array, you have to create a new one).
//        While elements can be added and removed from an ArrayList whenever you want.
//        The syntax is also slightly different:

        // Add Items to an Array List
        // arrayList.add(usrInput);

        // Access an Item
        // arrayList.get(0);   --- similar to arr[0] in Arrays

        // Change an Item
        // arrayList.set(1, "Hello")

        // Remove an Element
        // arrayList.remove(0);         // arrayList.remove(arrayList.size() - 1);

        // Remove all Elements in the ArrayList
        // arrayList.clear();

        // ArrayList Size
        // arrayList.size()

        // Loop Through an ArrayList
//        for (int i = 0; i < arrayList.size(); i++) {
//          System.out.println(arrayList.get(i));
//        }
//        for (String i : cars) {
//          System.out.println(i);
//        }

        // Sort an ArrayList
//        Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:

//        import java.util.Collections;  // Import the Collections class
//        Collections.sort(arrayList);



        ArrayList<String> arrayList = new ArrayList<String>(); // An array list that will take only Strings

        Scanner scan = new Scanner(System.in);
         while (true){
             String usrInput = scan.nextLine();

             arrayList.add(usrInput);
             System.out.println(arrayList.toString());
         }
    }
}

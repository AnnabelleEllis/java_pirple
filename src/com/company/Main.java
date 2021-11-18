package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//            Control FLow
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String stringVar = scan.next();
        System.out.println(stringVar);

        int x = 1;

        switch(x){
            case 1:
                System.out.println("RED");
                break;
            case 2: case 4: // YES WE CAN PUT MULTIPLE CASES ON ONE LINE. THE CASES FREELY FALL THROUGH TO EACH OTHER, AND THIS IS WHY WE CAN DO THIS.
                System.out.println("BLUE");
                break;
            case 3:
                System.out.println("YELLOW");
                break;
            default:
                System.out.println("YOYO");

        }
    }
}

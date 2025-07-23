package Concept;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter name2: ");
        String name2 = sc.nextLine();

        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
 
       
        sc.close();
    }
}

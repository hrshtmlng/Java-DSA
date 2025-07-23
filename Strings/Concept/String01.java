package Concept;

import java.util.Scanner;

public class String01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.println("Your name is "+ name);
        sc.close();
    }
}
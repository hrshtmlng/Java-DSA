package Concept;

import java.util.Scanner;

class Array01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjets: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.print("The marks are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
       sc.close();
    }
}
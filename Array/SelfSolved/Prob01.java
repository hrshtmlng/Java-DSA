package SelfSolved;

import java.util.Scanner;

public class Prob01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names you want:");
        int n = sc.nextInt();

        String names[] = new String[n];

        System.out.println("Enter your name:");

        for(int i =0;i<n;i++){
            names[i] = sc.next();
        }

        for(int i=0; i<names.length; i++) {
            System.out.println("Name " + (i+1) +" is : " + names[i]);
        }
 
        sc.close();

    }

}

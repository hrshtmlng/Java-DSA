package Concept;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the no of cols");
        int cols = sc.nextInt();

        int[][] num = new int[rows][cols];
        
        System.out.println("Enter the elements");
        // Input
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                num[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Your 2D Array is:");
        // Output
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
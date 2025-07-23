package SelfSolved;

import java.util.Scanner;

public class Input01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no of Columns:");
        int col = sc.nextInt();

        int[][] num = new int[rows][col];
        System.out.println("Enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j =0;j<col;j++){
                num[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j =0;j<col;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }



        sc.close();
    }
}

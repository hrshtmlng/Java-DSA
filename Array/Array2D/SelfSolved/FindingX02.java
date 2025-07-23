package SelfSolved;

import java.util.Scanner;

public class FindingX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:" );
        int rows = sc.nextInt();
        System.out.println("Enter no of columns:");
        int col = sc.nextInt();

        int[][] num = new int[rows][col];

        System.out.println("Enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j =0;j<col;j++){
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j =0;j<col;j++){
                
                if(x==num[i][j]){
                    System.out.println("Yes X is in the matrix "+num[i][j]);
                }
                
            }
        }
        sc.close();
    }
}

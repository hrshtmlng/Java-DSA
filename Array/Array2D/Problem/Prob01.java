package Problem;

import java.util.Scanner;

public class Prob01 {
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

        System.out.println("Enter the value x(for which index looking for)");
        int x = sc.nextInt();

        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(num[i][j]==x){
                    System.out.println("x is found at index ("+i+", "+j+")");
                }
            }
            System.out.println();
        }


        sc.close();
    }
}

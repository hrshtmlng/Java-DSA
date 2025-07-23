package SelfSolved;

import java.util.Scanner;

public class Prob03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        

        System.out.println("Enter the elements");
        int num[] = new int[n];

        for(int i =0;i<n;i++){
            num[i]= sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                isAscending = false;
            }
        }

        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 

        sc.close();
    }
}

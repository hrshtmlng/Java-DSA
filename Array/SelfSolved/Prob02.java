package SelfSolved;
import java.util.Scanner;
public class Prob02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int num[] = new int[n];

        System.out.println("Enter the elements:");
        for(int i =0;i<n;i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        

        for(int i=0; i<num.length; i++) {
            if(num[i] < min) {
                min = num[i];
            }
            if(num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

 

        sc.close();

    }
}

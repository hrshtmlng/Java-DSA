package Problems;//linear search

import java.util.Scanner;

class Prob01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i =0; i<n ;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose index you want: ");
        int x = sc.nextInt();

        for(int i =0;i<num.length;i++){
            if(num[i]==x){
                System.out.println(x+" is found at index "+i);
            }
        }


        sc.close();
    }
}
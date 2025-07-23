package HW;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        String array[] = new String[size];
        int toLength = 0;

        System.out.println("Enter string:");
        for(int i =0;i<size;i++){
            array[i] = sc.next();
            toLength += array[i].length();
        }
        System.out.println(toLength);
        sc.close();
    }
}

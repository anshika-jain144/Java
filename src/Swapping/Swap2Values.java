package Swapping;

import java.util.Scanner;

public class Swap2Values {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me value of a");
        int a = sc.nextInt();
        System.out.println("Give me value of b");
        int b = sc.nextInt();
        System.out.println("Before swapping a = " + a + " &  b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped values are a = " + a + " & b = " + b);
    }
}



//Best method and can be used everywhere.

package Swapping;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give value of a ");
        int a = sc.nextInt();
        System.out.println("Give me value of b ");
        int b = sc.nextInt();
        System.out.println("Before swapping the value of a is " + a + " & b is " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Swapped values are a = " + a + " & b = " + b);
    }
}

//Accept two integers from user and print the messege along with values and sum


package BasicQuestions;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of a");
        int a = sc.nextInt();
        System.out.println("Give the value of b ");
        int b = sc.nextInt();
        System.out.println("sum of " + a + "&" + b + "is : " + (a+b));
    }
}

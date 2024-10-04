package BasicQuestions;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell us your name");
        String str = sc.nextLine();
        System.out.println("Tell us your age");
        int age = sc.nextInt();
        System.out.println("Hello " + str + ", you are " + age + " years old.");
    }
}

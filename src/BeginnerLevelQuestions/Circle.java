package BeginnerLevelQuestions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give Radius");
        double R = sc.nextDouble();

        double Circumference = 2 * Math.PI * R;
        double Area = Math.PI * Math.pow(R, 2);

        System.out.println("Circumference of Circle is : " + String.format("%.2f", Circumference));
        System.out.println("Area of Circle is : " + String.format("%.2f", Area));
    }
}

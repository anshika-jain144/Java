//Accept the length and width of a rectangle. Calculate & print the area and perameter.

package BeginnerLevelQuestions;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Length");
        double length = sc.nextDouble();
        System.out.println("Give width");
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle is :" + (length * width));
        System.out.println("Parameter of Rectangle is : " + 2 * (length + width) );
    }
}

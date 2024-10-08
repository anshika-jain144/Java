//Find surface area and Volume of a sphere

package BeginnerLevelQuestions;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give Radius value");
        double R = sc.nextDouble();
        double Volume = 4/3 * Math.PI * Math.pow(R, 3);
        double Area = 4 * Math.PI * Math.pow(R, 2);

        System.out.println("Volume of Sphere is : " + String.format("%.2f", Volume));
        System.out.println("Surface Area of Sphere is : " + String.format("%.2f", Area));

    }
}

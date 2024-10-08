//Accept the parameters and calculate the Compound Interest & print it on STDOUT (Using Math class methods)

package BeginnerLevelQuestions;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Principle");
        double P = sc.nextDouble();
        System.out.println("Give Rate");
        double R = sc.nextDouble();
        System.out.println("give Time");
        double T = sc.nextDouble();
        System.out.println("The Compound Interest is :" + String.format("%.2f", (P* Math.pow((1 +R/100),T))));
//        System.out.println(String.format("The Compound Interest is : %.2f%n", P * Math.pow((1 + R / 100), T)));

        sc.close();
    }
}

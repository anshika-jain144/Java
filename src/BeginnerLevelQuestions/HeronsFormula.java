package BeginnerLevelQuestions;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a");
        double a = sc.nextDouble();
        System.out.println("Give b");
        double b = sc.nextDouble();
        System.out.println("Give c");
        double c = sc.nextDouble();

        double s = (a+b+c)/2;
        double HeronsFormula = Math.sqrt(s * ((s-a)*(s-b)*(s-c)));
        System.out.println("Area of Triangle is : " + String.format("%.2f", HeronsFormula));

    }
}

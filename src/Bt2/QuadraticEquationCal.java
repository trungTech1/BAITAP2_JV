package Bt2;

import java.util.Scanner;

public class QuadraticEquationCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 3 số a , b , c :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.printf("Phương trình có 2 nghiệm là : %.1f và %.1f",root1,root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1();
            System.out.printf("Phương trình có một nghiệm kép là : %.1f",root);
        }else {
            System.out.println("The equation has no roots");
        }
    }
}

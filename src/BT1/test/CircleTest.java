package BT1.test;

import BT1.pojo.Circle;
import BT1.pojo.Cylinder;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Tinh dien tich hinh tron");
            System.out.println("2. Tinh the tich hinh tru");
            System.out.println("3. Thoat");
            System.out.println("Nhap lua chon cua ban : ");
            int choice = Integer.parseInt(scanner.nextLine());
            CircleTest circleTest = new CircleTest();
            switch (choice){
                case 1:
                    Circle circle = circleTest.getCircle(scanner);
                    System.out.println(circle);
                    break;
                case 2:
                    Cylinder cylinder = circleTest.getCylinder(scanner);
                    System.out.println(cylinder);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai, nhap lai");
            }
        }
    }

    private Cylinder getCylinder(Scanner scanner) {
        Circle circle = getCircle(scanner);
        System.out.println("Nhap chieu cao hinh tru : ");
        float height = Float.parseFloat(getDataFromUser(scanner, "^[0-9]+(\\.[0-9]+)?$"));
        return new Cylinder(circle.getRadius(), circle.getColor(), height);
    }
    private Circle getCircle(Scanner scanner) {
        System.out.println("Nhap ban kinh hinh tron : ");
        float radius = Float.parseFloat(getDataFromUser(scanner, "^[0-9]+(\\.[0-9]+)?$"));
        System.out.println("Nhap mau sac hinh tron : ");
        String color = scanner.nextLine();
        return new Circle(radius, color);

    }

    private String getDataFromUser(Scanner scanner, String regex) {
        while (true) {
            String input = scanner.nextLine();
            if (validate(input, regex)) {
                System.out.println("Nhap thanh cong");
                return input;
            } else {
                System.out.println("Nhap sai, nhap lai");
            }

        }


    }
    private boolean validate (String Str, String regex){
        return Str.matches(regex);
    }
}

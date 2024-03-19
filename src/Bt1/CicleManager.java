package Bt1;

import java.util.Scanner;

public class CicleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CicleContructor cicle1 = new CicleContructor();
        CicleContructor cicle2 = new CicleContructor();

        System.out.println("Hãy nhâp thông tin đường tròn 1");
        cicle1.inputData(scanner);
        System.out.println("thông tin đường tròn 1 là : ");
        cicle1.displayData();
        System.out.println("Chu vi đường tròn 1 là : " + cicle1.ciclePerimeter(cicle1.getCicleRadius()));
        System.out.println("Diện tích đường tròn 1 là : " + cicle1.cicleAcreage(cicle1.getCicleRadius()));

        System.out.println("Hãy nhâp thông tin đường tròn 2");
        cicle2.inputData(scanner);
        System.out.println("thông tin đường tròn 2 là : ");
        cicle2.displayData();
        System.out.println("Chu vi đường tròn 2 là : " + cicle2.ciclePerimeter(cicle2.getCicleRadius()));
        System.out.println("Diện tích đường tròn 2 là : " + cicle2.cicleAcreage(cicle2.getCicleRadius()));
        scanner.close();
    }
}

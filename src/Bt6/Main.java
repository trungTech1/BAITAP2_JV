package Bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        byte employeesLength = (byte) employees.length;
        System.out.println("Nhập thông tin nhân viên :");
        for (int i = 0; i < employeesLength; i++){
            employees[i] = new Employee();
            employees[i].inputData(scanner);
        }
        System.out.println("Thông tin nhân viên :");
        for (int i = 0; i < employeesLength; i++){
            employees[i].display();
        }
    }
}

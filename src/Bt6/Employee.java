package Bt6;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private byte age;
    private boolean sex;
    private String address;
    private float salary;
    private float rate;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, byte age, boolean sex, String address, float salary, float rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.salary = salary;
        this.rate = rate;
    }

    public void inputData (Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        employeeId = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Byte.parseByte(scanner.nextLine());
        System.out.print("Nhập giới tính (Nam/Nữ): ");
        sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
        System.out.println("Nhập hệ số lương: ");
        rate = Float.parseFloat(scanner.nextLine());
    }

   private float calculateSalary() {
        return salary = rate * 1300000;
    }

    public void display() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.printf("Giới tính : %s",sex ? "Nam" : "Nữ");
        System.out.println("Địa chỉ: " + address);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + calculateSalary());
        }

}
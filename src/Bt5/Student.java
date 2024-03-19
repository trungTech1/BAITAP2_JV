package Bt5;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private Byte age;
    private Boolean sex;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(String studentId, String studentName, Byte age, Boolean sex, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData (Scanner scanner){
        System.out.println("VUI LÒNG NHẬP THÔNG TIN SINH VIÊN");
        System.out.println("Mã sinh viên : ");
        this.studentId = scanner.next();
        scanner.nextLine();
        System.out.println("Tên sinh viên :");
        this.studentName = scanner.nextLine();
        System.out.println("Tuổi :");
        this.age = Byte.parseByte(scanner.next());
        System.out.println("Giới tính :");
        this.sex = Boolean.parseBoolean(scanner.next());
        scanner.nextLine();
        System.out.println("Địa chỉ :");
        this.address = scanner.nextLine();
        System.out.println("Số điện thoại:");
        this.phoneNumber = scanner.next();
        scanner.nextLine();
    }
    public void displayData (){
        System.out.println("THÔNG TIN SINH VIÊN");
        System.out.printf("Mã sinh viên : %s - Tên sinh viên : %s \n",studentId,studentName);
        System.out.printf("Tuổi : %d - Giới tính : %s \n",age,sex ? "Nam" : "Nữ");
        System.out.printf("Địa chỉ : %s - Số điện thoại : %s \n",address,phoneNumber);
    }
}

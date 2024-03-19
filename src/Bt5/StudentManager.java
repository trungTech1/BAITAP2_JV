package Bt5;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;
        int choice;

        while (true) {
            System.out.println("**MENU**");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllStudents(students, studentCount);
                    break;
                case 2:
                    addNewStudent(scanner, students, studentCount);
                    studentCount++;
                    break;
                case 3:
                    editStudent(scanner, students, studentCount);
                    break;
                case 4:
                    deleteStudent(scanner, students, studentCount);
                    break;
                case 5:
                    System.out.println("Thoát chương trình...");
                    return; // Thoát khỏi vòng lặp và kết thúc chương trình
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }

    public static void displayAllStudents(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (int i = 0; i < studentCount; i++) {
                students[i].displayData();
            }
        }
    }

    public static void addNewStudent(Scanner scanner, Student[] students, int studentCount) {
        if (studentCount < students.length) { // Kiểm tra xem danh sách có còn chỗ trống không
            students[studentCount] = new Student(); // Khởi tạo một sinh viên mới
            students[studentCount].inputData(scanner); // Nhập thông tin cho sinh viên mới
            System.out.println("Thêm sinh viên thành công.");
        } else {
            System.out.println("Danh sách sinh viên đã đầy, không thể thêm mới.");
        }
    }

    public static void editStudent(Scanner scanner, Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Chưa có sinh viên nào vui lòng thêm sinh viên.");
            return;
        }
        System.out.println("Nhập mã sinh viên cần sửa");
        String studentId = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId().equals(studentId)) {
                found = true;
                System.out.println("THÔNG TIN SINH VIÊN CẦN SỬA");
                students[i].displayData();
                System.out.println("Thông tin cần sửa:");
                System.out.println("1. Tên sinh viên");
                System.out.println("2. Tuổi");
                System.out.println("3. Giới tính");
                System.out.println("4. Địa chỉ");
                System.out.print("Chọn thuộc tính cần sửa: ");
                int propertyChoice = scanner.nextInt();
                scanner.nextLine(); // Xóa bộ nhớ đệm
                switch (propertyChoice) {
                    case 1:
                        System.out.print("Nhập tên mới: ");
                        String newName = scanner.nextLine();
                        students[i].setStudentName(newName);
                        break;
                    case 2:
                        System.out.print("Nhập tuổi mới: ");
                        byte newAge = scanner.nextByte();
                        students[i].setAge(newAge);
                        break;
                    case 3:
                        System.out.print("Nhập giới tính mới (Nam/Nữ): ");
                        boolean newSex = scanner.next().equalsIgnoreCase("nam");
                        students[i].setSex(newSex);
                        break;
                    case 4:
                        System.out.print("Nhập địa chỉ mới: ");
                        String newAddress = scanner.nextLine();
                        students[i].setAddress(newAddress);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }

                System.out.println("Thông tin của sinh viên đã được cập nhật.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không thể tm thấy sinh viên đã nhập.Vui lòng nhập lại");
        }
    }

    public static void deleteStudent(Scanner scanner, Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Chưa có sinh viên nào vui lòng thêm sinh viên.");
            return;
        }
        System.out.println("Nhập mã sinh viên cần xoá");
        String studentId = scanner.nextLine();
        scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId().equals(studentId)) {
                found = true;
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                System.out.println("Sinh viên đã được xóa khỏi danh sách");
                break;
            }
        }
        if (!found) {
            System.out.println("Không thể tìm thấy sinh viên đã nhập");
        }
    }
}



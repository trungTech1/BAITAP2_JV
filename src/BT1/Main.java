package BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SaffManager saffManager = new SaffManager();
        int choice;
        while (true) {
            System.out.println("**Menu**");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Sửa nhân viên");
            System.out.println("5. Tìm kiếm nhân viên theo tên");
            System.out.println("6. Tìm kiếm nhân viên theo mã");
            System.out.println("7. Săp xếp nhân viên theo tên");
            System.out.println("8. Thoát");
            System.out.println("Vui lòng chọn chức năng");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    saffManager.addStaff(scanner);
                    break;
                case 2:
                    saffManager.showAllStaff();
                    break;
                case 3:
                    saffManager.removeStaff(scanner);
                    break;
                case 4:
                    saffManager.updateStaff(scanner);
                    break;
                case 5:
                    saffManager.searchStaffByName(scanner);
                    break;
                case 6:
                    saffManager.showStaffFollowId(scanner);
                    break;
                case 7:
                    saffManager.sortAndStaffByName();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn chức năng từ 1 đến 8");
                    break;
            }
        }
    }
}

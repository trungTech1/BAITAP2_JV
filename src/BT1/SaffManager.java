package BT1;

import java.util.Scanner;

public class SaffManager {
    Staff[] staffs = new Staff[0];
    byte staffsLength = (byte) staffs.length;

    public Staff inputData(Scanner scanner) {
        System.out.println("Hãy nhâp mã nhân viên");
        String staffId = scanner.nextLine();
        System.out.println("Hãy nhập tên nhân viên");
        String staffName = scanner.nextLine();
        System.out.println("Ngày tháng năm sinh");
        String birthday = scanner.nextLine();
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Số điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("Lương cơ bản");
        float basicSalary = Float.parseFloat(scanner.nextLine());
        System.out.println("Hệ số năng suất");
        float productivityCoefficient = Float.parseFloat(scanner.nextLine());
        return new Staff(staffId, staffName, birthday, address, phoneNumber, basicSalary, productivityCoefficient);
    }

    public void addStaff(Scanner scanner) {
        System.out.println("Nhập số lượng nhân viên muốn thêm");
        byte quantityStaff = Byte.parseByte(scanner.nextLine());
       //Tạo 1 mảng mới có kích thước lớn hơn
        Staff[] newStaffs = new Staff[staffsLength + quantityStaff];
        byte currentIndex = 0;
        // copy mang cu qua mang moi
        for (int i = 0; i < staffsLength; i++) {
            newStaffs[currentIndex] = staffs[i];
            currentIndex++;
        }
        //Gan gia tri moi
        for (int i = 0; i < quantityStaff; i++) {
            System.out.printf("Vui lòng nhập thông tin nhân viên mới thứ %d \n", i + 1);
            newStaffs[currentIndex] = inputData(scanner);
            currentIndex++;
        }
        staffs = newStaffs;
        this.staffsLength = (byte) newStaffs.length;
    }

    public void showStaffFollowId(Scanner scanner) {
        System.out.println("Vui lòng nhập mã nhân viên muốn kiểm tra");
        String staffID = scanner.nextLine();
        for (int i = 0; i < staffsLength; i++) {
            if (staffs[i].getStaffId().equals(staffID)) {
                System.out.println(staffs[i].toString());
                return;
            } else {
                System.out.println("Không tìm thấy nhân viên");
            }
        }
    }

    public void showAllStaff() {
        if (staffs.length == 0) {
            System.out.println("Danh sách nhân viên trống");
            return;
        }
        for (int i = 0; i < staffs.length; i++) {
            System.out.println(staffs[i].toString());
        }
    }

    public void removeStaff(Scanner scanner) {
        System.out.println("Vui lòng nhập mã nhân viên cần xóa");
        String removeId = scanner.nextLine();
        byte index = -1;
        for (int i = 0; i < staffsLength; i++) {
            if (staffs[i].getStaffId().equals(removeId)) {
                index = (byte) i;
                break;
            }
        }
        if (index != -1) {
            Staff[] newStaffs = new Staff[staffsLength - 1];
            for (int i = 0, j = 0; i < staffsLength; i++) {
                if (i != index) {
                    newStaffs[j++] = staffs[i];
                }
            }
            staffs = newStaffs;
        } else {
            System.out.println("Không tìm thấy nhân viên cần xáo vui lòng nhập lại");
        }
    }

    public void updateStaff(Scanner scanner) {
        System.out.println("Vui lòng nhập mã nhân viên cần sửa");
        String updateId = scanner.nextLine();
        byte index = -1;
        for (int i = 0; i < staffsLength; i++) {
            if (staffs[i].getStaffId().equals(updateId)) {
                index = (byte) i;
                break;
            }
        }
        if (index != -1) {
            staffs[index] = inputData(scanner);
        }
        else {
            System.out.println("Không tìm thấy nhân viên cần sửa vui lòng nhập lại");
        }
    }

    public void searchStaffByName(Scanner scanner) {
        System.out.println("Vui lòng nhập tên nhân viên cần tìm");
        String searchName = scanner.nextLine();
        boolean isExist = false;
        for (Staff staff : staffs) {
            if (staff.getStaffName().equalsIgnoreCase(searchName)) {
                System.out.println(staff.toString());
                isExist = true;
            }

        }
        if (!isExist) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }
    public void sortAndStaffByName(){
        for (int i = 0; i < staffsLength - 1; i++) {
            for (int j = i + 1; j < staffsLength; j++) {
                if (staffs[i].getStaffName().compareTo(staffs[j].getStaffName()) > 0) {
                    Staff temp = staffs[i];
                    staffs[i] = staffs[j];
                    staffs[j] = temp;
                }
            }
        }
        showAllStaff();
    }



}

package BT1;

public class Staff {
    private String staffId;
    private String staffName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private float basicSalary;
    private float productivityCoefficient;

    public Staff() {
    }

    public Staff(String staffId, String staffName, String birthday, String address, String phoneNumber, float basicSalary, float productivityCoefficient) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
        this.productivityCoefficient = productivityCoefficient;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getProductivityCoefficient() {
        return productivityCoefficient;
    }

    public void setProductivityCoefficient(float productivityCoefficient) {
        this.productivityCoefficient = productivityCoefficient;
    }

    @Override
    public String toString() {
        return String.format("""
                Mã nhân viên : %s,
                Tên nhân viên : %s,
                Ngày tháng năm sinh : %s,
                Địa chỉ : %s,
                Số điện thoại : %s,
                Lương cơ bản : %f,
                Hệ số năng suất : %f
                """,staffId,staffName,birthday,address,phoneNumber,basicSalary,productivityCoefficient);
    }
}

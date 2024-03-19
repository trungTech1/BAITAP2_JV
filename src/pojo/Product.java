package pojo;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice; //Giá xuất có giá trị lơn hơn ít nhất 20% so với giá nhập
    private float profit; //Lợi nhuận tính theo công thức: profit = exportPrice – importPrice
    private int quantity;
    private String desciption;
    private boolean status;

    public Product() {
    }

    public Product(int quantity, String productId, String productName, float importPrice, float exportPrice, float profit, String desciption, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.desciption = desciption;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return this.importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("""
                        Mã sản phẩm là : %s,
                        Tên sản phẩm là: %s,
                        Giá nhập : %f,
                        Gía xuất : %f,
                        Lợi nhuận : %f,
                        Số lượng : %d,
                        Mô tả : %s,
                        Trạng thái : %s,
                        """, productId, productName, importPrice, exportPrice, profit, quantity, desciption, status ? "Còn hàng" : "Hết hàng"
        );
    }
}

import manager.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("***********************MENU*************************");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tính lợi nhuận sản phẩm");
            System.out.println("4.Sắp xếp các  sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Tìm sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Xuất sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    productManager.displayAllProduct();
                    break;
                case 3:
                    productManager.calProfit();
                    break;
                case 4:
                    productManager.sortProductsByDecreasingProfit();
                    break;
                case 5:
                    productManager.statisticsOfProductsByPrice(scanner);
                    break;
                case 6:
                    productManager.searchProductByName(scanner);
                    break;
                case 7:
                    productManager.plusQuantity(scanner);
                    break;
                case 8:
                    productManager.sellProducts(scanner);
                    break;
                case 9:
                    productManager.updateStatusProduct(scanner);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-10");
            }

        }
    }
}

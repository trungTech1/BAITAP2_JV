package manager;

import pojo.Product;

import java.util.Scanner;


public class ProductManager {
    Product[] products = new Product[0];

    public void addProduct(Scanner scanner) {
        System.out.println("Nhập số lượng sản phẩm muốn thêm :");
        byte productNumber = Byte.parseByte(scanner.nextLine());
        Product[] newProducts = new Product[products.length + productNumber];

        int currentNumber = 0;
        for (Product product : products) {
            newProducts[currentNumber] = product;
            currentNumber++;
        }

        for (int i = 0; i < productNumber; i++) {
            Product product = new Product(); // Tạo một đối tượng Product mới cho mỗi lần lặp
            System.out.println("Nhập thông tin sản phẩm thứ " + (currentNumber + 1)); // Sử dụng currentNumber thay vì i
            inputData(scanner, product);
            newProducts[currentNumber] = product;
            currentNumber++;
        }
        products = newProducts;
        return;
    }


    public void inputData(Scanner scanner, Product product) {
        System.out.println("Nhập mã sản phẩm: ");
        String productId;
        while (true) {
            productId = scanner.nextLine();
            if (validate(productId, "P\\w{3}")) {
                product.setProductId(productId);
                break;
            } else {
                System.out.println("Chưa đúng định dạng. Vui lòng nhập lại");
            }
        }
        System.out.println("Nhập tên sản phẩm: ");
        String productName;
        while (true) {
            productName = scanner.nextLine();
            if (validate(productName, "\\w{5,50}") && !isProductNameExist(productName)) {
                product.setProductName(productName);
                break;
            } else {
                System.out.println("Chưa đúng định dạng.Vui lòng nhập lại");
            }


        }
        System.out.println("Gía trị nhập :");
        while (true) {
            float importPrice = Float.parseFloat(scanner.nextLine());
            if (importPrice > 0) {
                product.setImportPrice(importPrice);
                break;
            } else {
                System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng nhập lại");
            }
        }
        System.out.println("Gía trị xuất :");
        while (true) {
            float exportPrice = Float.parseFloat(scanner.nextLine());
            if (exportPrice > product.getImportPrice() * 1.2) {
                product.setExportPrice(exportPrice);
                break;
            } else {
                System.out.println("Giá trị xuất phải lớn hơn giá trị nhập ít nhất 20%. Vui lòng nhập lại");
            }
        }
        System.out.println("Nhập số lượng: ");
        while (true) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (quantity > 0) {
                product.setQuantity(quantity);
                break;
            } else {
                System.out.println("Số lượng phải lớn hơn 0. Vui lòng nhập lại");
            }
        }
        System.out.println("Nhập mô tả: ");
        String description = scanner.nextLine();
        product.setDesciption(description);
        System.out.println("Nhập trạng thái :");
        boolean status = Boolean.parseBoolean(scanner.nextLine());
        product.setStatus(status);
    }


    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayAllProduct() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
    public void sortProductsByDecreasingProfit(){
          for (int i = 0; i < products.length - 1; i++) {
                for (int j = i + 1; j < products.length; j++) {
                    if(products[i].getProfit() < products[j].getProfit()){
                        Product temp = products[i];
                        products[i] = products[j];
                        products[j] = temp;
                    }
                }
            }
            displayProduct();
    }
    public void statisticsOfProductsByPrice(Scanner scanner) {
        System.out.println("Vui lòng nhập vào giá bắt đầu");
        float fromPrice;
        while (true){
            fromPrice = Float.parseFloat(scanner.nextLine());
            if(fromPrice > 0){
                break;
            }else {
                System.out.println("nhap sai vui long nhap lai:");
            }
        }
        System.out.println("Vui lòng nhập vào giá kết thúc :");
        float toPrice;
        while (true){
            toPrice = Float.parseFloat(scanner.nextLine());
            if(toPrice > fromPrice){
                break;
            }else {
                System.out.println("nhap sai vui long nhap lai:");
            }
        }

        for (Product product: products){
            if(product.getExportPrice() >= fromPrice && product.getExportPrice() <= toPrice){
                System.out.println(product);
            }
        }

    }
    public void searchProductByName(Scanner scanner){
        System.out.println("Vui lòng nhập tên sản phẩm cần tìm kiếm: ");
        String name = scanner.nextLine();
        for (Product product: products){
            if(product.getProductName().contains(name)){
                System.out.println(product);
            }
        }
    }
    public void plusQuantity(Scanner scanner){
        System.out.println("Nhập mã sản phẩm cần tăng số lượng: ");
        String id = scanner.nextLine();
        for (Product product: products){
            if(product.getProductId().equals(id)){
                System.out.println("Nhập số lượng cần tăng: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                product.setQuantity(product.getQuantity() + quantity);
                System.out.println("Tăng số lượng thành công");
                return;
            }
        }
    }
    public void sellProducts (Scanner scanner){
        System.out.println("Nhập tên sản phẩm cần bán :");
        String name = scanner.nextLine();
        for (Product product: products){
            if(product.getProductName().equals(name)){
                System.out.println("Nhập số lượng cần bán: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                if(product.getQuantity() >= quantity){
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println("Bán hàng thành công");
                    return;
                }else {
                    System.out.println("Số lượng hàng không đủ để bán");
                    return;
                }
            }else {
                System.out.println("Không tìm thấy sản phẩm cần bán");
                return;
            }
        }
    }
    public void updateStatusProduct (Scanner scanner){
        System.out.println("Nhập tên sản phẩm cần cập nhật:");
        String name = scanner.nextLine();
        for(Product product : products){
            if(product.getProductName().equals(name)){
                System.out.println("Nhập trạng thái mới: ");
                boolean status = Boolean.parseBoolean(scanner.nextLine());
                product.setStatus(status);
                System.out.println("Cập nhật trạng thái thành công");
                return;
            }else {
                System.out.println("Không tìm thấy sản phẩm cần cập nhật");
                return;
            }
        }
    }
    public void calProfit() {
        float profit = 0;
    for (Product product: products){
        profit = product.getExportPrice() - product.getImportPrice();
        System.out.println("Lợi nhuận của sản phẩm " + product.getProductName() + " là : " + profit);
    }
    }
    private boolean isProductNameExist(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    private boolean validate(String str, String pattern) {
        return str.matches(pattern);
    }
}

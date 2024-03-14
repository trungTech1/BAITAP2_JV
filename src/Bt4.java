import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tinh diem trung binh cac mon");
        float maths,physics,chemistry,literature,english;
        System.out.println("nhap diem mon toan");
        maths = scanner.nextFloat();

        System.out.println("nhap diem mon ly");
        physics = scanner.nextFloat();

        System.out.println("nhap diem mon hoa");
        chemistry =scanner.nextFloat();

        System.out.println("nhap diem mon van");
        literature = scanner.nextFloat();

        System.out.println("nhap diem mon anh");
        english = scanner.nextFloat();
        float averageScore = (maths + physics + chemistry + literature + english) / 5;
        System.out.printf("diem trung binh cua ban la : %.2f \n",averageScore);
        if (averageScore< 5){
            System.out.println("xep loai yeu");

        } else if (averageScore< 6.5) {

            System.out.println("xep loai trung binh");

        } else if (averageScore< 8) {
            System.out.println("xep loai kha");

        } else if (averageScore<9) {
            System.out.println("xep loai gioi");

        }else {
            System.out.println("xep loai xuat sac");
        }

    }
}

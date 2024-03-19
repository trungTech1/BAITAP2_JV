package Bt8;

public class Main {
    public static void main(String[] args) {
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6);
        double rectangleArea1 = StaticMethod.calRectangleArea(2.5,6);
        double rectangleArea2 = StaticMethod.calRectangleArea(4,7);
        double triangleArea1 = StaticMethod.calTriangleArea(3,4,5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5,7,6);

        System.out.printf("Diện tích hình tròn 1 : %.1f\n",circleArea1);
        System.out.printf("Diện tích hình tròn 2 : %.1f\n",circleArea2);
        System.out.printf("Diện tích hình chữ nhật 1 : %.1f\n",rectangleArea1);
        System.out.printf("Diện tích hình chữ nhật 2 : %.1f\n",rectangleArea2);
        System.out.printf("Diện tích hình tròn 1 : %.1f\n",triangleArea1);
        System.out.printf("Diện tích hình tròn 2 : %.1f\n",triangleArea2);

    }
}

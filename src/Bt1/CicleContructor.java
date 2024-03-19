package Bt1;

import java.util.Scanner;

public class CicleContructor {
    private float cicleRadius;
    private String cicleColor;

    public CicleContructor() {
    }

    public CicleContructor(float cicleRadius, String cicleColor) {
        this.cicleRadius = cicleRadius;
        this.cicleColor = cicleColor;
    }

    public float getCicleRadius() {
        return cicleRadius;
    }

    public void setCicleRadius(float cicleRadius) {
        this.cicleRadius = cicleRadius;
    }

    public String getCicleColor() {
        return cicleColor;
    }

    public void setCicleColor(String cicleColor) {
        this.cicleColor = cicleColor;
    }

    public float ciclePerimeter(float cicleRadius) {
        float perimeter = 2 * (float) Math.PI * cicleRadius;
        return perimeter;
    }
    public float cicleAcreage(float cicleRadius){
        float acreage = (float)Math.PI * cicleRadius *cicleRadius;
        return acreage;
    }
    public void inputData (Scanner scanner){
        System.out.println("Hay nhap ban kinh cua duong tron");
        this.cicleRadius = Float.parseFloat(scanner.nextLine());
        System.out.println("Hay nhap mau sac cua duong tron");
        this.cicleColor = scanner.nextLine();
    }
    public void displayData(){
        System.out.println(String.format("Bán kính : %f",this.cicleRadius));
        System.out.println("Màu sắc : " + this.cicleColor);
    }
}

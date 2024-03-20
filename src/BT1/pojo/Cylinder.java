package BT1.pojo;

import BT1.pojo.Circle;

public class Cylinder extends Circle {

    private float height;

   public Cylinder (){

   }
    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public double getVolume(){
       return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return String.format("""
                Hình trụ có các thuộc tính :
                Bán kính : %f,
                Màu sắc : %s,
                Chiều sao : %f,
                Thể tích : %f
                """,getRadius(),getColor(),height,getVolume());
    }
}

package BT1.pojo;

public class Circle {
    private float radius;
    private String color;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea (){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("""
                Ban kinh hinh tron la : %f,
                Mau sac : %s,
                Dien tich laf : %f
                """,radius,color,getArea());
    }
}

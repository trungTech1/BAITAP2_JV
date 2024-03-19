package Bt2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected double getDiscriminant (){
        double delta = Math.pow(b,2) - 4*a*c;
        return delta;
    }
    protected double getRoot1(){
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Trả về NaN nếu có nghiệm ảo
        }else {
            double root1 = (-b + Math.pow(discriminant,0.5))/(2*a);
            return root1;
        }

    }
    protected  double getRoot2 (){
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Trả về NaN nếu có nghiệm ảo
        }else {
            double root2 = (-b - Math.pow(discriminant,0.5))/(2*a);
            return root2;
        }
    }
}

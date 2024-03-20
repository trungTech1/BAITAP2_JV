package BT3.pojo;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,1,2,3);
        movablePoint.move().move().move();
        System.out.println(movablePoint);
    }
}

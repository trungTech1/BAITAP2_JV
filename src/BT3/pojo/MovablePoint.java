package BT3.pojo;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setxSpeedySpeed (float xSpeed,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getxSpeedySpeed (){
        return new float[]{xSpeed,ySpeed};
    }

    public MovablePoint move (){
        setX(getX()+ xSpeed);
        setY(getY()+ ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return String.format("""
                speed :
                xSpeed : %f,
                ySpeed : %f,
                ----------
                x : %f,
                y : %f
                """, xSpeed,ySpeed,getX(),getY());
    }
}

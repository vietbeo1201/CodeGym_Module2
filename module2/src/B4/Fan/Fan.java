package B4.Fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    boolean on;
    private double radius;
    private String color;
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        if (on) {
            System.out.println("speed = " + speed);
            System.out.println("radius = " + radius);
            System.out.println("color = " + color);
            return "fan is on";
        }else {
            System.out.println("speed = " + speed);
            System.out.println("radius = " + radius);
            System.out.println("color = " + color);
            return "fan is off";
        }
    }
}

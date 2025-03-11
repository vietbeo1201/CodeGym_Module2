package B5_access_modifier.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private  String color = "red";

    Circle(double r) {
        this.radius = r;
    }
    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double Area  = Math.PI * radius * radius;
        System.out.println("Area = " + Area);
        return Area;
    }
}

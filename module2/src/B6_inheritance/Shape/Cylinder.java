package B6_inheritance.Shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder() {
    }
    public Cylinder(double height, double radius,String color,boolean filled) {
        super(radius,color,filled);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double volume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "this Cylinder has height "
                + height
                + " and "
                + super.toString();
    }
}

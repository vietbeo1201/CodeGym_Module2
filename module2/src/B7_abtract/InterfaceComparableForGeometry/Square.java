package B7_abtract.InterfaceComparableForGeometry.Shape;

public class Square extends Shape {
    private double width;

    public Square() {
    }
    public Square(double width) {
        this.width = width;
    }
    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * width;
    }
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public String toString() {
        return "this Square has width "
                + width
                + " and this is a subclass of "
                + super.toString();
    }
}

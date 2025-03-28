package B6_inheritance.Shape;

public class Shape {
    private String color = "green";
    private Boolean filled = true;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(){

    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean getFilled() {
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                +getColor()
                +" and "
                + (getFilled()?"filled":"not filled");
    }
}

package B6_inheritance.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        c1 = new Circle(3.5);
        System.out.println(c1);

        c1 = new Circle(3.5, "china", false);
        System.out.println(c1);
    }
}

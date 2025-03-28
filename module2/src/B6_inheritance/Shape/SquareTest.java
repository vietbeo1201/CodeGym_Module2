package B6_inheritance.Shape;

public class SquareTest {
    public static void main(String[] args) {
        Shape square1 = new Square();
        System.out.println(square1);

        square1 = new Square(5);
        System.out.println(square1);

        square1 = new Square(5, "ChingChong", false);
        System.out.println(square1);
    }
}

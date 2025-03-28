package B6_inheritance.MoveablePoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint m1 = new MoveablePoint();
        m1.setXSpeed(2);
        m1.setYSpeed(2);
        m1.move();
        m1.move();
        m1.move();
        m1.move();
        m1.move();
        System.out.println(m1);

    }
}

package B6_inheritance.Shape;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        cylinder1 = new Cylinder(4, 6, "yellow", true);
        System.out.println(cylinder1);
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getPerimeter());
        System.out.println(cylinder1.volume());
    }
}

package B6_inheritance.Point2D3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(10,20,30);
        System.out.println(p1);

        p1.setXYZ(30, 40, 50);
        System.out.println(p1);
        float[] result = p1.getXYZ();
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}

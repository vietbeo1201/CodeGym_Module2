package B6_inheritance.Point2D3D;

public class Point2DTest {
    public static void main(String[] args) {
     Point2D point1 = new Point2D();
     System.out.println(point1);

     point1 = new Point2D(1, 2);
     System.out.println(point1);

     float[] result =  point1.getXY();
     System.out.println(result[0] + " " + result[1]);
    }
}

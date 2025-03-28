package B7_abtract.InterfaceComparableForGeometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        r1 = new Rectangle(5, 6);
        System.out.println(r1);

        r1 = new Rectangle(5, 6, "Nigga", true);
        System.out.println(r1);
    }
}

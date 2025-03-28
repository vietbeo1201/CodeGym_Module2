package B7_abtract.InterfaceComparableForGeometry;
import java.util.Comparator;
import java.util.Arrays;

public class CircleComparatorTests {
    public static void main(String[] args) {
        Circle[] o1 = new Circle[3];
        o1[0] = new Circle(4);
        o1[1] = new Circle();
        o1[2] = new Circle(10, "red", false);

        System.out.println("Pre Sort: ");
        for (Circle circle : o1) {
            System.out.println(circle);
        }
        Comparator CircleComparator = new CircleComparator();
        Arrays.sort(o1, CircleComparator);

        System.out.println("Post Sort: ");
        for (Circle circle : o1) {
            System.out.println(circle);
        }
    }
}

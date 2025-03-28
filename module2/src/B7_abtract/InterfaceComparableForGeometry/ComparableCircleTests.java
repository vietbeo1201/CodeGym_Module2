package B7_abtract.InterfaceComparableForGeometry.Shape;

import java.util.Arrays;

public class ComparableCircleTests<C extends Circle> {
    public static void main(String[] args) {
        ComparableCircle[] o1 = new ComparableCircle[3];
        o1[0] = new ComparableCircle(10);
        o1[1] = new ComparableCircle();
        o1[2] = new ComparableCircle(5.0, "black", false);
        System.out.println("Pre-sorted: ");
        for (ComparableCircle c : o1) {
            System.out.println(c);
        }
        Arrays.sort(o1);

        System.out.println("After sort: ");
        for (ComparableCircle c : o1) {
            System.out.println(c);
        }
    }
}

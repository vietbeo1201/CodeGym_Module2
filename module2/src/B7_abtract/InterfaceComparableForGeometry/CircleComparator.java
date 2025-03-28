package B7_abtract.InterfaceComparableForGeometry;
import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        if (o1.getRadius() < o2.getRadius()) return -1;
        return 0;
    }
}

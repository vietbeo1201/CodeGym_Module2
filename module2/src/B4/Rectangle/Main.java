package B4.Rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        double width = o1.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = o1.nextDouble();
        Rectangle o2 = new Rectangle(width, height);
        System.out.println("your Rectangle is " + o2.Display());
        System.out.println("Perimeter of the rectangle: " + o2.GetPerimeter());
        System.out.println("Area of the rectangle: " + o2.GetArea());
    }
}

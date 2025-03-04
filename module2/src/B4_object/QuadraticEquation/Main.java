package B4_object.QuadraticEquation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = o1.nextDouble();
        System.out.println("Enter b: ");
        double b = o1.nextDouble();
        System.out.println("Enter c: ");
        double c = o1.nextDouble();

        QuadraticEquation o2 = new QuadraticEquation(a, b, c);
        double delta = o2.delta();
        if (delta > 0) {
            System.out.println("root 1: " + o2.Root1());
            System.out.println("root 2: " + o2.Root2());
        } else if (delta == 0) {
            System.out.println("root 1 = root 2: " + o2.Root12());
        } else {
            System.out.println("no root in this Quadratic Equation");
        }
    }
}

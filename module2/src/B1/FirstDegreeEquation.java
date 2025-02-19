package B1;
import java.util.Scanner;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("give equation as 'ax + b = c'");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0){
            double ans = (c - b) / a ;
            System.out.printf("answer is: %f!\n", ans);
        } else {
            if (b == c ){
                System.out.println("The equation always right");
            } else {
                System.out.println("The equation always wrong");
            }
        }
    }
}

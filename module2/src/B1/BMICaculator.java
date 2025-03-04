package B1;
import java.util.Scanner;

public class BMICaculator {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        double weight, height, BMI;
        System.out.print("Enter the weight in kg (kilograms): ");
        weight = o1.nextDouble();
        System.out.print("Enter the height in m (meters): ");
        height = o1.nextDouble();
        BMI = weight / (height * height);
        System.out.println("BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal");
        } if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

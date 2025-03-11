package B3;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");
        int option = input.nextInt();
        switch (option){
            case 1:
                System.out.print("Enter the temperature in Fahrenheit: ");
                int FtoC = input.nextInt();
                System.out.print("Fahrenheit to Celsius: " + fahrenheitToCelsius(FtoC));
                break;

                case 2:
                    System.out.print("Enter the temperature in Celsius: ");
                    int CtoF = input.nextInt();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(CtoF));
                    break;

                    case 3:
                        System.exit(0);

        }

    }

    public static double fahrenheitToCelsius(double FtoC) {
        double Value = (5.0 / 9) * (FtoC - 32);
        return Value;
    }

    public static double celsiusToFahrenheit(double CtoF) {
        double value = (CtoF * 9 / 5) + 32;
        return value;
    }
}

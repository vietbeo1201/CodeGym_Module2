package B2;
import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        boolean isPrime;
        if (number < 2) {
            System.out.println("Not prime number");
        } else {
            int i = 2;
            isPrime = true;
            while (i < number) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not prime number");
            }
        }
    }
}

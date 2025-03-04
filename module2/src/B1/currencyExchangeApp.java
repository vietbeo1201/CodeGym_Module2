package B1;
import java.util.Scanner;
public class currencyExchangeApp {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner o1 = new Scanner(System.in);
        System.out.print("Enter amount to exchange(USD): ");
        double amount = o1.nextDouble();
        System.out.println("your amount to exchange(VND): "+ rate * amount);
    }
}

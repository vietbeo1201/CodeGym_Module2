package B2;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the investment amount: ");
        int investmentAmount = sc.nextInt();
        System.out.println("enter the interest rate: ");
        double interestRate = sc.nextDouble();
        System.out.println("enter number of months: ");
        int months = sc.nextInt();

        double totalInterest = 0;
        for (int i = 0; i < months; i++) {
            totalInterest += investmentAmount * (interestRate/100)/12 * months;
        }
        System.out.println("total interest: " + totalInterest);
    }
}

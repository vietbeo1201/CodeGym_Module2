package B2;
import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int UCLN = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a = sc.nextInt();
        System.out.print("enter the second number: ");
        int b = sc.nextInt();
        if ( a == 0 && b == 0 || a < 0 || b < 0 ) {
            System.out.println("No common factor");
            return;
        }

        if (a > b){
            for (int i = 1; i < a; i++){
                if (a % i == 0 && b % i == 0 ) {
                    UCLN = i;
                }
            }

        } if (a < b) {
            for (int i = 1; i < b; i++){
                if (a % i == 0 && b % i == 0 ) {
                    UCLN = i;
                }
            }
        }
        System.out.println("the greatest common factor is " + UCLN);
    }
}

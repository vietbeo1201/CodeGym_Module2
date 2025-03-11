package B3;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        int counter = 0;
        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = o1.nextLine();
        System.out.println("enter the character you want to count: ");
        char ch = o1.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                counter++;
            }
        }
        System.out.println("the character "+ ch + " repeat " + counter + " times");
    }
}

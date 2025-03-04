package B2;

import java.util.Scanner;

public class MenuGeometry {
    public static void main(String[] args) {
        int option = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw Strangle");
        System.out.println("2. Draw Square");
        System.out.println("3. Draw Rectangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        option = input.nextInt();

        switch (option) {
            case 1: System.out.println("Draw Strangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
            break;
            case 2: System.out.println("Draw Square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
            break;
            case 3: System.out.println("Draw Rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
            break;
            case 4: System.exit(0);
            break;
            default: System.out.println("Wrong choice");
            break;
        }
    }
}

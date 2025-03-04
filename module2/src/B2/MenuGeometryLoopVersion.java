package B2;

import java.util.Scanner;

public class MenuGeometryLoopVersion {
    public static void main(String[] args) {
        int option = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("2. Draw Square");
        System.out.println("3. Draw Rectangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        option = input.nextInt();

        if (option == 3) {
            System.out.println("Enter the x length");
            int x = input.nextInt();
            System.out.println("Enter the y width");
            int y = input.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        if (option == 2) {
            System.out.println("Enter the x length");
            int x = input.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if (option == 1) {
            System.out.println("Enter the x length");
            int x = input.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < x - i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}

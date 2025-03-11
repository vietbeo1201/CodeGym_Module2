package B3;

import java.util.Scanner;

public class SumOfChosenColumn {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        int sum = 0;
        // Let user insert the number of width and height of the multiple dimension array
        System.out.println("Enter the number of height in the table");
        int height = o1.nextInt();
        System.out.println("Enter the number of width in the table");
        int width = o1.nextInt();
        int[][] table = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Enter the value for " + i + "x" + j + ": ");
                table[i][j] = o1.nextInt();
            }
        }
        // let user choose the column to total sum
        System.out.println("Enter the columns to sum");
        int columns = o1.nextInt();
        // use 2 for loop
        for (int i = 0; i < width; i++) {
            if (columns == i) {
                for (int j = 0; j < height ; j++) {
                    sum = sum + table[j][i];
                }
            }
        }
        System.out.println("The sum of the columns is: " + sum);
    }
}

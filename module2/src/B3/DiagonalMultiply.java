package B3;
import java.util.Scanner;

public class DiagonalMultiply {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter width of the array: ");
        int width = o1.nextInt();
        int[][] matrix = new int[width][width];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < width; j++){
                System.out.print("enter number in row " + (i + 1) + " column " + (j + 1));
                matrix[i][j] = o1.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonal is: " + sum);
    }
}

package B3;
import java.util.Scanner;

public class LargestElementIn2DimentionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MaxValue = 0;
        int width;
        int height;
        System.out.println("Enter the width of the array: ");
        width = scanner.nextInt();
        System.out.println("Enter the height of the array: ");
        height = scanner.nextInt();
        int[][] matrix = new int[width][height];
        for (int i = 0 ; i < height; i++ ) {
            for (int j = 0 ; j < width ; j++ ) {
                System.out.print("Enter the element at index " +  (j) + " ," + (i) + ": ");
                int element = scanner.nextInt();
                matrix[j][i] = element;
            }
        }
        for (int i = 0 ; i < height; i++ ) {
            for (int j = 0 ; j < width ; j++ ) {
                if (matrix[j][i] > MaxValue) {
                    MaxValue = matrix[j][i];
                }
            }
        }
        System.out.println("Max value: " + MaxValue);
    }
}

package B3;
import java.util.Arrays;
import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter array length: ");
            length = scanner.nextInt();
            if (length > 20) {
                System.out.println("Array is too large.");
            }
        } while (length > 20);

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter array elements no " + (i + 1) + "th in the array");
            array[i] = scanner.nextInt();
        }

        System.out.println("the minimum value is " + min(array));
    }

    public static int min(int[] array) {
        System.out.println(Arrays.toString(array));
        int min_val = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min_val) {
                min_val = array[i];
            }
        }
        return min_val;
    }
}

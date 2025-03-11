package B3;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int arrayLength = 0 ;
        int indexDel = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter this array length: ");
            arrayLength = input.nextInt();
            if (arrayLength > 20 || arrayLength < 0) {
                System.out.println("this length should be between 0 and 20");
            }
        } while (arrayLength > 20);

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("current array is: " + Arrays.toString(array));

        System.out.println("Enter the element to be deleted");
        int element = input.nextInt();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element) {
                indexDel = i;
                for (int j = indexDel; j < array.length ; j++) {
                    if (j < array.length - 1) {
                        array[j] = array[j + 1];
                    }
                }
                System.out.println("Deleted " + element + " from the array");
                array[array.length - 1] = 0;
                break;
            }
        }
        System.out.println("new array is: " + Arrays.toString(array));

    }
}

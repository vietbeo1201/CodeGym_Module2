package B3;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = o1.nextInt();
        int[] arr = new int[size];
        if (size == 0 || size == 21) {
            System.out.println("Array should be 1-20 elements");
        }
        for (int i =0 ; i<arr.length; i++){
            System.out.println("Enter element No "+(i+1)+": ");
            arr[i] = o1.nextInt();
        }
        int MinValue = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < MinValue) {
                MinValue = arr[i];
            }
        }
        System.out.println("Min value: " + MinValue);
    }
}

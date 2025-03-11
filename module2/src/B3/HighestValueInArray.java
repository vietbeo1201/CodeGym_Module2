package B3;
import java.util.Arrays;
import java.util.Scanner;

public class HighestValueInArray {
    public static void main(String[] args) {
        int i = 0;
        int temp = 0;
        int max_value = 0;
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do{
            System.out.println("enter the size of the array ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("The array is too large.");
            }
        } while(size > 20);
        int[] array = new int[size];

        while (i < size){
            System.out.println("enter the value " + (i+1) + " of the array ");
            array[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            max_value = array[j];
            if (j < array.length-1){
                if (array[j] < array[j+1]) {
                    max_value = array[j+1];
                }
            }
        }
        System.out.println("the highest value in the array is: " + max_value);
    }
}

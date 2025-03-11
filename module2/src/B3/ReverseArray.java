package B3;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("The array is too large.");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("enter the " + (i + 1) + "th number: ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("The array is: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < array.length; j++){
            array[j] = array[array.length - 1 - j];
        }
        System.out.println("The reversed array is: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}

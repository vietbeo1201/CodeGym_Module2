package B3;
import java.util.Arrays;
import java.util.Scanner;

public class InsertValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declare N given element
        double[] values = new double[10];
        values[0] = 1;
        values[1] = 3;
        values[2] = 5;
        values[3] = 7;
        values[4] = 15;
        values[5] = 12;
        values[6] = 20;
        values[7] = 30;
        values[8] = 40;
        values[9] = 50;

        System.out.println(Arrays.toString(values));
        // give element X
        System.out.println("Insert a value into the array: ");
        int InsertValue = sc.nextInt();
        // element X will before number insert Index + 1
        System.out.println("insert number " + InsertValue + " before the number: ");
        int AfterValue = sc.nextInt();
        for (int i = 0; i < values.length; i++) {   // the element before number X will have index + 1
            if (values[i] == AfterValue) {
                for (int j = values.length - 1; j > i; j--) {
                    values[j] = values[j - 1];
                }
                values[i + 1] = InsertValue;
            }
        }
        System.out.println(Arrays.toString(values));
    }
}

package B3;
import java.util.Arrays;
import java.util.Scanner;

public class Extende2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int o1 = sc.nextInt();
        int[] Array1 = new int[o1];
        for (int i = 0; i < o1; i++) {
            System.out.println("Enter the element number " + (i + 1) + " of the first array");
            Array1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array");
        int o2 = sc.nextInt();
        int[] Array2 = new int[o2];
        for (int i = 0; i < o2; i++) {
            System.out.println("Enter the element number " + (i + 1) + " of the second array");
            Array2[i] = sc.nextInt();
        }
        int o3 = o1 + o2;
        int[] Array3 = new int[o3];
        for (int i = 0; i < o3; i++) {
            if (i < o1){
                Array3[i] = Array1[i];
            }
            if (i >= o1){
                Array3[i] = Array2[i-o1];
            }
        }
        System.out.println(Arrays.toString(Array3));
    }
}

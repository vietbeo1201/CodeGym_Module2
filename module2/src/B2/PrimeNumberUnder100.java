package B2;

import java.util.Arrays;

public class PrimeNumberUnder100 {
    public static void main(String[] args) {
        int[] PrimeArray = new int[100];
        int number = 2;
        int counter = 0;
        // make a loop that run from 2 to 100
        for (int i = 0; i < PrimeArray.length; i++) {
            //if it true insert it into the created array
            if (isPrime(number)) {
                PrimeArray[counter] = number;
                counter++;
            }
            number++;
            if (number == 100) {
                System.out.println(Arrays.toString(PrimeArray));
                return;

            }
        }
    }
    //write a function to check the prime number in boolen
    public static boolean isPrime(int number) {
        if (number < 2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

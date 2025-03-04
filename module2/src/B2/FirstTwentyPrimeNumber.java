package B2;

import java.util.Arrays;

public class FirstTwentyPrimeNumber {
    public static void main(String[] args) {
        int[] num = new int[20];
        int count = 0;
        int number = 2;
        while (count < num.length) {
            if (checkPrime(number)) {
                num[count] = number;
                count++;
            }
            number++;
        }
        System.out.println(Arrays.toString(num));
    }

    public static boolean checkPrime(int number){
        if (number < 2){
            return false;
        }
        for ( int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    };
}

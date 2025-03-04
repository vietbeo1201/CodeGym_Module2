package B1;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Invalid number");
        }
        if (number < 10){
            System.out.println(one(number));
        }
        if (number > 10 && number < 20 ){
            System.out.println(under20(number));
        }
        if (number % 10 == 0){
            System.out.println(tens(number));
        }
        if (number >20 && number < 100){
            System.out.println(tens(number) + " " + ones(number));
        }
        if (number > 100){
            int hundred = number / 100;
            int ten = number % 100;
            System.out.println(ones(hundred) + " hundred " + " and " + tens(ten) + " " + ones(number));
        }
    }

    public static String one(int number){
        switch (number){
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            case 4 : return "four";
            case 5 : return "five";
            case 6 : return "six";
            case 7 : return "seven";
            case 8 : return "eight";
            case 9 : return "nine";
        }
        return "";
    }

    public static String ones(int number){
        int ones = number % 10;
        switch (ones){
            case 1:return "one";
            case 2:return "two";
            case 3:return "three";
            case 4:return "four";
            case 5:return "five";
            case 6:return "six";
            case 7:return "seven";
            case 8:return "eight";
            case 9:return "nine";
        }
        return "";
    }

    public static String tens(int number){
        int tens = number / 10;
        switch (tens){
            case 1: return "ten";
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
        }
        return "";
    }

    public static String under20(int number){
        switch (number){
            case 11 : return "eleven";
            case 12 : return "twelve";
            case 13 : return "thirteen";
            case 14 : return "fourteen";
            case 15 : return "fifteen";
            case 16 : return "sixteen";
            case 17 : return "seventeen";
            case 18 : return "eighteen";
            case 19 : return "nineteen";
        }
        return "";
    }
}

package B3;
import java.util.Scanner;

public class ExamCheck {
    public static void main(String[] args) {

        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int StudentNo = o1.nextInt();
        int[] StudentArray = new int[StudentNo];
        for (int i = 0; i < StudentNo; i++) {
            System.out.println("Enter the mark of student no: " + (i + 1));
            StudentArray[i] = o1.nextInt();
            if (StudentArray[i] > 7){
                System.out.println("The mark of student " + StudentArray[i] + " is pass");
            }
        }
        for (int i = 0; i < StudentArray.length; i++) {
            System.out.println("The mark of student No "+ (i + 1) + " is :" + StudentArray[i]);
            if (StudentArray[i] > 7){
                System.out.println("The mark of student " + StudentArray[i] + " is pass");
            }
        }
    }
}

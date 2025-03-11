package B3;
import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter the name of students : ");
        String student = sc.nextLine();
        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(student)) {
                System.out.println("the student " + student + " is found in the array in " + (i + 1) + "th array");
            }
        }
    }
}

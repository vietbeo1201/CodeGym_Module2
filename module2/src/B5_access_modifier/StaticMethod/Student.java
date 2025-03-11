package B5_access_modifier.StaticMethod;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    // constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + college);
    }
}

package B5_access_modifier.StaticMethod;

public class Main {
    public static void main(String[] args) {
        Student.change(); // calling change method

        // create object
        Student s1 = new Student(111, "Viet");
        Student s2 = new Student(222, "Hang");
        Student s3 = new Student(333, "Trang");
        Student s4 = new Student(444, "Ngoc");

        // calling display method
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}

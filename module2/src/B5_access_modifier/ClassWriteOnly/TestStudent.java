package B5_access_modifier.ClassWriteOnly;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setClasses("12A6");
        student.setName("Hong");
        student.Display();
    }
}

package B5_access_modifier.ClassWriteOnly;

public class Student {
    private String name;
    private String classes;

    public Student(){
        this.name = "No information";
        this.classes = "No information";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void Display(){
        System.out.println(this.name);
        System.out.println(this.classes);
    }
}

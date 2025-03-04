package B4_object.Fan;

public class Main {
    public static void main(String[] args) {
        Fan o1 = new Fan();
        o1.setSpeed(Fan.FAST);
        o1.setRadius(10);
        o1.setColor("yellow");
        o1.setOn(true);
        Fan o2 = new Fan();
        o2.setSpeed(Fan.MEDIUM);
        o2.setRadius(5);
        o2.setColor("blue");
        o2.setOn(false);

        System.out.println(o1);
        System.out.println(o2.toString());
    }
}

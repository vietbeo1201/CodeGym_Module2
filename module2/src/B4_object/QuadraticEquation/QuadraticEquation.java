package B4_object.QuadraticEquation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }
    // hàm khởi tạo(Controctor) java đã cho sẵn hàm không đối số khi không khai báo
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {

    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double delta(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public double Root1(){
        return (-this.b + Math.sqrt(delta()))/(2*a);
    }
    public double Root2(){
        return (-this.b - Math.sqrt(delta()))/(2*a);
    }
    public double Root12(){
        return -this.b/ 2*a;
    }
}

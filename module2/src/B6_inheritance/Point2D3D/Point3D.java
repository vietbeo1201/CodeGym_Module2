package B6_inheritance.Point2D3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    Point3D(){
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + ", y=" + getY() + ", z=" + z +  "}";
    }
}

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return 2 * Math.PI * (getHeight() * getRadius()) + 2 * Math.PI * getRadius() * this.height;
    }

    @Override
    public double getPerimeter(){
        return 0;
    }
    public double getVolume() {
        return Math.PI*(getRadius()*getRadius())*this.height;
    }
    @Override
    public String toString(){
        return super.toString()
                +", height of "
                + getHeight()
                +", volume of "
                +getVolume();
    }
}

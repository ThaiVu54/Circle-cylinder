public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        c1 = new Circle(1.0,"blue");
        System.out.println(c1);

        c1.setColor("red");
        c1.setRadius(1.4);
        System.out.println(c1);

        Cylinder c2 = new Cylinder();
        System.out.println(c2);

        c2.setColor("green");
        c2.setRadius(1.2);
        c2.setHeight(2);
        System.out.println(c2);
    }
}

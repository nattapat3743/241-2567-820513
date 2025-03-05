public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {

        super("Circle");
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("0");
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
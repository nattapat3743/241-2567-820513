import it.utils.shape.*;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputParameters();
        System.out.println("Circle Radius: "+ circle.getRadius());
        System.out.println("Circle Area: "+ circle.getArea());
        System.out.println("Circle Circumference: "+ circle.getCircumference());
        Triangle triangle = new Triangle();
        triangle.inputParameters();
        System.out.println("Triangle base: " + triangle.getBase()  + "height: " + triangle.getHeight());
        System.out.println("Triangle area: "+ triangle.getArea());
        Rectangle rectangle = new Rectangle();
        rectangle.inputParameters();
        System.out.println("Rectangle width: "+ rectangle.getWidth() +"height: " + rectangle.getHeight());
        System.out.println("Rectangle area: "+ rectangle.getArea());

    }
}

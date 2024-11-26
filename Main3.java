public class Main3 {
    public static void main(String[] args) {
        // Create instances of Circle and Triangle
        Circle circle = new Circle(5); // Radius = 5
        Triangle triangle = new Triangle(4, 6); // Base = 4, Height = 6

        // Circle operations
        System.out.println("Circle:");
        circle.drawShape();
        System.out.println("Area of Circle: " + circle.area());

        // Triangle operations
        System.out.println("\nTriangle:");
        triangle.drawShape();
        System.out.println("Area of Triangle: " + triangle.area());
    }
}

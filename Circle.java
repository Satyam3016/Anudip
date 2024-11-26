public class Circle implements Shape {
     int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

  
    public int area() {
        return (int) (Math.PI * radius * radius);
    }

    
    public void drawShape() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}

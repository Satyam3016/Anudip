public class Triangle implements Shape {
     int base;
     int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    
    public int area() {
        return (base * height) / 2;
    }

    
    public void drawShape() {
        System.out.println("Drawing a Triangle with base " + base + " and height " + height);
    }
}

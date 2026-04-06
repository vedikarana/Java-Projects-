public class Shapes {

   
    private double side;       
    private double base;        
    private double height;      
    private double radius;      
    private double length;      
    private double breadth;     

    public Shapes(double radius) {
        this.radius = radius;
    }

    public Shapes(double side, boolean isSquare) {
        this.side = side;
    }

    public Shapes(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Shapes(double base, double height, boolean isTriangle) {
        this.base   = base;
        this.height = height;
    }

    public double area(double r) {
        return Math.PI * r * r;
    }

    public double area(double s, boolean isSquare) {
        return s * s;
    }

    public double area(double len, double wid) {
        return len * wid;
    }

    public double area(double b, double h, boolean isTriangle) {
        return 0.5 * b * h;
    }


    public void displayCircleArea() {
        System.out.printf("Area of Circle    (r=%.1f)          : %.2f%n", radius, area(radius));
    }

    public void displaySquareArea() {
        System.out.printf("Area of Square    (side=%.1f)        : %.2f%n", side, area(side, true));
    }

    public void displayRectangleArea() {
        System.out.printf("Area of Rectangle (%.1f x %.1f)      : %.2f%n", length, breadth, area(length, breadth));
    }

    public void displayTriangleArea() {
        System.out.printf("Area of Triangle  (base=%.1f, h=%.1f): %.2f%n", base, height, area(base, height, true));
    }

    
    public static void main(String[] args) {

        Shapes circle    = new Shapes(7.0);
        Shapes square    = new Shapes(5.0, true);
        Shapes rectangle = new Shapes(8.0, 4.0);
        Shapes triangle  = new Shapes(6.0, 9.0, true);

        System.out.println("= Shape Areas ==");
        circle.displayCircleArea();
        square.displaySquareArea();
        rectangle.displayRectangleArea();
        triangle.displayTriangleArea();
        System.out.println("===");
    }
}

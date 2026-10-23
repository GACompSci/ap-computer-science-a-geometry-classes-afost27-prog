public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        Point a = new Point(MathTools.randInt(1, 100), MathTools.randInt(1, 100));
        Circle testCircle = new Circle(a, MathTools.randInt(1, 100));
        System.out.println("circle:  Radius: " + testCircle.getRadius() + "  Area: " +testCircle.getArea());
        
        Rectangle testRectangle = new Rectangle(a, MathTools.randInt(1, 100), MathTools.randInt(1, 100));
        System.out.println("rectangle:  Area:" + testRectangle.getArea());

        Point b = new Point(MathTools.randInt(0, 100),MathTools.randInt(0, 100));
        Point c = new Point(MathTools.randInt(0, 100),MathTools.randInt(0, 100));
        Point d = new Point(MathTools.randInt(0, 100),MathTools.randInt(0, 100));
        Triangle testTriangle = new Triangle(b, c, d);
        System.out.println("triangle:  Area:" + testTriangle.getArea());

    }
}

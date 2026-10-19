public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        Point a = new Point(MathTools.randInt(1, 100), MathTools.randInt(1, 100));
        Circle testCircle = new Circle(a, MathTools.randInt(1, 100));
        System.out.println("circle:  Radius: " + testCircle.getRadius() + "  Area: " +testCircle.getArea());
        
        Rectangle tesRectangle = new Rectangle(a, MathTools.randInt(1, 100), MathTools.randInt(1, 100));
        System.out.println("rectangle:  Area:" + tesRectangle.getArea());



    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        Point a = new Point(1, 0);
        Circle testCircle = new Circle(a, 10);
        System.out.println("Radius: " + testCircle.getRadius() + "  Area: " +testCircle.getArea());
        
       

    }
}

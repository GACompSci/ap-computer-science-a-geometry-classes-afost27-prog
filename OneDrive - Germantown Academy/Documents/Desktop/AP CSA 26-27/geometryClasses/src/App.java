public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        int x = 5;
        int y = 10;
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        System.out.println(MathTools.distance(a, b));

    }
}

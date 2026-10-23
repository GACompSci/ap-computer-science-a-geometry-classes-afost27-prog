public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point ia, Point ib, Point ic){
        a = ia;
        b = ib;
        c = ic;

    }

    public double getArea(){
      double side1 = MathTools.distance(a, b);
      double side2 = MathTools.distance(b, c);
      double side3 = MathTools.distance(a, c);
      double s = (side1 + side2 + side3)/2;
      double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
      return area;
    }
    

}

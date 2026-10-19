public class MathTools {
    //Create the static MathTools methods in this file
    //randInt(int min, int max)
    public static int randInt(int min, int max){
      return (int)(Math.random() * (max - min +1)) + min;
        }
    public static double round(int places, double number){
        double a = number * Math.pow(10, places);
        int rounded = (int)(a + 0.5);
        return rounded / Math.pow(10, places);
        }
    public static double distance(Point a, Point b){
      double d = Math.sqrt(Math.pow((a.getX()-b.getX()), 2) +Math.pow((a.getY()-b.getY()), 2));
      return round(5, d);
    }
    public static double slope(Point a, Point b){
      double slope = (a.getY() - b.getY())/(a.getX()-b.getX());
      return round(5, slope);
    }
    
}

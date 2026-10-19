public class Circle {
    private Point center;
    private int raduis;

    public Circle(Point icenter, int iraduis){
        center = icenter;
        raduis = iraduis;
    } 
    public int getRadius(){
        return raduis;
    }
    public double getArea(){
        return MathTools.round(5 , Math.PI *(Math.pow(raduis, 2)));
    }
    
}

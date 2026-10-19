public class Rectangle {
    Point topLeft;
    int length;
    int width;

    public Rectangle(Point itopLeft, int ilength, int iwidth){
        topLeft = itopLeft;
        length = ilength;
        width = iwidth;
    }
    public double getArea(){
        return MathTools.round(5, length*width);
    }
}

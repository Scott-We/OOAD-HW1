public class Triangle extends Shape{
    Triangle(double xc, double yc, double zc){
        super(xc, yc, zc);
    }

    public void print(){
        System.out.println("This is a Triangle centered at x: " + xCenter + ", y: " + yCenter + ", z: " + zCenter);
    }
}

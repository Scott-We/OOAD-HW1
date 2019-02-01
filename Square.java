public class Square extends Shape{
    Square(double xc, double yc, double zc){
        super(xc, yc, zc);
    }

    public void print(){
        System.out.println("This is a Square centered at x: " + xCenter + ", y: " + yCenter + ", z: " + zCenter);
    }
}

public class Circle extends Shape {
    Circle(double xc, double yc, double zc){
        super(xc, yc, zc);
    }

    public void print(){
        System.out.println("This is a Circle centered at x: " + xCenter + ", y: " + yCenter + ", z: " + zCenter);
    }
}

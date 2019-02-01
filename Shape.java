public class Shape implements Comparable<Shape>{
    protected double xCenter;
    protected double yCenter;
    protected double zCenter;

    Shape(double xc, double yc, double zc){
        xCenter = xc;
        yCenter = yc;
        zCenter = zc;
    }

    public void print(){
        System.out.println("This is a shape centered at x: " + xCenter + ", y: " + yCenter + ", z: " + zCenter);
    }

    double getZ(){
        return(zCenter);
    }

    @Override
    public int compareTo(Shape s){
        return((int)(zCenter - s.getZ()));
    }

}

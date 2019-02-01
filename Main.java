import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Note that +z is designated as towards the \"camera\".");

        Random rand = new Random();

        //Shape a = new Square(5.0, 3.0, 2.0);
        //Shape b = new Triangle(5.0, 3.0, 3.0);
        //Shape c = new Circle(5.0, 3.0, -5.0);

        int num = 5 + rand.nextInt(20);

        ArrayList<Shape> shapes = new ArrayList<>();

        for(int x = 0; x < num; x++){
            int t = rand.nextInt(3);
            switch(t){
                case 0:
                    shapes.add(new Circle(rand.nextInt(50)-25.0, rand.nextInt(50)-25.0, rand.nextInt(50)-25.0));
                    break;
                case 1:
                    shapes.add(new Triangle(rand.nextInt(50)-25.0, rand.nextInt(50)-25.0, rand.nextInt(50)-25.0));
                    break;
                case 2:
                    shapes.add(new Square(rand.nextInt(50)-25.0, rand.nextInt(50)-25.0, rand.nextInt(50)-25.0));
                    break;
            }
        }


        System.out.println("There are " + shapes.size() + " shapes");

        Collections.sort(shapes);

        for(Shape s : shapes){
            s.print();
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(100, 200, "Red", 10, 20);
        Circle c1 = new Circle(100, 200, "Red", 15);
        Shape s1 = new Circle(500, 300, "Green", 15);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(r1);
        shapes.add(c1);
        shapes.add(s1);

        for (Shape s : shapes) {
            s.draw();
        }
        System.out.println(Shape.numShapes);
    }
}

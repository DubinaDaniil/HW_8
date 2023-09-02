import shape.*;
import shape.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getShapeName(new Circle()));
        System.out.println(shape.getShapeName(new Quad()));
        System.out.println(shape.getShapeName(new Triangle()));
        System.out.println(shape.getShapeName(new Rectangle()));
        System.out.println(shape.getShapeName(new Cube()));
    }
}
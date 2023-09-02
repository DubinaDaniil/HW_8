package shape;


public class Shape {

    public String getShapeName(ShapeGetter shapeGetter) {
        return shapeGetter.getShapeName(this);
    }

}

package shape.shapes;

import shape.*;

public class Triangle extends ShapeGetter {

    @Override
    public String getShapeName(final Shape shape) {
        return this.getClass().getSimpleName();
    }
}

package eg1;

public class ShapeFactoryAbs extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new CircleFactoryImpl();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new RectangleFactoryImpl();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new SquareFactoryImpl();
        }
        return null;
    }
}
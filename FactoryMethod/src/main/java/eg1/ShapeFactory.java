package eg1;

public class ShapeFactory {

    public Shape getShape(String shapeType) throws Exception {

        if(shapeType == null ){
            return null;
        }else if(shapeType.equalsIgnoreCase("circle")){
            return new CircleFactoryImpl();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new RectangleFactoryImpl();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new SquareFactoryImpl();
        }else {
            throw new Exception("shapeType error...");
        }
    }

}

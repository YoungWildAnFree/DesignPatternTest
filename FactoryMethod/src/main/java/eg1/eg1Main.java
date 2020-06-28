package eg1;

public class eg1Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        try {
            shapeFactory.getShape("Rectangle").draw();
            shapeFactory.getShape("Circle").draw();
            shapeFactory.getShape("Square").draw();

            shapeFactory.getShape("aaa").draw();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

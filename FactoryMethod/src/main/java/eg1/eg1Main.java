package eg1;

public class eg1Main {

    public static void main(String[] args) {

        System.out.println("工厂方法");
        ShapeFactory shapeFactory = new ShapeFactory();
        try {
            shapeFactory.getShape("Rectangle").draw();
            shapeFactory.getShape("Circle").draw();
            shapeFactory.getShape("Square").draw();

//            shapeFactory.getShape("aaa").draw();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
         * */
        System.out.println("抽象工厂方法");
        AbstractFactory shape = FactoryProducer.getFactory("Shape");
        shape.getShape("Rectangle").draw();


    }

}

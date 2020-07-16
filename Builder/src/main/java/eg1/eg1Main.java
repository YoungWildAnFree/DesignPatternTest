package eg1;

public class eg1Main {
    /**
     * 定义：
     *         将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。生成器模式利用一个导演者对象和具体建造者对象一个一个地建造出所有的零件，从而建造出完整的对象。
     *
     * 四个要素：
     *
     *         Builder：生成器接口，定义创建一个Product对象所需要的各个部件的操作。
     *         ConcreteBuilder：具体的生成器实现，实现各个部件的创建，并负责组装Product对象的各个部件，同时还提供一个让用户获取组装完成后的产品对象的方法。
     *         Director：指导者，也被称导向者，主要用来使用Builder接口，以一个统一的过程来构建所需要的Product对象。
     *         Product：产品，表示被生成器构建的复杂对象，包含多个部件。
     *
     * 生成器模式（Builder）是使用多个“小型”工厂来最终创建出一个完整对象。
     * 当我们使用Builder的时候，一般来说，是因为创建这个对象的步骤比较多，每个步骤都需要一个零部件，最终组合成一个完整的对象。
     *
     * */

    public static void main(String[] args) {
        House house = new House();
        IBuilder builderImplP = new BuilderImplP(house);
        Director director = new Director(builderImplP);
        director.builder();


        IBuilder builderImplS = new BuilderImplS(house);
        Director director1 = new Director(builderImplS);
        director1.builder();
    }

}

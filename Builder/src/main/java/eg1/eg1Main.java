package eg1;

public class eg1Main {

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

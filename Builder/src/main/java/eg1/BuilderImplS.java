package eg1;

public class BuilderImplS  implements IBuilder {

    private House house;

    public BuilderImplS(House house) {
        this.house = house;
    }
    @Override
    public void createArea() {
        house.area =2;
        System.out.println("house.area =2");

    }

    @Override
    public void createSleeping() {
        house.sleep=2;
        System.out.println("house.sleep=2");


    }

    @Override
    public void createCarNum() {
        house.carNum =2;
        System.out.println("house.carNum =2");

    }

    @Override
    public void createToliet() {
        house.toliet=2;
        System.out.println("house.toliet=2");

    }

    @Override
    public House createHouse() {
        System.out.println("builde...");
        createArea();
        createSleeping();
        createCarNum();
        createToliet();
        return this.house;
    }
}

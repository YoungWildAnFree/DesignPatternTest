package eg1;

public class BuilderImplP implements IBuilder{

    private House house;


    public BuilderImplP(House house) {
        this.house = house;
    }


    @Override
    public void createArea() {
        house.area =1;
        System.out.println("house.area =1");

    }

    @Override
    public void createSleeping() {
        house.sleep=1;
        System.out.println("house.sleep=1");


    }

    @Override
    public void createCarNum() {
        house.carNum =1;
        System.out.println("house.carNum =1");

    }

    @Override
    public void createToliet() {
        house.toliet=1;
        System.out.println("house.toliet=1");

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

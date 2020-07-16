package eg1;

public class Director {
    private IBuilder ibuilder;

    public Director(IBuilder ibuilder) {
        this.ibuilder = ibuilder;
    }

    public void builder(){
        ibuilder.createHouse();
    }
}

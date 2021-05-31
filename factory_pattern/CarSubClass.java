package factory_pattern;

public class CarSubClass extends VehicleSuperClass{

    private int tyres;
    private String type;

    @Override
    public int getTyres() {
        return this.tyres;
    }

    @Override
    public String getType() {
        return this.type;
    }

    CarSubClass(int tyres,String type) {
        this.tyres = tyres;
        this.type = type;
    }
}

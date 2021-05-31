package factory_pattern;

public class BikeSubClass extends VehicleSuperClass{

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

    BikeSubClass(int tyres,String type) {
        this.tyres = tyres;
        this.type = type;
    }
}

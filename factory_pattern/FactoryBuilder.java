package factory_pattern;

public class FactoryBuilder {

    public static VehicleSuperClass getVehicle(String inpuString) {
        if(inpuString.equals("CAR")){
            return new CarSubClass(4, "CAR");
        } else {
            return new BikeSubClass(2, "BIKE");
        }
    }
}
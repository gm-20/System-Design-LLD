import factory_pattern.FactoryBuilder;
import factory_pattern.VehicleSuperClass;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        
        VehicleSuperClass car = FactoryBuilder.getVehicle("CAR");
        System.out.println(car.getTyres());

        VehicleSuperClass bike = FactoryBuilder.getVehicle("BIKE");
        System.out.println(bike.getTyres());

    }

}
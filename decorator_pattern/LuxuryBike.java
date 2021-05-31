package decorator_pattern;

public class LuxuryBike extends BikeDecorator{

    public LuxuryBike(Bike c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Luxury Bike");
    }
}

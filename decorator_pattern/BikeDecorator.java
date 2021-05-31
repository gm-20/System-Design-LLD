package decorator_pattern;

public class BikeDecorator implements Bike{

    protected Bike car;

    public BikeDecorator(Bike c){
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

package decorator_pattern;

public class SportsBike extends BikeDecorator{

    public SportsBike(Bike c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Sports Bike");
    }
    
}

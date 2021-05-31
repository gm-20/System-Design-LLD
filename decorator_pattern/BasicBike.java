
package decorator_pattern;

/**
 * BasicCar
 */
public class BasicBike implements Bike{

    @Override
    public void assemble() {
        System.out.println("Basic Bike");
    }

    
}
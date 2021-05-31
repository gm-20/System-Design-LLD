import decorator_pattern.BasicBike;
import decorator_pattern.Bike;
import decorator_pattern.LuxuryBike;
import decorator_pattern.SportsBike;

/**
 * DecoratorPatternDemo
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        
        Bike luxuryBike = new LuxuryBike(new SportsBike(new BasicBike()));
        luxuryBike.assemble();


        

    }
    
}
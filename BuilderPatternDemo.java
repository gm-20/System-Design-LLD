import builder_pattern.Car;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Car car1 = new Car.CarBuilder("TATA","12345").setColor("black").build();
        System.out.println(car1);
        
        car1 = car1.toBuilder().setMusicPlayer("JBL").build();
        System.out.println(car1.getCc());
    }
    
}

package builder_pattern;

public class Car {

    private String brand;
    private String cc;
    
    private String color;
    private String musicPlayer;

    public String getBrand(){
        return this.brand;
    }
    public String getCc(){
        return this.cc;
    }
    public String getColor(){
        return this.color;
    }
    public String getMusicPlayer(){
        return this.musicPlayer;
    }



    private Car(CarBuilder carBuilder){
        this.brand = carBuilder.brand;
        this.cc = carBuilder.cc;
        this.color = carBuilder.color;
        this.musicPlayer = carBuilder.musicPlayer;
    }

    public CarBuilder toBuilder(){

        CarBuilder obj = new CarBuilder(this.brand,this.cc);
        return obj;
    }

    public static class CarBuilder{

        private String brand;
        private String cc;
        
        private String color;
        private String musicPlayer;

        public CarBuilder(String brand,String cc){
            this.brand = brand;
            this.cc  = cc;
        }

        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public CarBuilder setMusicPlayer(String musicPlayer){
            this.musicPlayer= musicPlayer;
            return this;
        }
        
        public Car build(){
            return new Car(this);
        }


    }

}

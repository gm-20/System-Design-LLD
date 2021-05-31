package singelton_pattern;

public class SingeltonClass {


    //Classic method => Not thread safe
    // private static SingeltonClass obj = null;

    // private SingeltonClass(){};

    // public static SingeltonClass getInstance(){

    //     if(obj == null){
    //         obj = new SingeltonClass();
    //     }
    //     return obj;
    // }

    //Thread safe method
    private static SingeltonClass obj = new SingeltonClass();

    private SingeltonClass(){};   
    public static SingeltonClass getInstance(){
        return obj;
    }

    //Functinalities

    public void connectToDatabase(){
        System.out.println("Connecting to database");
    }

}
import singelton_pattern.SingeltonClass;

public class SingeltonPatternDemo implements Runnable {

    public static void main(String[] args) {
        
        SingeltonClass obj = SingeltonClass.getInstance();
        System.out.println(obj);
        obj.connectToDatabase();
        SingeltonClass obj2 = SingeltonClass.getInstance();
        System.out.println(obj2);

        //Using thread
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("T1");
                SingeltonClass obj = SingeltonClass.getInstance();
                System.out.println(obj);
            }
        };

        Runnable r2 = new Runnable(){
            public void run(){
                System.out.println("T2");
                SingeltonClass obj2 = SingeltonClass.getInstance();
                System.out.println(obj2);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    
    }

    @Override
    public void run() {
    }        
}

import prototype_pattern.Mobile;

public class PrototypePatternDemo {
    public static void main(String[] args) {

        try {
            Mobile m1 = new Mobile();
            m1.loadData();
    
            Mobile m2 = (Mobile)m1.clone();
            System.out.println(m2.getMobileList());
                      
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}

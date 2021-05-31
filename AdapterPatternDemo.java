import adapter_pattern.AssignmentWork;
import adapter_pattern.Pen;
import adapter_pattern.PenAdapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(p);
        aw.write("Hello from Adapter pattern");

    }
    
}

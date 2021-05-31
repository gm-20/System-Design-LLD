package composite_pattern;

public class CircleLeafComponent implements ShapeBaseComponent{

    @Override
    public void draw() {
        System.out.println("Circle Drawn");
        
    }
    
}

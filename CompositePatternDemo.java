import composite_pattern.CircleLeafComponent;
import composite_pattern.DrawingComposite;
import composite_pattern.SquareLeafComponent;

public class CompositePatternDemo {

    public static void main(String[] args) {
        DrawingComposite d = new DrawingComposite();
        d.addShape(new CircleLeafComponent());
        d.addShape(new SquareLeafComponent());
        
        d.draw();

    }
    
}

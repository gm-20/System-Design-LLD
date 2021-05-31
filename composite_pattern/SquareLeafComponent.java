package composite_pattern;

public class SquareLeafComponent implements ShapeBaseComponent {

    @Override
    public void draw() {
        System.out.println("Square Drawn");
    }
    
}

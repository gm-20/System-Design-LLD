package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class DrawingComposite implements ShapeBaseComponent{

    List<ShapeBaseComponent> shapes = new ArrayList<ShapeBaseComponent>();

    @Override
    public void draw() {
        
        for (ShapeBaseComponent s : shapes) {
            s.draw();
        }
        
    }

    public void addShape(ShapeBaseComponent s){
        this.shapes.add(s);
    }

    public void removeShape(ShapeBaseComponent s){
        this.shapes.remove(s);
    }

}

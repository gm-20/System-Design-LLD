package adapter_pattern;

public class AssignmentWork {
    
    Pen p;

    public void setPen(Pen p){
        this.p = p;
    }

    public Pen getPen(){
        return this.p;
    }

    public void write(String str){
        p.write(str);
    }

}

package prototype_pattern;

import java.util.ArrayList;

public class Mobile implements Cloneable{


    ArrayList<String> mobileList;

    public Mobile(){
        mobileList = new ArrayList<String>();
    }

    public Mobile(ArrayList<String> mobileList){
        this.mobileList = mobileList;
    }

    public void loadData(){
        mobileList.add("OnePlus");
        mobileList.add("Samsung");
        mobileList.add("Apple");
        mobileList.add("Realme");
    }

    public ArrayList<String> getMobileList(){
        return mobileList;
    }

    // Overridden to provide a deep copy of mobileList
    @Override
    public Object clone() throws CloneNotSupportedException{

        ArrayList<String> temp = new ArrayList<String>();

        for(String s : this.getMobileList()){
            temp.add(s);
        }
        return new Mobile(temp);
    }
}

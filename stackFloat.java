
import java.util.ArrayList;

public class stackFloat {
    ArrayList<Float> stakF = new ArrayList<Float>();
    int top = -2;

    public void push(Float value){
        top = top+2;
        stakF.add(top, value);

    }

    public float pop(){

        float value = 0;
        stakF.get(top);
        stakF.remove(top);
        top = top-2;

        return value;
    }

    public void cetak(){

        System.out.println(stakF);
    }
}

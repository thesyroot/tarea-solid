package Views.Shower;

import java.util.List;

public class GenericShower {
    public void show(String element){
        System.out.print(element);
    }

    public <T> void showFromList(List<T> list){
        for(T obj : list) System.out.println(obj);
    }
}

package Observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observe> list=new ArrayList<Observe>();

    public void registerObserve(Observe obs){
        list.add(obs);
    }
    public void removeObserve(Observe obs){
        list.remove(obs);
    }

    public void notifyAllObserves(){//通知所有观察者更新状态
        for (Observe obs:list){
            obs.update(this);
        }
    }

}

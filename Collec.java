
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collec {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("刘备");
        c.add("关羽");
        c.add("张飞");
        c.add("诸葛亮");
        c.add("赵云");
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}

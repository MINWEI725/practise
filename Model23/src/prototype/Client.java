package prototype;

import java.util.Date;

public class Client {
    public static void main(String[]args) throws Exception{
        Sheep s1=new Sheep("少理",new Date(122333331L));

        Sheep s2=(Sheep)s1.clone();
    }
}

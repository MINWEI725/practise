package adapter;

public class Client {
    public void test1(Target t){
        t.handleReq();
    }
    public static void main(String[]args){
        Client c=new Client();
        Adpatee a=new Adpatee();
        Target t=new Adapter();
        Target t2=new Adapter2(a);
        c.test1(t);
        c.test1(t2);
    }
}

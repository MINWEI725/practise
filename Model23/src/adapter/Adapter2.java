package adapter;
//这一种是对象适配器
public class Adapter2 implements Target {
    private Adpatee adpatee;
    @Override
    public void handleReq() {
       adpatee.request();
    }

    public Adapter2(Adpatee adpatee) {
        super();
        this.adpatee = adpatee;
    }
}

package adapter;
//适配器本身   这一种是类适配器方式
public class Adapter  extends  Adpatee implements Target{
    @Override
   public void handleReq(){
         super.request();
    }
}

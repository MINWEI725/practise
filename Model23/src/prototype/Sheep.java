package prototype;

import java.util.Date;

public class Sheep implements  Cloneable{
    private String name;
    private Date brithday;
    @Override
    protected Object clone() throws CloneNotSupportedException {
       Object obj=super.clone();

       //添加如下代码实现深复制
        Sheep s=(Sheep)obj;
        s.brithday=(Date)this.brithday.clone();

       return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
    public Sheep(){}

    public Sheep(String name, Date brithday) {
        super();
        this.name = name;
        this.brithday = brithday;
    }
}

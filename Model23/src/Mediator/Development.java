package Mediator;

public class Development implements Department {
    private Mediator m;//持有中介者（经理）的引用

    public Development(Mediator m) {
        super();
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
         System.out.println("专心干自己事");
    }

    @Override
    public void outAction() {
        System.out.println("报告没钱");
    }
}

package Mediator;

public class Market implements Department {
    private Mediator m;

    public Market(Mediator m) {
        super();
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("接项目");
    }

    @Override
    public void outAction() {
        System.out.println("报告项目用资金");
        m.command("finacial");
    }
}

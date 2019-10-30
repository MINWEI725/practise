package Mediator;

public class Client {
    public static void main(String[]args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development delp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();

    }
}

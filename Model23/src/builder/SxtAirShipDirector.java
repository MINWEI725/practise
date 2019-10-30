package builder;

public class SxtAirShipDirector implements  AirShipDirector {

    private AirShipBuilder builder;
    public  SxtAirShipDirector(AirShipBuilder builder){this.builder=builder;}
    @Override
    public AirShip createAirShip() {
        Engine e=builder.builderEngine();
        OrbitalModule o=builder.builderOrbitalModule();
        EscapeTower et=builder.builderEscapeTower();

        AirShip ship=new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);

        return null;
    }
}

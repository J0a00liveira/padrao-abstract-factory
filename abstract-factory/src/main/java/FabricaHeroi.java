public class FabricaHeroi implements FabricaAbstrata {

    @Override
    public Arma createArma() {
        return new ArmaHeroi();
    }

    @Override
    public Armadura createArmadura() {
        return new ArmaduraHeroi();
    }
}

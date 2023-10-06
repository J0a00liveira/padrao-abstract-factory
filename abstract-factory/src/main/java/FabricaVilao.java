public class FabricaVilao implements FabricaAbstrata {

    @Override
    public Arma createArma() {
        return new ArmaVilao();
    }

    @Override
    public Armadura createArmadura() {
        return new ArmaduraVilao();
    }
}

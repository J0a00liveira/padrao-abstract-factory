public class Personagem {

    private Arma arma;
    private Armadura armadura;

    public Personagem (FabricaAbstrata fabrica) {
        this.arma = fabrica.createArma();
        this.armadura = fabrica.createArmadura();
    }

    public String equiparArma() {
        return this.arma.equipar();
    }

    public String equiparArmadura() { return this.armadura.equipar();
    }
}

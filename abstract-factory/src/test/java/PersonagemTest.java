import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveEquiparArmaHeroi() {
        FabricaAbstrata fabrica = new FabricaHeroi();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Heroi equipado com arma", personagem.equiparArma());
    }

    @Test
    void deveEquiparArmaduraHeroi() {
        FabricaAbstrata fabrica = new FabricaHeroi();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Heroi equipado com armadura", personagem.equiparArmadura());
    }

    @Test
    void deveEquiparArmaVilao() {
        FabricaAbstrata fabrica = new FabricaVilao();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Vilao equipado com arma", personagem.equiparArma());
    }

    @Test
    void deveEquiparArmaduraVilao() {
        FabricaAbstrata fabrica = new FabricaVilao();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Vilao equipado com armadura", personagem.equiparArmadura());
    }

}
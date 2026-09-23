package game;

/**
 * PADRÃO FACTORY METHOD - Produto Concreto 2
 * Representa o inimigo característico do Sertão.
 */
public class Cangaceiro implements Enemy {
	@Override
    public void attack() {
        System.out.println("Cangaceiro do Sertão ataca com carabina e facão!");
    }
}

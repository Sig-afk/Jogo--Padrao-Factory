package game;

/**
 * PADRÃO FACTORY METHOD - Produto Concreto 1
 * Representa o inimigo característico da Amazônia.
 */
public class MutantAnimal implements Enemy {
	@Override
    public void attack() {
        System.out.println("Animal Mutante da Amazônia ataca com garras e dentes ferozes!");
    }
}

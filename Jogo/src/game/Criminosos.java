package game;

/**
 * PADRÃO FACTORY METHOD - Produto Concreto 3
 * Representa o inimigo característico do Rio de Janeiro.
 */
public class Criminosos implements Enemy {
	@Override
    public void attack() {
        System.out.println("Criminosos do Rio de Janeiro atacam com fuzio e metralhadora!");
    }
}

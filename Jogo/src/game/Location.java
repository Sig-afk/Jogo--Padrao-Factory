package game;

/**
 * PADRÃO FACTORY METHOD - Criador Abstrato (Abstract Creator)
 * 
 * O que é: Define a estrutura das fases do jogo e o Factory Method abstrato.
 * 
 * - Onde está o padrão? No método abstrato createEnemy() e no método
 *   spawnEnemyAndAttack() que usa o produto sem saber sua classe concreta.
 * - Princípio SOLID: Cumpre o OCP (Open/Closed Principle) e DIP (Dependency Inversion).
 */
public abstract class Location {
	/**
     * ESTE É O FACTORY METHOD!
     * É abstrato para obrigar cada subclasse (fase) a decidir qual
     * classe concreta de Enemy instanciar.
     */
    protected abstract Enemy createEnemy();

    /**
     * Lógica de alto nível da fase que orquestra a criação e o ataque do inimigo.
     */
    public void spawnEnemyAndAttack() {
    	// Invoca o Factory Method para obter o produto
        Enemy enemy = createEnemy();
     // Usa o produto genérico
        enemy.attack();
    }

}

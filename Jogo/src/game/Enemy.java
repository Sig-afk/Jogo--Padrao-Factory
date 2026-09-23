package game;

/**
 * PADRÃO FACTORY METHOD - Produto Abstrato (Abstract Product)
 * 
 * O que é: Interface que define o contrato comum para todos os tipos de inimigos.
 * 
 * - Onde está o padrão? É a abstração do produto gerado pelas fábricas.
 * - Garante que o jogo possa mandar um inimigo atacar sem saber se ele é um
 *   MutantAnimal, Cangaceiro ou Criminoso.
 */
public interface Enemy {
	/**
     * Ação genérica que todo inimigo deve realizar.
     */
	void attack();

}

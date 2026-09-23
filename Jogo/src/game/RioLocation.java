package game;

/**
 * PADRÃO FACTORY METHOD - Criador Concreto 3 (Concrete Creator)
 * 
 * - Exemplo de como ESCALONAR o Factory Method!
 * - Adicionamos o Rio de Janeiro criando apenas RioLocation e Criminosos,
 *   sem alterar absolutamente NADA no código base (Location, Enemy, etc).
 */
public class RioLocation extends Location {
	@Override
    protected Enemy createEnemy() {
        return new Criminosos();
    }

}

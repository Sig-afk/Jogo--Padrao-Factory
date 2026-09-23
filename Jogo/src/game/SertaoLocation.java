package game;

/**
 * PADRÃO FACTORY METHOD - Criador Concreto 2 (Concrete Creator)
 */
public class SertaoLocation extends Location {
	@Override
    protected Enemy createEnemy() {
		// Fábrica concreta decidindo criar o produto do Sertão
        return new Cangaceiro();
    }
}

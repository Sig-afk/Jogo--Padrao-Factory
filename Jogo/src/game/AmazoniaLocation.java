package game;

/**
 * PADRÃO FACTORY METHOD - Criador Concreto 1 (Concrete Creator)
 */
public class AmazoniaLocation extends Location {
	@Override
    protected Enemy createEnemy() {
		// Fábrica concreta decidindo criar o produto da Amazônia
        return new MutantAnimal();
    }
}

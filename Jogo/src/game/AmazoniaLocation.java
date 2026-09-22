package game;

public class AmazoniaLocation extends Location {
	@Override
    protected Enemy createEnemy() {
        return new MutantAnimal();
    }
}

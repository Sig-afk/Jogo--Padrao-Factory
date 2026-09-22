package game;

public class RioLocation extends Location {
	@Override
    protected Enemy createEnemy() {
        return new Criminosos();
    }

}

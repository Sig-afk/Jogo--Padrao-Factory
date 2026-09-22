package game;

public abstract class Location {
	// Factory Method
    protected abstract Enemy createEnemy();

    // Lógica de negócio comum que usa o produto fornecido pela fábrica
    public void spawnEnemyAndAttack() {
        Enemy enemy = createEnemy();
        enemy.attack();
    }

}

package game;

/**
 * Simulação e cliente do jogo.
 */
public class Main {
	public static void main(String[] args) {
        System.out.println("--- Iniciando Fase 1: Amazônia ---");
        Location location = new AmazoniaLocation();
        location.spawnEnemyAndAttack();

        System.out.println("\n--- Iniciando Fase 2: Sertão ---");
        location = new SertaoLocation();
        location.spawnEnemyAndAttack();
        
        System.out.println("\n--- Iniciando Fase 3: Rio de Janeiro ---");
        location = new RioLocation();
        location.spawnEnemyAndAttack();
    }
}

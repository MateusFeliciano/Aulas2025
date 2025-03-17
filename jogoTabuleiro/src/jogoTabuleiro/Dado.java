package jogoTabuleiro;
import java.util.Random;

public class Dado {
	 private int numeroAtual;

	    public int rolar() {
	        Random random = new Random();
	        numeroAtual = random.nextInt(6) + 1; // Número entre 1 e 6
	        return numeroAtual;
	    }
}

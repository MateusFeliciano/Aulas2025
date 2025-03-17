package jogoTabuleiro;

public class Jogador {
	public int casaAtual;
    public int meuNumero;

    public Jogador(int numero) {
        this.meuNumero = numero;
        this.casaAtual = 0; // Começa na casa 0
    }

    public void jogar(int valorDado, int limiteCasas) {
        casaAtual += valorDado;
        if (casaAtual >= limiteCasas) {
            casaAtual = limiteCasas;
            System.out.println("Jogador " + meuNumero + " venceu!");
        } else {
            System.out.println("Jogador " + meuNumero + " está na casa " + casaAtual);
        }
    }
}

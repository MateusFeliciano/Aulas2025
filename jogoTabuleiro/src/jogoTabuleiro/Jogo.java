package jogoTabuleiro;
import java.util.ArrayList;

public class Jogo {
	 private Tabuleiro meuTabuleiro;
	    private ArrayList<Jogador> meusJogadores;
	    private Dado meuDado;
	    private int turnoAtual;

	    public Jogo(int numeroJogadores, int numeroCasas) {
	        meuTabuleiro = new Tabuleiro(numeroCasas);
	        meusJogadores = new ArrayList<>();
	        meuDado = new Dado();
	        turnoAtual = 0;

	        for (int i = 1; i <= numeroJogadores; i++) {
	            meusJogadores.add(new Jogador(i));
	        }
	    }

	    public void proximaJogada() {
	        if (turnoAtual >= meusJogadores.size()) {
	            turnoAtual = 0; // Reinicia os turnos
	        }

	        Jogador jogadorAtual = meusJogadores.get(turnoAtual);
	        int resultadoDado = meuDado.rolar();

	        System.out.println("Jogador " + jogadorAtual.meuNumero + " rolou " + resultadoDado);
	        jogadorAtual.jogar(resultadoDado, meuTabuleiro.numeroCasas);

	        turnoAtual++;
	    }

	    public void informarPosicoes() {
	        for (Jogador jogador : meusJogadores) {
	            System.out.println("Jogador " + jogador.meuNumero + " está na casa " + jogador.casaAtual);
	        }
	    }
}

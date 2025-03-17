package jogoTabuleiro;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Jogo jogo = null;
        int opcao;

        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Iniciar nova partida");
            System.out.println("2 - Executar jogada");
            System.out.println("3 - Informar posições");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos jogadores? ");
                    int numJogadores = scanner.nextInt();
                    System.out.print("Quantas casas no tabuleiro? ");
                    int numCasas = scanner.nextInt();
                    jogo = new Jogo(numJogadores, numCasas);
                    System.out.println("Nova partida iniciada!");
                    break;

                case 2:
                    if (jogo != null) {
                        jogo.proximaJogada();
                    } else {
                        System.out.println("Inicie uma partida primeiro!");
                    }
                    break;

                case 3:
                    if (jogo != null) {
                        jogo.informarPosicoes();
                    } else {
                        System.out.println("Inicie uma partida primeiro!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
	}

}

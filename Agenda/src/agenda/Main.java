package agenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("\n--- Agenda de Compromissos ---");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromissos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            if (opcao == 1) {
                System.out.print("Descrição do compromisso: ");
                String descricao = scanner.nextLine();

                System.out.print("Data de início (dd/MM/yyyy): ");
                LocalDate dataInicio = LocalDate.parse(scanner.nextLine(), formatter);

                System.out.print("Data de fim (dd/MM/yyyy): ");
                LocalDate dataFim = LocalDate.parse(scanner.nextLine(), formatter);

                agenda.adicionarCompromisso(new Compromisso(dataInicio, dataFim, descricao));

            } else if (opcao == 2) {
                System.out.print("Verificar compromissos nos próximos quantos dias? ");
                int dias = scanner.nextInt();
                agenda.verificarCompromissos(dias);

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();

	}

}

package funci;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();

        System.out.print("Salário Bruto: ");
        func.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println("\nDados do funcionário: " + func);

        System.out.print("\nDigite a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        func.aumentarSalario(porcentagem);

        System.out.println("\nDados atualizados: " + func);

        sc.close();

	}

}

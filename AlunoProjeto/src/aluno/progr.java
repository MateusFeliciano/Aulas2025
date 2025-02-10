package aluno;

import java.util.Locale;
import java.util.Scanner;

public class progr {
	 public static void main(String[] args) {
	        Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        Estudante aluno = new Estudante();

	        System.out.print("Nome do aluno: ");
	        aluno.nome = sc.nextLine();

	        System.out.print("Nota do 1º trimestre (0 a 30): ");
	        aluno.nota1 = sc.nextDouble();

	        System.out.print("Nota do 2º trimestre (0 a 35): ");
	        aluno.nota2 = sc.nextDouble();

	        System.out.print("Nota do 3º trimestre (0 a 35): ");
	        aluno.nota3 = sc.nextDouble();

	        System.out.println("\n" + aluno);

	        sc.close();
	    }
}

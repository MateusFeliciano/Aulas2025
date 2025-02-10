package ret;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        Retangulo ret = new Retangulo();

	        System.out.print("Digite a largura do retângulo: ");
	        ret.largura = sc.nextDouble();

	        System.out.print("Digite a altura do retângulo: ");
	        ret.altura = sc.nextDouble();

	        System.out.printf("Área: %.2f%n", ret.calcularArea());
	        System.out.printf("Perímetro: %.2f%n", ret.calcularPerimetro());
	        System.out.printf("Diagonal: %.2f%n", ret.calcularDiagonal());

	        sc.close();
	    }
	}

	



package camb;

import java.util.Locale;
import java.util.Scanner;

public class pgr {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Cotação do dólar: ");
	        double cotacaoDolar = sc.nextDouble();

	        System.out.print("Quantidade de dólares a comprar: ");
	        double valorDolares = sc.nextDouble();

	        double valorEmReais = currencyConvert.calcularValorEmReais(cotacaoDolar, valorDolares);

	        System.out.printf("Valor a ser pago em reais: R$ %.2f%n", valorEmReais);

	        sc.close();
	}

}

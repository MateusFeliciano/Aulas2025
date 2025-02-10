package camb;

public class currencyConvert {
	public static final double IOF = 0.06; // 6% de IOF

    public static double calcularValorEmReais(double cotacaoDolar, double valorDolares) {
        double valorBruto = cotacaoDolar * valorDolares;
        double imposto = valorBruto * IOF;
        return valorBruto + imposto;
    }
}

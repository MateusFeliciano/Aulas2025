package ret;

public class Retangulo {
	public double largura;
    public double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
}


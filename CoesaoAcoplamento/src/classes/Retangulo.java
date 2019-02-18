package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Retangulo implements FigurasGeometricas {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return largura * altura;
	}

	@Override
	public double calculaPerimetro() {

		return (2 * altura) + (2 * largura);

	}

	@Override
	public void imprimeArea() {
		System.out.println("A area deste retangulo eh: " + calculaArea());
	}

	@Override
	public void imprimePerimetro() {
		System.out.println("O perimetro do retangulo eh: " + calculaPerimetro());
	}

	@Override
	public String toString() {
		return "O retangulo criado tem altura de tamanho:  " + altura + " e largura de tamanho: " + largura;
	}
}

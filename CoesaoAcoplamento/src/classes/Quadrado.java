package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Quadrado implements FigurasGeometricas {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLargura() {
		return lado;
	}

	public void setLargura(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {

		return 2 * lado;

	}

	@Override
	public double calculaPerimetro() {

		return 4 * lado;

	}

	@Override
	public void imprimeArea() {
		System.out.println("A area deste quadrado eh: " + calculaArea());
	}

	@Override
	public void imprimePerimetro() {
		System.out.println("O perimetro do quadrado eh: " + calculaPerimetro());
	}

	@Override
	public String toString() {
		return "O quadrado criado tem lados de tamanho:  " + lado;
	}

}

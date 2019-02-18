package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Circulo implements FigurasGeometricas {
	private final double pi = 3.14;
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return 2 * pi * raio;
	}

	@Override
	public double calculaPerimetro() {

		return pi * raio;

	}

	@Override
	public void imprimeArea() {
		System.out.println("A area deste circulo eh: " + calculaArea());

	}

	@Override
	public void imprimePerimetro() {
		System.out.println("O perimetro do circulo eh: " + calculaPerimetro());
	}

	@Override
	public String toString() {
		return "O circulo criado tem raio de tamanho:  " + raio;
	}

}

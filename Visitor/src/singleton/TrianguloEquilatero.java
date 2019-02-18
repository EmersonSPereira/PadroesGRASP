package singleton;

/**
 * @author Emerson Pereira 
 */

public class TrianguloEquilatero implements FigurasGeometricas{
	
	private int base, altura;
	private static TrianguloEquilatero equilatero = null;
	
	private TrianguloEquilatero(){
		
	}
	
	public static TrianguloEquilatero getTrianguloEqui(){
		if (equilatero == null){
			equilatero = new TrianguloEquilatero();
		}
		
		return equilatero;
	}
	
	public void calculaArea(){
		System.out.println("A area do triangulo equilatero instanciado é: " + (base*altura)/2);
	}

	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	
}

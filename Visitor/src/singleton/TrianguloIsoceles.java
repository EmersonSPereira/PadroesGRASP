package singleton;

/**
 * @author Emerson Pereira 
 */

public class TrianguloIsoceles implements FigurasGeometricas{
	
	private int base, altura;
	private static TrianguloIsoceles isoceles = null;
	
	private TrianguloIsoceles(){
		
	}
	
	public static TrianguloIsoceles getTrianguloIso(){
		if (isoceles == null){
			isoceles = new TrianguloIsoceles();
		}
		
		return isoceles;
	}
	
	public void calculaArea(){
		System.out.println("A area do triangulo Isoceles instanciado é: " + (base*altura)/2);
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

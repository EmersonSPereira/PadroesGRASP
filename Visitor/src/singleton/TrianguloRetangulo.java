package singleton;

/**
 * @author Emerson Pereira 
 */

public class TrianguloRetangulo implements FigurasGeometricas {
	
	private int base, altura;
	private static TrianguloRetangulo retangulo = null;
	
	private TrianguloRetangulo(){
		
	}
	
	public static TrianguloRetangulo getTrianguloRet(){
		if (retangulo == null){
			retangulo = new TrianguloRetangulo();;
		}
		
		return retangulo;
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

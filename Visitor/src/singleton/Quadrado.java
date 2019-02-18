package singleton;

/**
 * @author Emerson Pereira 
 */

public class Quadrado implements FigurasGeometricas{
	
	private int lado;
	
	public Quadrado(){
	}
	
	
	public void calculaArea(){
		
		System.out.println("A área do quadrdo instanciado é: " + lado*lado + "\n");
	}
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	

}

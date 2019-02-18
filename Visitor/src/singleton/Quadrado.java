package singleton;

/**
 * @author Emerson Pereira 
 */

public class Quadrado implements FigurasGeometricas{
	
	private int lado;
	
	public Quadrado(){
	}
	
	
	public void calculaArea(){
		
		System.out.println("A �rea do quadrdo instanciado �: " + lado*lado + "\n");
	}
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	

}

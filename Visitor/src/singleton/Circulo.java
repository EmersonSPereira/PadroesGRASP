package singleton;

/**
 * @author Emerson Pereira 
 */

public class Circulo implements FigurasGeometricas {
	private int  raio;
	private static Circulo circulo = null;
	
	private Circulo(){
		
	}
	
	public static Circulo getCirculo(){
		if(circulo == null){
			circulo = new Circulo();			
		}
		return circulo;
		
	}
	
	public void calculaArea(){
		System.out.println("A Area do circulo instanciado é: " + raio * 3.14);
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	

}

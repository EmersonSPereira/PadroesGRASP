package singleton;

/**
 * @author Emerson Pereira 
 */
public class FactoryFiguras {
	
	public FigurasGeometricas criarQuadrado(){
		return new Quadrado();
	}
	
	public FigurasGeometricas criarCirculo(){
		return Circulo.getCirculo();
	}
	
	public FigurasGeometricas criarTrianguloEquilatero(){
		return TrianguloEquilatero.getTrianguloEqui();
	}
	
	public FigurasGeometricas criarTrianguloRetangulo(){
		return TrianguloRetangulo.getTrianguloRet();
	}
	
	public FigurasGeometricas criarTrianguloIsoceles(){
		return TrianguloIsoceles.getTrianguloIso();
	}
}

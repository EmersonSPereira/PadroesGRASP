package singleton;

/**
 * @author Emerson Pereira 
 */

public class ClienteFabrica {

	public static void main(String[] args) {
		
		System.out.println("====================== Informa��es sobre as figuras criadas  ================================");
		
		FactoryFiguras figuras = new FactoryFiguras();
		//Criando Instancia de Circulos
		Circulo circulo1 = (Circulo) figuras.criarCirculo();
		circulo1.setRaio(9);
		circulo1.calculaArea();
		
		
		
		//Criando instancia dos triangulo equilatero
		
		TrianguloEquilatero equilatero1 = (TrianguloEquilatero) figuras.criarTrianguloEquilatero();
		equilatero1.setAltura(5);
		equilatero1.setBase(10);
		equilatero1.calculaArea();
		

		//Criando instancia dos triangulo retangulo
		TrianguloRetangulo retangulo1 = (TrianguloRetangulo) figuras.criarTrianguloRetangulo();
		retangulo1.setAltura(8);
		retangulo1.setBase(14);
		retangulo1.calculaArea();
		
		//Criando instancia dos triangulo isoceles
		TrianguloIsoceles isoceles1 = (TrianguloIsoceles) figuras.criarTrianguloIsoceles();
		isoceles1.setAltura(12);
		isoceles1.setBase(18);
		isoceles1.calculaArea();		
		
		//Criando Instancias de Quadrado
		
		Quadrado quadrado1 = (Quadrado) figuras.criarQuadrado();
		quadrado1.setLado(10);
		quadrado1.calculaArea();
		
		
		//Tentando criar uma nova instancia de circulo e mostrando que circulo1 e circulo dois � mesma instancia
		
		Circulo circulo2 = (Circulo) figuras.criarCirculo();
		System.out.println("======================= Mostrando que circulo1 e circulo2 s�o a mesma instancia =================");
		System.out.println("A refer�ncia de circulo1 na mem�ria �: " + circulo1);
		System.out.println("A refer�ncia de circulo2 na mem�ria �: " + circulo2 + "\n");
		
		//Tentando criar uma nova instancia de TrianguloEquilatero e mostrando que equilatero1 e equilatero2 � mesma instancia
		
		TrianguloEquilatero equilatero2 = (TrianguloEquilatero) figuras.criarTrianguloEquilatero();
		System.out.println("======================= Mostrando que equilatero1 e equilatero2 s�o a mesma instancia =================");
		System.out.println("A refer�ncia de equilatero1 na mem�ria �: " + equilatero1);
		System.out.println("A refer�ncia de equilatero2 na mem�ria �: " + equilatero2  + "\n");
		
		//Tentando criar uma nova instancia de TrianguloRetangulo e mostrando que retangulo1 e retangulo2 � mesma instancia
		
		TrianguloRetangulo retangulo2 = (TrianguloRetangulo) figuras.criarTrianguloRetangulo();
		System.out.println("======================= Mostrando que retangulo1 e retangulo2 s�o a mesma instancia =================");
		System.out.println("A refer�ncia de retangulo1 na mem�ria �: " + retangulo1);
		System.out.println("A refer�ncia de retangulo2 na mem�ria �: " + retangulo2 + "\n");
		
		//Tentando criar uma nova instancia de TrianguloIsoceles e mostrando que isoceles1 e isoceles2 � mesma instancia
		
		TrianguloIsoceles isoceles2 = (TrianguloIsoceles) figuras.criarTrianguloIsoceles();
		System.out.println("======================= Mostrando que isoceles1 e isoceles2 s�o a mesma instancia =================");
		System.out.println("A refer�ncia de isoceles1 na mem�ria �: " + isoceles1);
		System.out.println("A refer�ncia de isoceles2 na mem�ria �: " + isoceles2 + "\n");
		
		//criando novas instancias de Quadrado e monstrando que suas instancias s�o diferentes
		
		Quadrado quadrado2 = (Quadrado) figuras.criarQuadrado();
		quadrado1.setLado(10);
		Quadrado quadrado3 = (Quadrado) figuras.criarQuadrado();
		quadrado1.setLado(10);
		System.out.println("=============================== Mostrando que as instancias dos quadrados s�o diferentes =======================");
		System.out.println("A refer�ncia de quadrado1 na mem�ria �: " + quadrado1);
		System.out.println("A refer�ncia de quadrado2 na mem�ria �: " + quadrado2);
		System.out.println("A refer�ncia de quadrado3 na mem�ria �: " + quadrado3);

		


		
		
		
		
		


		
		

	}

}

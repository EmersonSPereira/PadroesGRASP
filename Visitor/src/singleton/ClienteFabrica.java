package singleton;

/**
 * @author Emerson Pereira 
 */

public class ClienteFabrica {

	public static void main(String[] args) {
		
		System.out.println("====================== Informações sobre as figuras criadas  ================================");
		
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
		
		
		//Tentando criar uma nova instancia de circulo e mostrando que circulo1 e circulo dois é mesma instancia
		
		Circulo circulo2 = (Circulo) figuras.criarCirculo();
		System.out.println("======================= Mostrando que circulo1 e circulo2 são a mesma instancia =================");
		System.out.println("A referência de circulo1 na memória é: " + circulo1);
		System.out.println("A referência de circulo2 na memória é: " + circulo2 + "\n");
		
		//Tentando criar uma nova instancia de TrianguloEquilatero e mostrando que equilatero1 e equilatero2 é mesma instancia
		
		TrianguloEquilatero equilatero2 = (TrianguloEquilatero) figuras.criarTrianguloEquilatero();
		System.out.println("======================= Mostrando que equilatero1 e equilatero2 são a mesma instancia =================");
		System.out.println("A referência de equilatero1 na memória é: " + equilatero1);
		System.out.println("A referência de equilatero2 na memória é: " + equilatero2  + "\n");
		
		//Tentando criar uma nova instancia de TrianguloRetangulo e mostrando que retangulo1 e retangulo2 é mesma instancia
		
		TrianguloRetangulo retangulo2 = (TrianguloRetangulo) figuras.criarTrianguloRetangulo();
		System.out.println("======================= Mostrando que retangulo1 e retangulo2 são a mesma instancia =================");
		System.out.println("A referência de retangulo1 na memória é: " + retangulo1);
		System.out.println("A referência de retangulo2 na memória é: " + retangulo2 + "\n");
		
		//Tentando criar uma nova instancia de TrianguloIsoceles e mostrando que isoceles1 e isoceles2 é mesma instancia
		
		TrianguloIsoceles isoceles2 = (TrianguloIsoceles) figuras.criarTrianguloIsoceles();
		System.out.println("======================= Mostrando que isoceles1 e isoceles2 são a mesma instancia =================");
		System.out.println("A referência de isoceles1 na memória é: " + isoceles1);
		System.out.println("A referência de isoceles2 na memória é: " + isoceles2 + "\n");
		
		//criando novas instancias de Quadrado e monstrando que suas instancias são diferentes
		
		Quadrado quadrado2 = (Quadrado) figuras.criarQuadrado();
		quadrado1.setLado(10);
		Quadrado quadrado3 = (Quadrado) figuras.criarQuadrado();
		quadrado1.setLado(10);
		System.out.println("=============================== Mostrando que as instancias dos quadrados são diferentes =======================");
		System.out.println("A referência de quadrado1 na memória é: " + quadrado1);
		System.out.println("A referência de quadrado2 na memória é: " + quadrado2);
		System.out.println("A referência de quadrado3 na memória é: " + quadrado3);

		


		
		
		
		
		


		
		

	}

}

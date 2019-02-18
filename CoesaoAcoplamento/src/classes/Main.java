package classes;

/**
 * @author Emerson Pereira /Joanes Miranda
 */
public class Main {

	public static void main(String[] args) {

		// Retangulo
		Retangulo r = new Retangulo(8, 12);
		System.out.println(r.toString());
		r.imprimeArea();
		r.imprimePerimetro();
		System.out.println();

		// Quadrado
		Quadrado q = new Quadrado(8);
		System.out.println(q.toString());
		q.imprimeArea();
		q.imprimePerimetro();
		System.out.println();

		// Circulo
		Circulo c = new Circulo(4);
		System.out.println(c.toString());
		c.imprimeArea();
		c.imprimePerimetro();
		System.out.println();

		System.out.println("Todas as areas: " + "retangulo: " + r.calculaArea() + " " + "quadrado: " + q.calculaArea()
				+ " " + "circulo: " + c.calculaArea() + " ");
		System.out.println();

		System.out.println("Todos os perimetros:: " + "retangulo: " + r.calculaPerimetro() + " " + "quadrado: "
				+ q.calculaPerimetro() + " " + "circulo: " + c.calculaPerimetro());
		System.out.println();
		
		System.out.println("O circulo criado tem raio de tamanho: " +c.getRaio()+"\nO quadrado criado tem lados de tamanho: " + q.getLargura() + 
				"\nO retangulo criado tem altura de tamanho: " +r.getAltura()+ " e largura de tamanhO:"+r.getLargura());

	}

}

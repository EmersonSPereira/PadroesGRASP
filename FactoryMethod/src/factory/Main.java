
package factory;


/**
 * @author Joanes Miranda /Emerson Sousa
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("Sanduiche Opção 1");
		System.out.println("Ingredientes: ");
		
		Sanduiche sanduiche1 = SanduicheFactory.newSanduiche();
		sanduiche1.montarSanduiche(TipoPao.BOLA, TipoQueijo.CHEDDAR, TipoOvo.CAPOEIRA, TipoPresunto.FRANGO);
		System.out.println();
		
		System.out.println("Sanduiche Opção 2");
		System.out.println("Ingredientes: ");
		
		Sanduiche sanduiche2 = SanduicheFactory.newSanduiche();
		sanduiche2.montarSanduiche(TipoPao.FRANCES, TipoQueijo.PRATO, TipoOvo.GRANJA, TipoPresunto.FRANGO);
		System.out.println();
		
		System.out.println("Sanduiche Opção 3");
		System.out.println("Ingredientes: ");
		
		Sanduiche sanduiche3 = SanduicheFactory.newSanduiche();
		sanduiche3.montarSanduiche(TipoPao.INTEGRAL, TipoQueijo.MUSSARELA, TipoOvo.CAPOEIRA, TipoPresunto.PERU);
		
		
	}

}

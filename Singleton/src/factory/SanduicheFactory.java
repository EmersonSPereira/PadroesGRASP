
package factory;

import ingredientes.OvoDeCapoeira;
import ingredientes.OvoDeGranja;
import ingredientes.PaoBola;
import ingredientes.PaoFrances;
import ingredientes.PaoIntegral;
import ingredientes.PresuntoDeFrango;
import ingredientes.PresuntoDePeru;
import ingredientes.QueijoCheddar;
import ingredientes.QueijoMussarela;
import ingredientes.QueijoPrato;
import ingredientes.Tomate;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

/**
 * @author Joanes Miranda /Emerson Sousa
 *
 */
public class SanduicheFactory {
	
	public static Sanduiche newSanduiche() {
		return new Sanduiche();
	}

	public static Pao newPao(TipoPao tipoPao) {

		if (tipoPao.equals(TipoPao.FRANCES)) {
			return new PaoFrances();
		} else if (tipoPao.equals(TipoPao.BOLA)) {
			return new PaoBola();
		} else if (tipoPao.equals(TipoPao.INTEGRAL)) {
			return new PaoIntegral();
		} else {
			return null;
		}
	}

	public static Queijo newQueijo(TipoQueijo tipoQueijo) {

		if (tipoQueijo.equals(TipoQueijo.CHEDDAR)) {
			return new QueijoCheddar();
		} else if (tipoQueijo.equals(TipoQueijo.MUSSARELA)) {
			return new QueijoMussarela();
		} else if (tipoQueijo.equals(TipoQueijo.PRATO)) {
			return new QueijoPrato();
		} else {
			return null;
		}

	}

	public static Ovo newOvo(TipoOvo tipoOvo) {

		if (tipoOvo.equals(TipoOvo.CAPOEIRA)) {
			return new OvoDeCapoeira();
		} else if (tipoOvo.equals(TipoOvo.GRANJA)) {
			return new OvoDeGranja();
		} else {
			return null;
		}
	}

	public static Presunto newPresunto(TipoPresunto tipoPresunto) {

		if (tipoPresunto.equals(TipoPresunto.FRANGO)) {
			return new PresuntoDeFrango();
		} else if (tipoPresunto.equals(TipoPresunto.PERU)) {
			return new PresuntoDePeru();
		} else {
			return null;
		}
	}

	public static Tomate newTomate() {
		return new Tomate();
	}

}

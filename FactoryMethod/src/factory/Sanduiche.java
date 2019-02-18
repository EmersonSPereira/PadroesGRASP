package factory;

import ingredientes.Tomate;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

public class Sanduiche {

	public void montarSanduiche(TipoPao tipoPao, TipoQueijo tipoQueijo, TipoOvo tipoOvo, TipoPresunto tipoPresunto) {

		Pao pao = SanduicheFactory.newPao(tipoPao);
		pao.adicionarFatiaDePao();
		pao.adicionarFatiaDePao();

		Queijo queijo = SanduicheFactory.newQueijo(tipoQueijo);
		queijo.adicionarQueijo();

		Ovo ovo = SanduicheFactory.newOvo(tipoOvo);
		ovo.adicionarOvo();

		Presunto presunto = SanduicheFactory.newPresunto(tipoPresunto);
		presunto.adicionarPresunto();

		Tomate tomate = SanduicheFactory.newTomate();
		tomate.adicionarTomate();

	}
}

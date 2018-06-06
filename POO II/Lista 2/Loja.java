package lista;

import java.util.ArrayList;

class Loja {
	Ordenador ins;
	ArrayList<Produto> prod;
	Loja(){
		ins  = new Ordenador();
		prod = new ArrayList<Produto>();
	}

	void ordena(Critério crit, Categoria cat) {
		ins.insertion_sort(prod, crit, cat);
	}
}

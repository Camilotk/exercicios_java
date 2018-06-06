package lista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

class Ordenador {
	//O que recebi em aula
	public void insertion_sort(LinkedList<Integer> list) {
        int j;
        int chave;
        int i = 0;
        
        for (j = 1; j < list.size(); j++) {
            //sets the iteration value on key
            chave = list.get(j);
            //sets the i index equal the j index less one
            i = j - 1;
            //goes through every number left j and if if the left number
            //is higher than j switch it
            while ((i >= 0) && (list.get(i) > chave)) {
                list.set(i + 1, list.get(i));
                i--;
            }
            //puts key in place
            list.set(i + 1, chave);
        }
    }
	
	//Utilizado no Ex. 2
	public void insertion_sort(ArrayList<Produto> list, Critério crit, Categoria cat) {
		ArrayList<Produto> sub_lista = new ArrayList<Produto>();
        if (cat == cat.CALÇADO) {
        	for (Produto p : list) if (p instanceof Calçado) sub_lista.add(p);
        } else {
        	for (Produto p : list) if (p instanceof Suplemento) sub_lista.add(p);
        }
        
        if (crit == crit.PREÇO) {
        	Collections.sort(sub_lista, new FloatComparator());
        	for (Produto produto : sub_lista) System.out.println(produto.nome + " Preço: " + produto.preco);
        } else {
        	Collections.sort(sub_lista, new IntComparator());
        	for (Produto produto : sub_lista) System.out.println(produto.nome + " Quantidade de Vendas: " + produto.q_vendas);
        }
    }
}

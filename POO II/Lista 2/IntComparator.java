package lista;
import java.util.Comparator;

public class IntComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		if (p1.q_vendas > p2.q_vendas) {return 1;}
		else if (p1.q_vendas < p2.q_vendas) {return -1;}
		return 0;
	}

}

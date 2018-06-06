package lista;
import java.util.Comparator;

public class FloatComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		if (p1.preco > p2.preco) {
			return 1;
		} else if (p1.preco < p2.preco) {
			return -1;
		}
		return 0;
	}

}

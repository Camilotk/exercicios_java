package Classes.Predios;
import Classes.Civilizacao;

public final class Centro extends Classes.Construcoes {
    public Centro(int x, int y, Civilizacao civil) {
        super(x, y, "./templo_tolos.png", 200, 0, 0, true, 350, civil);
    }
}

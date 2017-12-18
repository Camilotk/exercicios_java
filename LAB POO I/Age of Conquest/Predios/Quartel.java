package Classes.Predios;
import Classes.Civilizacao;

public final class Quartel extends Classes.Construcoes {
    public Quartel(int x, int y, Civilizacao civil) {
        super(x, y, "./quartel.png", 125, 0, 0, true, 350, civil);
    }
}

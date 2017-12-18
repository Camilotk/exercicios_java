package Classes.Predios;

import Classes.Civilizacao;

public final class Casa extends Classes.Construcoes {
    public Casa(int x, int y, Civilizacao civil) {
        super(x, y, "./casa.png", 30, 0, 0, true, 75, civil);
    }
}

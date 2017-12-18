package Classes.Predios;

import Classes.Civilizacao;

public final class Templo extends Classes.Construcoes {
    public Templo(int x, int y, Civilizacao civil) {
        super(x, y, "./partenon.png", 250, 0, 0, true, 350, civil);
    }
}

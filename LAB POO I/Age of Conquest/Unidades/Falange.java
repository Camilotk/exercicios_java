package Classes.Unidades;

import Classes.Civilizacao;
import Classes.Dependencias;

public final class Falange extends Classes.Unidade implements Classes.Atacar {
    public Falange(int x, int y, Civilizacao civil) {
        super(x, y, "./falange.png", 0, 40, 60, true, 120,
                1.2, 2, 20, 7, civil);
        if (super.civil.popMaxima()< super.civil.somaDasUnidades()+1) {
            throw new NullPointerException("População execedida");
        }
    }

    @Override
    public void atacar(Dependencias dep) {
        if (Math.abs(dep.getX()-this.getX())<this.getAlcance()
                && Math.abs(dep.getY()-this.getY())<this.getAlcance()){
            dep.setVida(dep.getVida()-(this.getAtaque()-dep.getArmadura()));
        } else {
            System.out.println("Unidade muito distante para ser atacada pelo "+this.getClass().getName().toString());
        }
    }
}

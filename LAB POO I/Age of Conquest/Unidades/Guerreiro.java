package Classes.Unidades;

import Classes.Civilizacao;
import Classes.Dependencias;

public final class Guerreiro extends Classes.Unidade implements Classes.Atacar {
    public Guerreiro(int x, int y, Civilizacao civil) {
        super(x, y, "./guerreiro.png", 0, 15, 35, true, 160,
                1.8, 2, 13, 2, civil);
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

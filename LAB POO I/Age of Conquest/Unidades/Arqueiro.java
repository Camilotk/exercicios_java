package Classes.Unidades;
import Classes.Atacar;
import Classes.Civilizacao;
import Classes.Dependencias;
import Classes.Unidade;

public final class Arqueiro extends Unidade implements Atacar {
    public Arqueiro(int x, int y, Civilizacao civil) {
        super(x, y, "./arqueiro.png", 0, 20, 40, true, 45,
                2.0, 7, 5, 0,  civil);
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

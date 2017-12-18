package Classes.Predios;
import Classes.Civilizacao;
import Classes.Dependencias;

public final class Torre extends Classes.Construcoes implements Classes.Atacar {
    public Torre(int x, int y, Civilizacao civil) {
        super(x, y, "./torre.png", 70, 0, 0, true, 200, civil);
    }

    @Override
    public void atacar(Dependencias dep) {
        if (Math.abs(dep.getX()-this.getX())<7
                && Math.abs(dep.getY()-this.getY())<7){
            dep.setVida(dep.getVida()-(20-dep.getArmadura()));
        } else {
            System.out.println("Unidade muito distante para ser atacada pelo "+this.getClass().getName().toString());
        }
    }
}

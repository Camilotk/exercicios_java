package Classes.Unidades;

import Classes.Civilizacao;
import Classes.Dependencias;
import Classes.Predios.*;

public final class Campones extends Classes.Unidade implements Classes.Atacar {

    public Campones(int x, int y, Civilizacao civil) {
        super(x, y, "./campones.png", 0, 0, 50, true, 50,
                2.0d, 2, 3, 0, civil);
        if (super.civil.popMaxima() < super.civil.somaDasUnidades() + 1) {
            throw new NullPointerException("População execedida");
        }
    }

    public void colhe() {
        this.civil.setComida(civil.getComida() + 1);
    }

    public void minera() {
        this.civil.setOuro(this.civil.getOuro() + 1);
    }

    public void corta() {
        this.civil.setMadeira(this.civil.getMadeira() + 1);
    }

    /*public void constroi(Dependencias dependencias) {
        if (dependencias.getCustoOuro()>this.civil.getOuro() &&
                dependencias.getCustoMadeira()>this.civil.getMadeira() &&
                dependencias.getCustoComida()>this.civil.getComida()) {
            this.civil.setComida(this.civil.getComida()-dependencias.getCustoComida());
            this.civil.setOuro(this.civil.getOuro()-dependencias.getCustoOuro());
            this.civil.setMadeira(this.civil.getMadeira()-dependencias.getCustoMadeira());

            if (dependencias instanceof Casa) {
                this.civil.getCasas().add((Casa) dependencias);
            } else if (dependencias instanceof Centro) {
                this.civil.getCentros().add((Centro) dependencias);
            } else if (dependencias instanceof Quartel) {
                this.civil.getQuartels().add((Quartel) dependencias);
            } else if (dependencias instanceof Templo) {
                this.civil.getTemplos().add((Templo) dependencias);
            } else if (dependencias instanceof Torre) {
                this.civil.getTorres().add((Torre) dependencias);
            }

        }*/

    public void constroi(int x, int y, String objeto) {
        switch (objeto) {
            case "Casa":
                Casa tabela1 = new Casa(0, 0, null);
                if (tabela1.getCustoOuro() < this.civil.getOuro() &&
                        tabela1.getCustoMadeira() < this.civil.getMadeira() &&
                        tabela1.getCustoComida() < this.civil.getComida()) {
                    this.civil.getCasas().add(new Casa(x, y, this.civil));
                    this.civil.setComida(this.civil.getComida() - tabela1.getCustoComida());
                    this.civil.setOuro(this.civil.getOuro() - tabela1.getCustoOuro());
                    this.civil.setMadeira(this.civil.getMadeira() - tabela1.getCustoMadeira());
                }
                break;
            case "Centro":
                Centro tabela2 = new Centro(0, 0, null);
                if (tabela2.getCustoOuro() < this.civil.getOuro() &&
                        tabela2.getCustoMadeira() < this.civil.getMadeira() &&
                        tabela2.getCustoComida() < this.civil.getComida()) {

                    this.civil.getCentros().add(new Centro(x, y, this.civil));
                    this.civil.setComida(this.civil.getComida() - tabela2.getCustoComida());
                    this.civil.setOuro(this.civil.getOuro() - tabela2.getCustoOuro());
                    this.civil.setMadeira(this.civil.getMadeira() - tabela2.getCustoMadeira());
                }
                break;
            case "Quartel":
                Quartel tabela3 = new Quartel(0, 0, null);
                if (tabela3.getCustoOuro() < this.civil.getOuro() &&
                        tabela3.getCustoMadeira() < this.civil.getMadeira() &&
                        tabela3.getCustoComida() < this.civil.getComida()) {
                    this.civil.getQuartels().add(new Quartel(x, y, this.civil));
                    this.civil.setComida(this.civil.getComida() - tabela3.getCustoComida());
                    this.civil.setOuro(this.civil.getOuro() - tabela3.getCustoOuro());
                    this.civil.setMadeira(this.civil.getMadeira() - tabela3.getCustoMadeira());
                }
                break;
            case "Templo":
                Templo tabela4 = new Templo(0, 0, null);
                if (tabela4.getCustoOuro() < this.civil.getOuro() &&
                        tabela4.getCustoMadeira() < this.civil.getMadeira() &&
                        tabela4.getCustoComida() < this.civil.getComida()) {
                    this.civil.getTemplos().add(new Templo(x, y, this.civil));
                    this.civil.setComida(this.civil.getComida() - tabela4.getCustoComida());
                    this.civil.setOuro(this.civil.getOuro() - tabela4.getCustoOuro());
                    this.civil.setMadeira(this.civil.getMadeira() - tabela4.getCustoMadeira());
                }
                break;
            case "Torre":
                Torre tabelaF = new Torre(0, 0, null);
                if (tabelaF.getCustoOuro() < this.civil.getOuro() &&
                        tabelaF.getCustoMadeira() < this.civil.getMadeira() &&
                        tabelaF.getCustoComida() < this.civil.getComida()) {
                    this.civil.getTorres().add(new Torre(x, y, this.civil));
                    this.civil.setComida(this.civil.getComida() - tabelaF.getCustoComida());
                    this.civil.setOuro(this.civil.getOuro() - tabelaF.getCustoOuro());
                    this.civil.setMadeira(this.civil.getMadeira() - tabelaF.getCustoMadeira());
                    System.out.println("Entrou");
                }
                break;
            default:
                System.out.println("Erro");
        }


    }

    @Override
    public void atacar(Dependencias dep) {
        if (Math.abs(dep.getX() - this.getX()) < this.getAlcance()
                && Math.abs(dep.getY() - this.getY()) < this.getAlcance()) {
            dep.setVida(dep.getVida() - (this.getAtaque() - dep.getArmadura()));
        } else {
            System.out.println("Unidade muito distante para ser atacada pelo " + this.getClass().getName().toString());
        }
    }
}

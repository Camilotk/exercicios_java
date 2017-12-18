package Classes.Unidades;

import Classes.Civilizacao;
import Classes.Dependencias;
import Classes.Unidade;

import java.util.ArrayList;

public final class Sarcedote extends Classes.Unidade {
    public Sarcedote(int x, int y, Civilizacao civil) {
        super(x, y, "./sarcedote.png", 0, 125, 0, true, 25,
                1,10, 0,0, civil);
        if (super.civil.popMaxima()< super.civil.somaDasUnidades()+1) {
            throw new NullPointerException("População execedida");
        }
    }
    public void removeElement(ArrayList arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.size() - 1 - removedIdx);
    }
    public void converterInimigo(Dependencias unity) {
        if (unity instanceof Arqueiro){
            for (int i=0; i<unity.civil.getArqueiros().size(); i++){
                if ((unity.getX() == unity.civil.getArqueiros().get(i).getX()) &&
                        (unity.getY() == unity.civil.getArqueiros().get(i).getY())) {
                    this.civil.getArqueiros().add((Arqueiro) unity);
                    //removeElement(unity.civil.getArqueiros(), i);
                    unity.civil.getArqueiros().remove(unity.civil.getArqueiros().get(i));
                    System.out.println("LOLOLOLO");
                }
            }
        } else if (unity instanceof Campones) {
            for (int i=0; i<unity.civil.getCamponeses().size(); i++){
                if ((unity.getX() == unity.civil.getCamponeses().get(i).getX()) &&
                        (unity.getY() == unity.civil.getCamponeses().get(i).getY())) {
                    this.civil.getCamponeses().add((Campones) unity);
                    //removeElement(unity.civil.getCamponeses(), i);
                    unity.civil.getCamponeses().remove(unity.civil.getCamponeses().get(i));
                    System.out.println("LOLOLO");
                }
            }
        } else if (unity instanceof Cavaleiro) {
            for (int i=0; i<unity.civil.getCavaleiros().size(); i++){
                if ((unity.getX() == unity.civil.getCavaleiros().get(i).getX()) &&
                        (unity.getY() == unity.civil.getCavaleiros().get(i).getY())) {
                    this.civil.getCavaleiros().add((Cavaleiro) unity);
                   // removeElement(unity.civil.getCavaleiros(), i);
                    unity.civil.getCavaleiros().remove(unity.civil.getCavaleiros().get(i));
                    System.out.println("LOLOLO");
                }
            }
        } else if (unity instanceof Elefante) {
            for (int i=0; i<unity.civil.getElefantes().size(); i++){
                if ((unity.getX() == unity.civil.getElefantes().get(i).getX()) &&
                        (unity.getY() == unity.civil.getElefantes().get(i).getY())) {
                    this.civil.getElefantes().add((Elefante) unity);
                    //removeElement(unity.civil.getElefantes(), i);
                    unity.civil.getElefantes().remove(unity.civil.getElefantes().get(i));
                    System.out.println("LOLOLO");
                }
            }
        } else if (unity instanceof Guerreiro) {
            for (int i=0; i<unity.civil.getGuerreiros().size(); i++){
                if ((unity.getX() == unity.civil.getGuerreiros().get(i).getX()) &&
                        (unity.getY() == unity.civil.getGuerreiros().get(i).getY())) {
                    this.civil.getGuerreiros().add((Guerreiro) unity);
                    //removeElement(unity.civil.getElefantes(), i);
                    unity.civil.getGuerreiros().remove(unity.civil.getGuerreiros().get(i));
                    System.out.println("LOLOLO");
                }
            }
        } else if (unity instanceof Falange) {
            for (int i=0; i<unity.civil.getFalanges().size(); i++){
                if ((unity.getX() == unity.civil.getFalanges().get(i).getX()) &&
                        (unity.getY() == unity.civil.getFalanges().get(i).getY())) {
                    this.civil.getFalanges().add((Falange) unity);
                    //removeElement(unity.civil.getFalanges(), i);
                    unity.civil.getFalanges().remove(unity.civil.getFalanges().get(i));
                    System.out.println("LOLOLO");
                }
            }
        } else if (unity instanceof Sarcedote) {
            for (int i=0; i<unity.civil.getSarcedotes().size(); i++){
                if ((unity.getX() == unity.civil.getSarcedotes().get(i).getX()) &&
                        (unity.getY() == unity.civil.getSarcedotes().get(i).getY())) {
                    this.civil.getSarcedotes().add((Sarcedote) unity);
                    //removeElement(unity.civil.getSarcedotes(), i);
                    unity.civil.getSarcedotes().remove(unity.civil.getSarcedotes().get(i));
                    System.out.println("LOLOLO");
                }
            }
        }
        unity.civil = this.civil;
    }
}

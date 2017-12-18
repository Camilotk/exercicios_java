package Classes;

import Classes.Direcoes;
import Classes.Predios.Casa;
import Classes.Unidades.Arqueiro;
import Classes.Unidades.Campones;
import Classes.Unidades.Guerreiro;
import Classes.Unidades.Sarcedote;

public class main {
    public static void main(String[] args) {
        Civilizacao egipcios = new Civilizacao("Ptolomeus");
        Civilizacao gregos = new Civilizacao("Macedônios");

        System.out.println("=== === Jogo Age of Why Greeks are in War with Egyptians? === ===");
        System.out.println();
        //inicio Gregos
        System.out.println("O centro da cidade grega está em "+gregos.getCentros().get(0).getPos());
        System.out.println("O campones está em " + gregos.getCamponeses().get(0).getPos());
        System.out.println("O campones está em " + gregos.getCamponeses().get(1).getPos());
        gregos.getCamponeses().get(1).mover(Direcoes.LESTE);
        System.out.println("O campones está em " + gregos.getCamponeses().get(1).getPos());
        System.out.println();
        //inicio Egipcios
        System.out.println("O centro da cidade egipcia está em "+egipcios.getCentros().get(0).getPos());
        System.out.println("O campones está em " + egipcios.getCamponeses().get(0).getPos());
        System.out.println("O campones está em " + egipcios.getCamponeses().get(1).getPos());
        egipcios.getCamponeses().get(1).mover(Direcoes.SUL);
        System.out.println("O campones está em " + egipcios.getCamponeses().get(1).getPos());
        System.out.println();
        System.out.println("=== Testes Edital ===");
        //Ataque a distancia
        System.out.println(egipcios.popMaxima());
        egipcios.getGuerreiros().add(new Guerreiro(34, 67, egipcios));
        Arqueiro paris = new Arqueiro(32, 66, gregos);
        System.out.println(egipcios.getGuerreiros().get(0).getVida());
        paris.atacar(egipcios.getGuerreiros().get(0));
        System.out.println(egipcios.getGuerreiros().get(0).getVida());
        for (int i=0; i<20; i++) { egipcios.getGuerreiros().get(0).mover(Direcoes.NORTE); }
        paris.atacar(egipcios.getGuerreiros().get(0));
        //Exceder a população
        egipcios.getCasas().add(new Casa(9,3, egipcios));
        System.out.println(egipcios.popMaxima());
        //retira o comentário para testar, pois dá throw sem try
        //for (int i=0; i<60; i++) { egipcios.getGuerreiros().add(new Guerreiro(9,8, egipcios)); }//Guerreiro hamases = new Guerreiro(34, 67, egipcios);
        System.out.println();
        //Verificar a conversao
        gregos.getSarcedotes().add(new Sarcedote(5,6, gregos));
        gregos.getSarcedotes().get(0).converterInimigo(egipcios.getGuerreiros().get(0));
        System.out.println("Checando para ver se é o mesmo nas coordenadas originas + 20 andadas em Y ( X: "+
                gregos.getGuerreiros().get(0).getX()+" , "+
                gregos.getGuerreiros().get(0).getY()+" )");
        System.out.println("Correto!");
        System.out.println();
        //Metodos exclusivos do Campones
        System.out.println("Egipcios Ouro: "+egipcios.getOuro());
        System.out.println("Egipcios Madeira: "+egipcios.getMadeira());
        System.out.println("Egipcios Comida: "+egipcios.getComida());
        egipcios.getCamponeses().add(new Campones(9,9, egipcios));
        egipcios.getCamponeses().get(0).minera();
        egipcios.getCamponeses().get(0).colhe();
        egipcios.getCamponeses().get(0).corta();
        egipcios.getCamponeses().get(0).constroi(34,56, "Torre");
        System.out.println();
        System.out.println("Egipcios Ouro: "+egipcios.getOuro());
        System.out.println("Egipcios Madeira: "+egipcios.getMadeira());
        System.out.println("Egipcios Comida: "+egipcios.getComida());
        System.out.println("Passou nos testes");


    }
}

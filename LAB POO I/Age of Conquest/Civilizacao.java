package Classes;
import Classes.Predios.*;
import Classes.Unidades.*;
import java.util.ArrayList;
import java.util.Random;

public class Civilizacao {
    private ArrayList<Classes.Unidades.Arqueiro> arqueiros = new ArrayList();
    private ArrayList<Classes.Unidades.Campones> camponeses = new ArrayList();
    private ArrayList<Classes.Unidades.Cavaleiro> cavaleiros = new ArrayList();
    private ArrayList<Classes.Unidades.Elefante> elefantes = new ArrayList();
    private ArrayList<Classes.Unidades.Falange> falanges = new ArrayList();
    private ArrayList<Classes.Unidades.Guerreiro> guerreiros = new ArrayList();
    private ArrayList<Classes.Unidades.Sarcedote> sarcedotes = new ArrayList();
    private ArrayList<Classes.Predios.Casa> casas = new ArrayList();
    private ArrayList<Classes.Predios.Centro> centros = new ArrayList();
    private ArrayList<Classes.Predios.Quartel> quartels = new ArrayList();
    private ArrayList<Classes.Predios.Templo> templos = new ArrayList();
    private ArrayList<Classes.Predios.Torre> torres = new ArrayList();
    private ArrayList<Classes.Dependencias> dependenciasMortas = new ArrayList();
    private String nome;
    private int madeira;
    private int ouro;
    private int comida;

    public int somaDasUnidades () {
        return (camponeses.size() +
                cavaleiros.size() +
                elefantes.size() +
                falanges.size() +
                guerreiros.size() +
                sarcedotes.size() +
                casas.size() +
                centros.size() +
                quartels.size() +
                templos.size() +
                torres.size());
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Civilizacao(String nome) {
        int randomX = randInt(0,100);
        int randomY = randInt(0,100);
        this.nome = nome;
        this.madeira = 100;
        this.ouro = 100;
        this.comida = 100;
        centros.add(new Centro(randomX,randomY, this));
        camponeses.add(new Classes.Unidades.Campones(randomX+2, randomY+2, this));
        camponeses.add(new Classes.Unidades.Campones(randomX+1,randomY+1, this));
    }
    private boolean extinta = this.somaDasUnidades() <= 0;

    public int popMaxima () {
       return ((this.casas.size() * 2) + (this.centros.size() * 10));
    }

    public boolean isExtinta() {
        return extinta;
    }

    public int getMadeira() {
        return madeira;
    }

    public int getOuro() {
        return ouro;
    }

    public int getComida() {
        return comida;
    }
    //Os sets ficaram públicos porque por algum motivo bizarro (java ¬¬) o protected não funcionou
    public void setMadeira(int madeira) {
        this.madeira = madeira;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public ArrayList<Campones> getCamponeses() {
        return camponeses;
    }

    public ArrayList<Cavaleiro> getCavaleiros() {
        return cavaleiros;
    }

    public ArrayList<Elefante> getElefantes() {
        return elefantes;
    }

    public ArrayList<Falange> getFalanges() {
        return falanges;
    }

    public ArrayList<Guerreiro> getGuerreiros() {
        return guerreiros;
    }

    public ArrayList<Sarcedote> getSarcedotes() {
        return sarcedotes;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public ArrayList<Centro> getCentros() {
        return centros;
    }

    public ArrayList<Quartel> getQuartels() {
        return quartels;
    }

    public ArrayList<Templo> getTemplos() {
        return templos;
    }

    public ArrayList<Torre> getTorres() {
        return torres;
    }

    public ArrayList<Arqueiro> getArqueiros() {
        return arqueiros;
    }
}



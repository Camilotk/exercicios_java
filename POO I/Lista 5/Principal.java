package Lista_5;

public class Principal {
    public static void main(String[] args) {
        Mapa mInicial = new Mapa();

        Posicao[] coordenadas = new Posicao[10];
        coordenadas[1] = new Posicao(12, 34);
        coordenadas[2] = new Posicao(23, 65);
        coordenadas[3] = new Posicao(67, 7);
        coordenadas[4] = new Posicao(12, 12);
        coordenadas[5] = new Posicao(9, 3);
        coordenadas[0] = new Posicao(45, 89);
        coordenadas[6] = new Posicao(34, 49);
        coordenadas[7] = new Posicao(23, 37);
        coordenadas[8] = new Posicao(23, 90);
        coordenadas[9] = new Posicao(7, 66);


        Aviao plane = new Aviao(3,12);
        Barco boat = new Barco(7, 8);
        Carro truck = new Carro(23, 1);
        Passaro bird = new Passaro(9,6);
        Pedra rocks = new Pedra(4, 12);
        Peixe salmon = new Peixe(54, 52);
        Pessoa people = new Pessoa(12, 90);
        Tigre cat = new Tigre(30, 70);

        boat.nada(coordenadas[4]);
        bird.voa(coordenadas[2]);
        cat.anda(coordenadas[6]);
        plane.voa(coordenadas[3]);
        salmon.nada(coordenadas[0]);

    }
}

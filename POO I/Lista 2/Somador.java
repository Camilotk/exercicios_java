package Lista_2;

public class Somador {
    double soma;

    /*void adicionaTriangulo(Triangulo tris) {
        soma = soma + tris.area();
    }

    void adicionaCirculo(Circulo bola) {
        soma = soma + bola.area();
    }

    void adicionaRetangulo(Retangulo ret) {
        soma = soma + ret.area();
    }*/

    void adicionaForma (Forma forma) {
        soma += forma.area();
    }

    double fazSoma() {
        return soma;
    }
}
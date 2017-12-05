package Lista_2;

public class Circulo extends Forma {
    double raio;

    Circulo(double raio, int z, int x, int y) {
        super(x, y, z);
        this.raio = raio;
    }

    double diametro() {
        return 2 * raio;
    }

    double area() {
        return Math.sqrt(raio * Math.PI);
    }

    double perimetro() {
        return 2 * Math.PI * raio;
    }
}

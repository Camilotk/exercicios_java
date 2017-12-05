package Lista_2;

class Triangulo extends Forma {
    // atributos
    double altura;
    double largura;
    String cor;

    // CONSTRUTOR da classe:
    // define o método inicializador da classe, ou seja, o código que vai ser
    // executado ao chamar o new.
    Triangulo(double altura, double largura, String cor, int z, int x, int y) {
        super(x, y, z);
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    double area() {
        return altura * largura / 2.0;
    }

    double pitagoras() {
        double soma;
        soma = (Math.pow(altura, 2.0) + Math.pow(largura, 2.0));
        return Math.sqrt(soma);
    }

    double perimetro() {
        return altura + largura + pitagoras();
    }

    void pintar(String novaCor) {
        cor = novaCor;
        System.out.println("pintando o triangulo de " + cor);
    }
}


package Lista_2;

public class IntrOOP {
    public static void main(String[] args) {
        // Retangulo é o "tipo", agora chamado de classe,
        // da variável chamada "ret" (que é então um objeto da classe Retangulo).
        // para INSTANCIAR um objeto, precisamos atribuir (com o símbolo "=") um
        // "novo" Retangulo (= new Retangulo());
        Retangulo ret = new Retangulo(2.3, 3.1, 2, 0, 0);
        // para accessar os atributos de um objeto basta usar o nome da variável,
        // ponto e o nome do atributo
        ret.lado1 = 10.0;
        ret.lado2 = 5.0;
        // acessar os métodos segue a mesma lógica.
        System.out.println(ret.area());

        // criando um novo objeto da classe Retangulo
        Retangulo ret2 = new Retangulo(8.9, 4.58, 1, 2, 2);
        ret2.lado1 = 3.0;
        ret2.lado2 = 7.0;

        // a linha abaixo não deve funcionar, pois Triangulo() não é um construtor
        // de Triangulo
        // Triangulo tri = new Triangulo();

        Triangulo tri = new Triangulo(10.0, 2.0, "azul", 2, 4, 5);
        System.out.println(tri.area());
        tri.pintar("amarelo");

        Comparador comp = new Comparador();
        comp.comparaArea(ret, tri);

        // Podemos ter arrays de objetos
        // alocamos um array com 10 elementos
        Triangulo[] tris = new Triangulo[10];
        // inicializamos alguns elementos
        tris[0] = new Triangulo(1.0, 2.0, "azul", 3, 4, 1);
        tris[1] = new Triangulo(2.0, 2.0, "amarelo", 5, 6, 1);
        tris[2] = new Triangulo(3.0, 2.0, "vermelho", 2, 3, 2);
        tris[3] = new Triangulo(4.0, 2.0, "roxo", 1, 2, 5);

        // acessando atributos
        System.out.println(tris[0].altura);
        tris[1].largura = 5.0;

        //================= TESTE SOMADOR =================================
        Somador calculadoraArea = new Somador();
        calculadoraArea.adicionaForma(tris[0]);
        calculadoraArea.adicionaForma(ret);
        calculadoraArea.adicionaForma(tris[1]);
        calculadoraArea.adicionaForma(ret2);
        System.out.println("O resultado da soma é "+calculadoraArea.fazSoma()+" m².");

        //=============== TESTE COMPARADOR ==============================
            Circulo cir = new Circulo(3.23, 0,0,0);
            comp.comparaArea(ret, tris[0]);
            comp.comparaPerimetro(tri, ret2);
            comp.comparaArea(cir, tri);

        //===========================INICIO DO CODIGO PROPRIO=======================================================
        //Implementação perimetro
        System.out.println("\n\n");
        Retangulo novoRetangulo = new Retangulo(4.0, 4, 3, 2, 3);
        System.out.println("O perimetro do retangulo é " + novoRetangulo.perimetro());
        System.out.println("O perimetro do triangulo é " + tris[3].perimetro());
        System.out.println("\n");
        Circulo[] circulos = new Circulo[2];
        circulos[0] = new Circulo(9.0, 2, 3, 1);
        circulos[1] = new Circulo(3.23, 3, 2, 1);
        System.out.println("A área do circulo é " + circulos[0].area());
        System.out.println("O diametro do circulo é " + circulos[0].diametro());
        System.out.println("O perimetro do circulo é " + circulos[0].perimetro());

        Folha A3 = new Folha(21, 29.7);
        A3.adicionarForma(tris[1]);
        A3.adicionarForma(tris[0]);
        A3.adicionarForma(tris[2]);
        A3.adicionarForma(tris[3]);
        A3.adicionarForma(ret);
        A3.adicionarForma(novoRetangulo);
        A3.adicionarForma(ret2);
        A3.adicionarForma(circulos[0]);
        A3.adicionarForma(circulos[1]);
        A3.listarFormas();
        A3.listarOrdenado();
    }
}


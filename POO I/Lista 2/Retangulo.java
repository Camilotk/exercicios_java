package Lista_2;

class Retangulo extends Forma {
  /* As classes podem conter basicamente:
   * Dados: chamados em POO de atributos, membros, campos, propriedades.
   * Procedimentos/Funções: chamados em POO de métodos.
   */

    // atributos
    double lado1;
    double lado2;

    Retangulo(double lado1, double lado2, int z, int x, int y) {
        super(x, y, z);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // DECLARAÇÃO dos métodos:
  /* descreve a assinatura dos métodos (como os programadores devem usar
   * objetos dessa classe.
   * e DEFINIÇÃO dos métodos:
   * descreve como os métodos são implementados.
   */
    double area() {
        return lado1 * lado2;
    }

    double perimetro() {
        return 2 * (lado1 + lado2);
    }
}

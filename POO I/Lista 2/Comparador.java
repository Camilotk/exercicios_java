package Lista_2;

class Comparador {

    Comparador() {
        tris = new Triangulo[10];
    }

    /**
     * Compara areas de um retângulo e de um triângulo e retorna se área do
     * retângulo é maior.
     *
     * @param ret o retangulo a ser comparado.
     * @param tri o retangulo a ser comparado.
     * @return true se area do retangulo é maior que area do triangulo.
     */
    /*boolean maiorArea(Retangulo ret, Triangulo tri) {
        if (ret.area() > tri.area()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorPerimetro(Retangulo ret, Triangulo tri) {
        if (ret.perimetro() > tri.perimetro()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorArea2(Retangulo ret, Circulo bola) {
        if (ret.area() > bola.area()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorPerimetro2(Retangulo ret, Circulo bola) {
        if (ret.perimetro() > bola.perimetro()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorArea3(Triangulo tri, Circulo bola) {
        if (tri.area() > bola.area()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorPerimetro3(Triangulo tri, Circulo bola) {
        if (tri.perimetro() > bola.perimetro()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorArea4(Retangulo ret, Triangulo tri) {
        if (ret.area() < tri.area()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorPerimetro4(Retangulo ret, Triangulo tri) {
        if (ret.perimetro() < tri.perimetro()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorArea5(Retangulo ret, Circulo bola) {
        if (ret.area() < bola.area()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorPerimetro5(Retangulo ret, Circulo bola) {
        if (ret.perimetro() < bola.perimetro()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorArea6(Triangulo tri, Circulo bola) {
        if (tri.area() < bola.area()) {
            return true;
        } else {
            return false;
        }
    }

    boolean maiorPerimetro6(Triangulo tri, Circulo bola) {
        if (tri.perimetro() < bola.perimetro()) {
            return true;
        } else {
            return false;
        }
    }*/

    Triangulo[] tris;

    public void comparaArea(Forma forma1, Forma forma2){
        if (forma1.area() > forma2.area()) {
            System.out.println("A área do "+forma1.getClass().getName().toString()+
            " é maior!");
        } else {
            System.out.println("A área do "+forma2.getClass().getName().toString()+
            " é maior!");
        }
    }

    public void comparaPerimetro(Forma forma1, Forma forma2) {
        if (forma1.perimetro() > forma2.perimetro()) {
            System.out.println("O perimetro do "+forma1.getClass().getName().toString()+
                    " é maior!");
        } else {
            System.out.println("O perimetro do "+forma2.getClass().getName().toString()+
                    " é maior!");
        }
    }
}

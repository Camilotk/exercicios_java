package Lista_2;

import java.util.ArrayList;

class Folha {
    //var
    double altura;
    double largura;
    int numeroTriangulos;
    int numeroRetangulos;
    int numeroCirculos;
    int coutFormas;

    Forma[] listaFormas = new Forma[30];

    public Folha(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        for (int x = 0; x < 30; x++) {
            if (x <= 0 && x < 10) {
                listaFormas[x] = new Triangulo(-0.5, -0.5, " ", 0, 0, 0);
            } else if (x > 10 && x < 20) {
                listaFormas[x] = new Retangulo(-0.5, -0.5, 0, 0, 0);
            } else {
                listaFormas[x] = new Circulo(-0.5, 0, 0, 0);
            }
        }
        coutFormas = 0;
    }

    private void verificaFolha(Forma form) {
        if (form instanceof Circulo) {
            Circulo cir = (Circulo) form;
            if ((cir.raio) > cir.x || (cir.y) > cir.y) {
                System.out.println("O circulo com o raio " + cir.raio + " sai da folha! \uD83D\uDCC3");
            }
        } else if (form instanceof Triangulo) {
            Triangulo tri = (Triangulo) form;
            if (((tri.x + tri.largura) > this.largura) || ((tri.y + tri.altura) > this.altura)) {
                System.out.println("O triangulo com a alura" + tri.altura + " e a largura " + tri.largura +
                        " sai da folha! \uD83D\uDCC3");
            }
        } else if (form instanceof Retangulo) {
            Retangulo ret = (Retangulo) form;
            if (((ret.x + ret.lado1) > this.largura) || ((ret.y + ret.lado2) > this.altura)) {
                System.out.println("O retangulo com lado " + ret.lado1 + " e lado " + ret.lado2 + " sai da folha! \uD83D\uDCC3");
            }
        }
    }

    /*private void verificaFolha (Triangulo tri){
        if (((tri.x + tri.largura)>this.largura) || ((tri.y+tri.altura)>this.altura) ) {
            System.out.println("O triangulo com a alura"+tri.altura+" e a largura "+tri.largura+
                    " sai da folha! \uD83D\uDCC3");
        }
    }
    private void verificaFolha (Retangulo ret){
        if (((ret.x+ret.lado1)>this.largura) || ((ret.y+ret.lado2)>this.altura)) {
            System.out.println("O retangulo com lado "+ret.lado1+" e lado "+ret.lado2+" sai da folha! \uD83D\uDCC3");
        }
    }
    private void verificaFolha (Circulo cir){
        if ((cir.raio)>cir.x || (cir.y)>cir.y) {
            System.out.println("O circulo com o raio "+cir.raio+" sai da folha! \uD83D\uDCC3");
        }
    }*/
    public void adicionarForma(Forma form) {
        for (int j = 0; j < 30; j++) {
            if (listaFormas[j].perimetro() <= 0) {
                listaFormas[j] = form;
                coutFormas++;
                break;
            }
        }
        verificaFolha(form);
    }

    /*
    public void adicionarTriangulo(Triangulo tri) {
        if (tri.altura > 0 && tri.largura > 0) {
            for (int j = 0; j < 10; j++) {
                if (listaTriangulos[j].altura < 0 && listaTriangulos[j].largura < 0 && listaTriangulos[j].cor.equals(" ")) {
                    listaTriangulos[j] = tri;
                    coutFormas++;
                    break;
                }
            }
        } else {
            System.out.println("Por favor, use valores positivos. Meu Algoritmo agradece.");
        }
        verificaFolha(tri);
    }
    public void adicionarRetangulo(Retangulo ret) {
        if (ret.lado1 > 0 && ret.lado2 > 0) {
            for (int j = 0; j < 10; j++) {
                if (listaRetangulos[j].lado1 < 0 && listaRetangulos[j].lado2 < 0) {
                    listaRetangulos[j] = ret;
                    coutFormas++;
                    break;
                }
            }
        } else {
            System.out.println("Por favor, use valores positivos. Meu Algoritmo agradece.");
        }
        verificaFolha(ret);
    }

    public void adicionarCirculo(Circulo cir) {
        if (cir.raio > 0) {
            for (int j = 0; j < 10; j++) {
                if (listaCirculos[j].raio < 0) {
                    listaCirculos[j] = cir;
                    coutFormas++;
                    break;
                }
            }
        } else {
            System.out.println("Por favor, use valores positivos. Meu Algoritmo agradece.");
        }
        verificaFolha(cir);
    }
    */
    public void contaFormas(Forma[] formas) {

        for (int h = 0; h < 30; h++) {
            if (formas[h] instanceof Triangulo) {
                Triangulo tri = (Triangulo) formas[h];
                if (tri.altura > 0) {
                    numeroTriangulos++;
                }
            } else if (formas[h] instanceof Retangulo) {
                Retangulo ret = (Retangulo) formas[h];
                if (ret.lado1 > 0) {
                    numeroRetangulos++;
                }
            } else if (formas[h] instanceof Circulo) {
                Circulo cir = (Circulo) formas[h];
                if (cir.raio > 0) {
                    numeroCirculos++;
                }
            }

        }
        System.out.println("Número de Triângulos Adicionados: " + numeroTriangulos + " Triângulos!");
        System.out.println("Número de Retângulos Adicionados: " + numeroRetangulos + " Retângulos!");
        System.out.println("Número de Circulos Adicionados: " + numeroCirculos + " Círculos!");
    }

    /*public int contaCirculos(Circulo[] circulos) {
        for (int a = 0; a < 10; a++) {
            if (circulos[a].raio > 0) {
                numeroCirculos++;
            }
        }
        return numeroCirculos;
    }

    public int contaRetangulos(Retangulo[] retangulos) {
        for (int s = 0; s < 10; s++) {
            if (retangulos[s].lado1 > 0) {
                numeroRetangulos++;
            }
        }
        return numeroRetangulos;
    }*/

    public void listarFormas() {
        System.out.println();
        System.out.println("============= IMPRIME AS FORMAS =============");
        System.out.println(" Numero de Formas: " + coutFormas);
        System.out.println(" ---------------------------------------------");
        contaFormas(listaFormas);
        System.out.println(" ---------------------------------------------");
        System.out.println("Formas: ");
        for (int a = 0; a < 10; a++) {
            if (listaFormas[a] instanceof Triangulo && listaFormas[a].area() > 0) {
                Triangulo tri = (Triangulo) listaFormas[a];
                System.out.println("A forma " + (a + 1) + " é um Triangulo que tem as propriedades: ");
                System.out.println("     altura: " + tri.altura);
                System.out.println("     largura: " + tri.largura);
                System.out.println("     cor: " + tri.cor);

            } else if (listaFormas[a] instanceof Retangulo && listaFormas[a].area() > 0) {
                Retangulo ret = (Retangulo) listaFormas[a];
                System.out.println("A forma " + (a + 1) + " é um Retangulo que tem as propriedades: ");
                System.out.println("    lado 1: " + ret.lado1);
                System.out.println("    lado 2: " + ret.lado2);
            } else if (listaFormas[a] instanceof Circulo && listaFormas[a].area() > 0) {
                Circulo cir = (Circulo) listaFormas[a];
                System.out.println("A forma " + (a + 1) + " é um Circulo que tem o raio " + cir.raio);
            }

        }
        /*System.out.println("Triângulos: ");
        for (int a = 0; a < 10; a++) {
            if (listaTriangulos[a].altura > 0) {
                System.out.println("O Triangulo " + (a + 1) + " tem as propriedades: ");
                System.out.println("     altura: " + listaTriangulos[a].altura);
                System.out.println("     largura: " + listaTriangulos[a].largura);
                System.out.println("     cor: " + listaTriangulos[a].cor);
            }
        }
        System.out.println();
        System.out.println("Retângulos: ");
        for (int b = 0; b < 10; b++) {
            if (listaRetangulos[b].lado1 > 0) {
                System.out.println("O Retângulo " + (b + 1) + " tem as propriedades: ");
                System.out.println("    lado 1: " + listaRetangulos[b].lado1);
                System.out.println("    lado 2: " + listaRetangulos[b].lado2);
            }
        }
        System.out.println();
        System.out.println("Circulos: ");
        for (int c = 0; c < 10; c++) {
            if (listaCirculos[c].raio > 0) {
                System.out.println("O Circulo " + (c + 1) + " tem o raio " + listaCirculos[c].raio);
            }
        }*/
        System.out.println("=========== FIM IMPRIME AS FORMAS ===========");
        System.out.println();
    }

    public void listarOrdenado() {
        ArrayList<Forma> formasArrayList = new ArrayList();
        for (int i = 0; i < listaFormas.length; i++) {
            if (listaFormas[i].area() > 0) {
                formasArrayList.add(listaFormas[i]);
            }
        }
        formasArrayList.sort((Forma z1, Forma z2) -> {
            if (z1.z > z2.z)
                return 1;
            if (z1.z < z2.z)
                return -1;
            return 0;
        });
        System.out.println("============= ORDENA AS FORMAS =============");
        for (Forma f : formasArrayList) {
            System.out.println("        O " +
                    f.getClass().getName().toString() + " com z " + f.z);
        }
        System.out.println("=========== FIM ORDENA AS FORMAS ===========");
    }
}

package calculadora;
/**
 *
 * @author camilo
 */
public class Calc_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //le o tipo de operação por código
        char opc = Calc_Valida.leiaChar("Digite a opção:\n1 - Soma de Matrizes\n"
                +"2 - Subtração de Matrizes\n3 - Produto de Matrizes\n"+
                "4 - Produto Escalar\n5 - Calculo de Determinante               ");
        //Usa o Switch para direcionar e executar o código com tratamento de erros
        try {
            switch (opc) {
                case '1':
                    Calc_Matriz[] soma = new Calc_Matriz[3];
                    soma[0] = new Calc_Matriz();
                    soma[1] = new Calc_Matriz();
                    soma[2] = new Calc_Matriz();
                    soma[0].CriaMatriz();
                    soma[1].CriaMatriz();
                    soma[2] = Calc_Operacoes.somaMatriz(soma[0], soma[1]);
                    for(int i=0; i<soma[2].linha; i++){
                        for(int j=0; j<soma[2].coluna; j++){
                            Calc_Valida.Mensagem(Integer.toString(soma[2].Matriz()[i][j]), 
                                   "Resultado na linha "+i+" e na coluna "+j, 
                                    true);
                        }
                    }
                    break;
                case '2':
                    Calc_Matriz[] subtrai = new Calc_Matriz[3];
                    subtrai[0] = new Calc_Matriz();
                    subtrai[1] = new Calc_Matriz();
                    subtrai[2] = new Calc_Matriz();
                    subtrai[0].CriaMatriz();
                    subtrai[1].CriaMatriz();
                    subtrai[2] = Calc_Operacoes.subtraiMatriz(subtrai[0], subtrai[1]);
                    for(int i=0; i<subtrai[2].linha; i++){
                        for(int j=0; j<subtrai[2].coluna; j++){
                            Calc_Valida.Mensagem(Integer.toString(subtrai[2].Matriz()[i][j]), 
                                   "Resultado na linha "+i+" e na coluna "+j, 
                                    true);
                        }
                    }
                    break;
                case '3':
                    Calc_Matriz[] multiplica = new Calc_Matriz[3];
                    multiplica[0] = new Calc_Matriz();
                    multiplica[1] = new Calc_Matriz();
                    multiplica[2] = new Calc_Matriz();
                    multiplica[0].CriaMatriz();
                    multiplica[1].CriaMatriz();
                    multiplica[2] = Calc_Operacoes.multiplicaMatriz(multiplica[0], multiplica[1]);
                    for(int i=0; i<multiplica[2].linha; i++){
                        for(int j=0; j<multiplica[2].coluna; j++){
                            Calc_Valida.Mensagem(Integer.toString(multiplica[2].Matriz()[i][j]), 
                                    "Resultado na linha "+i+" e na coluna "+j, 
                                    true);
                        }
                    }
                    break;
                case '4':
                    Calc_Matriz[] escalar = new Calc_Matriz[2];
                    escalar[0] = new Calc_Matriz();
                    escalar[1] = new Calc_Matriz();
                    escalar[0].CriaMatriz();
                    int e = Calc_Valida.leiaInt("Digite o valor escalar: ");
                    escalar[1] = Calc_Operacoes.produtoEscalar(escalar[0], e);
                    for(int i=0; i<escalar[0].linha; i++){
                        for(int j=0; j<escalar[0].coluna; j++){
                            Calc_Valida.Mensagem(Integer.toString(escalar[0].Matriz()[i][j]), 
                                    "Resultado na linha "+i+" e na coluna "+j, 
                                    true);
                        }
                    }
                    break;
                case '5':
                    Calc_Matriz m = new Calc_Matriz();
                    m.CriaMatriz();
                    Calc_Valida.Mensagem(Integer.toString(Calc_Operacoes.detMatriz(m)), "LALALa", true);
                    break;
                default:
                    Calc_Valida.Mensagem("Entrada Invalida", "Se liga bico de luz!", false);
                    break;
            }

            System.exit(0);
        }catch(Exception e){
            Calc_Valida.Mensagem("Erro", "404!", false);
            System.exit(0);
        }
    }
    
}

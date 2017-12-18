/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
/**
 *
 * @author camilo
 */
public class Calc_Operacoes {
    /** Recebe duas matrizes e retorna a sua soma
     ** @param m1 matriz 1
     ** @param m2 matriz 2
     ** @return matriz
     **/
    public static Calc_Matriz somaMatriz (Calc_Matriz m1, Calc_Matriz m2){
        if (m1.coluna!=m2.coluna){
            Calc_Valida.Mensagem("Matrizes com tamanhos diferentes!", "Presta atenção mocorongo!", false);
            System.exit(0);
        } else if (m1.linha!=m2.linha){
            Calc_Valida.Mensagem("Matrizes com tamanhos diferentes!", "Presta atenção mocorongo!", false);
            System.exit(0);
        }
        
        Calc_Matriz m = new Calc_Matriz();
        m.IniciaMatriz(m1.linha, m1.coluna);
        
        for (int i=0; i<m1.linha;i++){
            for (int j=0; j<m1.coluna; j++){
                m.Matriz()[i][j] = m1.Matriz()[i][j]+m2.Matriz()[i][j]; 
            }
        }
        return m;
    }
    /** Recebe duas matrizes e retorna a sua subtração
     ** @param m1 matriz 1
     ** @param m2 matriz 2
     ** @return matriz
     **/
    public static Calc_Matriz subtraiMatriz (Calc_Matriz m1, Calc_Matriz m2){
        if (m1.coluna!=m2.coluna){
            Calc_Valida.Mensagem("Matrizes com tamanhos diferentes!", "Presta atenção mocorongo!", false);
            System.exit(0);
        } else if (m1.linha!=m2.linha){
            Calc_Valida.Mensagem("Matrizes com tamanhos diferentes!", "Presta atenção mocorongo!", false);
            System.exit(0);
        }
        
        Calc_Matriz m = new Calc_Matriz();
        m.IniciaMatriz(m1.linha, m1.coluna);
        
        for (int i=0; i<m1.linha;i++){
            for (int j=0; j<m1.coluna; j++){
                m.Matriz()[i][j] = m1.Matriz()[i][j]-m2.Matriz()[i][j]; 
            }
        }
        return m;
    }
     /** Recebe duas matrizes e retorna a sua multiplicação
     ** @param m1 matriz 1
     ** @param m2 matriz 2
     ** @return matriz
     **/
    public static Calc_Matriz multiplicaMatriz (Calc_Matriz m1, Calc_Matriz m2){
        if (m1.coluna!=m2.linha){
            Calc_Valida.Mensagem("O numero de colunas da primeira matriz "
                    +"deve ser igual ao numero de linhas da segunda", 
                    "Porcozio!", 
                    false);
            System.exit(0);
        } 
        int acumula;
        Calc_Matriz m = new Calc_Matriz();
        m.IniciaMatriz(m1.linha, m2.coluna);
        for(int i=0;i<m1.linha;i++){
            for(int j=0;j<m2.coluna;j++){
            acumula=0;
                for (int k=0;k<m1.coluna;k++){
                    acumula=acumula+m1.Matriz()[i][k]*m2.Matriz()[k][j];
                }
            m.Matriz()[i][j]=acumula;
            }
        }
        return m;
    }
    /** Recebe uma matriz e um inteiro e retorna o Produto Escalar
     ** @param m1 matriz 
     ** @param escalar valor escalar
     ** @return matriz
     **/
    public static Calc_Matriz produtoEscalar (Calc_Matriz m1, int escalar){
        for (int i=0; i<m1.linha;i++){
            for (int j=0; j<m1.coluna; j++){
                m1.Matriz()[i][j] = m1.Matriz()[i][j]*escalar;
            }
        }
        return m1;
    }
    /** Calcula o determinante de uma Matriz 3x3
     ** @param m1 matriz 
     ** @return matriz
     */
    public static int detMatriz (Calc_Matriz m1){
        if (m1.linha!=3 || m1.coluna!=3){
           Calc_Valida.Mensagem("Matriz deve ser 3x3", "Calculo de Determinante 3x3", false);
           System.exit(0);
        }
        int det[][] = m1.Matriz();
        int res = ((det[0][0]*det[1][1]*det[2][2])+
                (det[0][1]*det[1][2]*det[2][0])+
                (det[0][2]*det[1][0]*det[2][1]))-
                ((det[2][0]*det[1][1]*det[0][2])+
                (det[2][1]*det[1][2]*det[0][0])+
                (det[2][2]*det[1][0]*det[0][1]));
        return res;
    }
}

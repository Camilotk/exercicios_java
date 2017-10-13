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
public class Calc_Matriz {
    int linha, coluna, matriz[][];
    /**
     *  Sem construtor.
     */
    Calc_Matriz() {
        
    }
    /**
     ** Cria uma Matriz lendo as entradas
     **/
    public void CriaMatriz (){
        this.linha = Calc_Valida.leiaInt("Insira o número de linhas: ");
        this.coluna = Calc_Valida.leiaInt("Insira o número de colunas: ");
        this.matriz = new int [linha][coluna];
        
        for (int j=0; j<linha; j++){
            for (int i=0; i<coluna; i++){
                this.matriz[j][i] = Calc_Valida.leiaInt("Insira o valor da coluna "+i+" e da linha "+j+": ");
            }
        }
    }
    /**
     ** Cria uma Matriz com zero em todos os valores
     ** @param linhas número de linhas da matriz
     ** @param colunas número de colunas
     **/
    public void IniciaMatriz (int linhas, int colunas){
        this.linha = linhas;
        this.coluna = colunas;
        this.matriz = new int [linha][coluna];
        
        for (int j=0; j<linha; j++){
            for (int i=0; i<coluna; i++){
                this.matriz[j][i] = 0;
            }
        }
    }
    /**
     ** Método get para a matriz
     ** @return matriz
     **/
    public int[][] Matriz (){
        return this.matriz;
    }
    
    
}

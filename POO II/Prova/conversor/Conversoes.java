/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author camilo.070695
 */
public interface Conversoes {
    void converte (double valor, String origem, String destino);
    String retornaAbv (String escala);
    void adiciona_valor (String escala, double valor);
    double retornaValor(String escala);
    
}

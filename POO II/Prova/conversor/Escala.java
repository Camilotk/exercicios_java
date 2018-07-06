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
public class Escala {
    private String nome;
    private String abreviacao;
    private double valor;
    
    Escala (String nome, String abreviacao) {
        this.nome = nome;
        this.abreviacao = abreviacao;
    }
    
    Escala (String nome, String abreviacao, double valor) {
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.valor = valor;
    }
    
    public String getNome(){ return nome; }
    public String getAbreviacao() { return abreviacao; }
    public double getValor() { return valor; }
    
    public void setNome(String nome){ this.nome = nome; }
    public void setAbreviacao(String abreviacao) { this.abreviacao = abreviacao; } 
    public void setValor(double valor) { this.valor = valor; }
    
    
}

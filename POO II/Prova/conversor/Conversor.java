/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo.070695
 */
public class Conversor implements Conversoes {
    private List<Escala> escalas =  new ArrayList<>();
    
    public Conversor(){
        escalas.add(new Escala("Celsius", "ºC"));
        escalas.add(new Escala("Fahrenheit", "ºF"));
        escalas.add(new Escala("Kelvin", "K"));
    }
    
    public void adiciona_valor (String escala, double valor) {
        for (Escala esc : escalas) {
            if (esc.getNome().equals(escala)) {
                esc.setValor(valor);
            }
        }
    }
    
    public String retornaAbv (String escala) {
        for (Escala esc : escalas){
         if (esc.getNome().equals(escala)) {
            return " " + esc.getAbreviacao();
         }
        }
        return "";
    }
    
    public double retornaValor(String escala){
        for (Escala esc : escalas){
         if (esc.getNome().equals(escala)) {
            return esc.getValor();
         }
        }
        return 0;
    }
    
    public void converte(double valor, String origem, String destino) {
        if (origem.equals("Celsius") && destino.equals("Kelvin")) {
            double k = valor + 273;
            escalas.get(2).setValor(k);
        } else if (origem.equals("Kelvin") && destino.equals("Celsius")) {
            double c = (valor - 273);
            escalas.get(0).setValor(c);
        } else if (origem.equals("Celsius") && destino.equals("Fahrenheit")) {
            //F = 1, 8 ⋅ 37 + 32
           double f = ( 1.8 * valor + 32 );
           escalas.get(1).setValor(f);
        } else if (origem.equals("Fahrenheit") && destino.equals("Celsius")) {
           double c = ( (valor - 32) / 1.8 );
           escalas.get(0).setValor(c);
        } else if (origem.equals("Fahrenheit") && destino.equals("Kelvin")) {
           double k = ((valor - 32)/9) * 5 + 273;
           escalas.get(2).setValor(k);
        } else if (origem.equals("Kelvin") && destino.equals("Fahrenheit")) {
           double f = ((valor - 273)/5) * 9 + 32;
           escalas.get(1).setValor(f);
        }
    }
    
}

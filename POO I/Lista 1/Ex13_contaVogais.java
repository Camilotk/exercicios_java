package Lista_1;

import javax.swing.*;

public class Ex13_contaVogais {
    private static boolean comparaVogal (char a) {
        char vogais[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i<vogais.length; i++) {
            if (a == vogais[i]) {
                return true;
            }

        }
        return false;
    }
    public static int contaVogais (String palavra){
        int conta = 0;
        for (int i = 0; i<palavra.length(); i++) {
            if (comparaVogal(palavra.charAt(i))) {
                conta++;
            }
        }
        return conta;
    }
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog(null, "Digite uma palavra");
        JOptionPane.showMessageDialog(null, "A palavra "+ palavra +" tem "+contaVogais(palavra)+" vogais!");
    }
}

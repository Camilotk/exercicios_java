package Lista_1;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_1 {
    public static boolean eDigito(String str) {
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c))
                return false;
        }

        return true;
    }

    public static void cria_arquivo(String arquivo, String texto){

        try {
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i=0; i<texto.length(); i++) {
                if (texto.charAt(i) == ',') {
                    bufferedWriter.newLine();
                } else if (eDigito(String.valueOf(texto.charAt(i)))) {
                    bufferedWriter.write(texto.charAt(i));
                }
            }
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Erro ao escrever arquivo '"
                            + arquivo + "'");
        }
    }

    public static void cria_dicionario(String texto){
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Camil\\OneDrive\\dicionario.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i=0; i<texto.length(); i++) {
                if (texto.charAt(i) == ' ') {
                    bufferedWriter.newLine();
                } else if (texto.charAt(i) == '[' ||
                        texto.charAt(i) == ']' ||
                        texto.charAt(i) == ',') {
                    continue;
                } else {
                    bufferedWriter.write(texto.charAt(i));
                }
            }
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Erro ao escrever arquivo '"
                            + "dicionario.txt" + "'");
        }
    }
    private static int conta_string(ArrayList<String> palavras, String a){
        int i = 0;
        for (String e : palavras) {
            if (e.equals(a)){
                i++;
            }
        }
        return i;
    }
    private static void cria_csv (String arquivo, List<String> dicionario)
    {
        try
        {
            FileWriter writer = new FileWriter(arquivo);

            writer.append("PALAVRA");
            writer.append(',');
            writer.append("NUMERO");
            writer.append('\n');
            String[] chave;
            ArrayList<String> palavras = new ArrayList<String>();
            for(int i=0; i<dicionario.size(); i++){
                chave = dicionario.get(i).split(" ");
                for (int j=0; j<chave.length; j++) palavras.add(chave[j]);
            }
            for (int c=0; c<palavras.size();c++) {
                writer.append(palavras.get(c));
                writer.append(',');
                writer.append((Integer.toString(conta_string(palavras, palavras.get(c)))));
                writer.append('\n');
            }
            /*
            writer.append("MKYONG");
            writer.append(',');
            writer.append("26");
            writer.append('\n');
            */
            //generate whatever data you want
            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

        public static void main(String[] args) {
        String texto = " ";
        String texto_limpo = "C:\\Users\\Camil\\OneDrive\\texto_limpo.txt";
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        List<String> dicionario = new ArrayList<String>();

        System.out.printf("Digite o texto : ");
        while (in.hasNextLine()) {
            texto = in.nextLine();
            if (texto.isEmpty()) {
                break;
            }
            dicionario.add(texto);
        }
        cria_arquivo(texto_limpo, dicionario.toString());
        cria_dicionario(dicionario.toString());
        cria_csv("C:\\Users\\Camil\\OneDrive\\contagm.csv", dicionario);
    }
}

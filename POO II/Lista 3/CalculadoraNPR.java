package lista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.BiFunction;

public class CalculadoraNPR {
	File arquivoEntrada;
	File arquivoSaida;
	List<String> contas;
	Stack<String> conta;

	public CalculadoraNPR(String c_entrada, String c_saida) {
		arquivoEntrada = new File(c_entrada);
		arquivoSaida = new File(c_saida);
		contas = new ArrayList<>();
		conta = new Stack<>();
		this.leArquivo();
	}
	
	public static Double calc(String input) {
		Stack<Double> numeros = new Stack<>();
		Arrays.asList(input.split(" ")).stream().forEach(numero -> {
			switch(numero) {
			case "+":
				calcSign(numeros, (n1,n2) -> n2 + n1);
				break;
			case "-":
				calcSign(numeros, (n1,n2) -> n2 - n1);
				break;
			case "*":
				calcSign(numeros, (n1,n2) -> n2 * n1);
				break;
			case "/":
				calcSign(numeros, (n1, n2) -> n2 / n1);
				break;
			default:
				numeros.push(Double.parseDouble(numero));
			}
		});
		return numeros.pop();
	}
	
	public static Stack<Double> calcSign(Stack<Double> numeros, 
			BiFunction<Double, Double, Double> operação) {
		numeros.push(operação.apply(numeros.pop(), numeros.pop()));
		return numeros;
	}

	public void leArquivo() {
		try {
			FileReader entrada = new FileReader(arquivoEntrada.getAbsolutePath());
			BufferedReader entrada_ = new BufferedReader(entrada);
			if (arquivoEntrada.exists()) {
				String linha = "";
				Double[] resultado = new Double[10];
				int j = 0;
				while ((linha = entrada_.readLine()) != null) {
					contas.add(linha);
					resultado[j] = calc(linha);
					j++;
				}
				entrada_.close();
				gravaArquivo(resultado);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Erro arquivo " + arquivoEntrada.toString() + " não encontrado!");
		} catch (IOException e) {
			System.err.println("Não foi possivel ler o arquivo " + arquivoEntrada.toString());
		}
	}

	public void gravaArquivo(Double[] grava) throws IOException {
		for(Double f : grava) if (!(f == null)) System.out.println(f);
		FileWriter saida = new FileWriter(arquivoSaida.getAbsolutePath());
        BufferedWriter saida_ = new BufferedWriter(saida);
        for(int i = 0; i < grava.length; i++) {
			if (!(grava[i] == null)) saida_.write(grava[i].toString() + "\n");
		}
		saida_.close();
		
	}
}

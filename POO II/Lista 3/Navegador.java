package lista;

import java.util.ArrayList;
import java.util.Stack;

public class Navegador {
	ArrayList<Aba> abas = new ArrayList<>();
	Stack<String> histórico_navegador = new Stack<>();
	
	public void nova_aba() { abas.add(new Aba()); }
	
	public void alterarURL(Aba aba, String novaURL) {
		if (aba.hist_aba.pagina_atual.equals("127.0.0.1")) {
			aba.hist_aba.pagina_atual = novaURL;
			System.out.println("Acessando " + novaURL);
		} else {
			aba.hist_aba.mensagem = "Trocando de " + aba.hist_aba.pagina_atual;
			aba.hist_aba.histórico.add(aba.hist_aba.pagina_atual);
			histórico_navegador.push(aba.hist_aba.pagina_atual);
			aba.hist_aba.pagina_atual = novaURL;
			histórico_navegador.push(aba.hist_aba.pagina_atual);
			aba.hist_aba.mensagem = aba.hist_aba.mensagem + " para " + aba.hist_aba.pagina_atual;
			System.out.println(aba.hist_aba.mensagem);
		}
	}
	void retornar(Aba aba) {
		aba.hist_aba.mensagem = "Retornando de " + aba.hist_aba.pagina_atual;
		aba.hist_aba.pŕox_página.push(aba.hist_aba.pagina_atual);
		aba.hist_aba.pagina_atual = aba.hist_aba.histórico.pop();
		aba.hist_aba.mensagem = aba.hist_aba.mensagem + " para " + aba.hist_aba.pagina_atual;
		System.out.println(aba.hist_aba.mensagem);
		
	}
	void avançar(Aba aba) {
		aba.hist_aba.mensagem = "Avançando de " + aba.hist_aba.pagina_atual;
		aba.hist_aba.histórico.push(aba.hist_aba.pagina_atual);
		histórico_navegador.push(aba.hist_aba.pagina_atual);
		aba.hist_aba.pagina_atual = aba.hist_aba.pŕox_página.pop();
		aba.hist_aba.mensagem = aba.hist_aba.mensagem + " para " + aba.hist_aba.pagina_atual;
		System.out.println(aba.hist_aba.mensagem);
	}
	void imprime_histórico() {
		System.out.println("Imprimindo o histórico: ");
		for (String s : histórico_navegador) System.out.println(s);
	}
}

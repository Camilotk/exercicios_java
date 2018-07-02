package lista;
import java.util.HashMap;
import java.util.Map;

public class Usuario {
	Map<String, Localizacao> meusLocais = new HashMap<>();
	private String nome;
	
	void adicionarLocal(String nome, int latitude, int longitude) {
		Localizacao meuLocal = new Localizacao(latitude, longitude);
		meusLocais.put(nome, meuLocal);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

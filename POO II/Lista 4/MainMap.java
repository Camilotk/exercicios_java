package lista;

public class MainMap {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Usuario joao = new Usuario();
		joao.adicionarLocal("Casa", 29, 51);
		joao.adicionarLocal("Trabalho", 10, 12);
		joao.adicionarLocal("Faculdade", 30, 45);
		
		Usuario maria = new Usuario();
		maria.adicionarLocal("Casa", 19, 11);
		maria.adicionarLocal("Escola", 13, 13);
		maria.adicionarLocal("Clube", 24, 42);
		
		Mapa google = new Mapa();
		google.addUser(joao);
		google.addUser(maria);
		
		System.out.println();
		Localizacao local  = google.pesquisaLocal("Casa");
		System.out.println("Latitude: " + local.latitude + " Longitude: " + local.longitude );
		System.out.println("Classe: " + google.pesquisaLocal("Escola").getClass());
		
		System.out.println();
		
		google.listaLocaisPublicos(20, 40, 5, 43);
	}
}

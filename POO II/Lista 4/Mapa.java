package lista;

import java.util.ArrayList;
import java.util.Scanner;


public class Mapa {
	private ArrayList<Usuario> usuarios;
	
	public Mapa(){
		usuarios = new ArrayList<>();
	}
	
	public void addUser(Usuario usuario) { usuarios.add(usuario); };
	
	public void listaLocaisPublicos(int latitudeInicial, 
									int latitudeFinal, 
									int longitudeInicial, 
									int longitudeFinal) 
	{
		ArrayList<Integer> intervaloLat = new ArrayList<>();
		ArrayList<Integer> intervaloLon = new ArrayList<>();
		
		for(int x = latitudeInicial; x < latitudeFinal; x++) {
			intervaloLat.add(x);
		}
		for(int y = longitudeInicial; y < longitudeFinal; y++) {
			intervaloLon.add(y);
		}
		
		for (Usuario usuario : usuarios) {
			usuario.meusLocais.forEach( (chave, valor) -> { if (intervaloLat.contains(valor.longitude) 
															&& intervaloLon.contains(valor.longitude)) {
			System.out.println("Local: " + chave.toString()  + " Latitude: " + valor.latitude 
							 + " Longitude: " + valor.longitude);
			}});
		}
	}
	
	Localizacao pesquisaLocal(String nome) {
		int counter = 0;
		Localizacao local = null;
		for (Usuario usuario : usuarios) { if (usuario.meusLocais.containsKey(nome)) { counter++; } }
		if (counter == 0) {
			System.out.println("Não encontrado");
			return local;
		} if (counter == 1) {
			for (Usuario usuario : usuarios) { if (usuario.meusLocais.containsKey(nome)) { return usuario.meusLocais.get(nome); } }
		} else {
			ArrayList<Localizacao> encontrados = new ArrayList<Localizacao>();
			for (Usuario usuario : usuarios) { if (usuario.meusLocais.containsKey(nome)) { encontrados.add(usuario.meusLocais.get(nome)); } }
			for (int i = 0; i < encontrados.size(); i++) {
				System.out.println("N: " + i + " Latitude: " + encontrados.get(i).latitude + " Longitude: " 
									+ encontrados.get(i).longitude + "\n");
			}
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
			System.out.print("Digite o [N] da localização certa: ");
			int n = reader.nextInt();
			local = encontrados.get(n);
			return local;
		}
		return local;
	}
	
}

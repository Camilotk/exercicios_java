package lista;

public class MainLista {
	public static boolean precisaAtendimento(Paciente[] pacientes) {
		for (Paciente paciente : pacientes) {
			if (!paciente.atendido) {
				return true;
			}
		}
		System.out.println("Todos pacientes atendidos!");
		return false;
	}
	
	public static void main(String[] args) {
		// Ex.1 - Calculadora de Not. Polonesa Reversa
		System.out.println(" === Ex 1 ==== ");
		String caminho_e = "Lista 3/lista/Entrada.txt";
		String caminho_s = "Lista 3/lista/Saída.txt";
		@SuppressWarnings("unused")
		CalculadoraNPR calc = new CalculadoraNPR(caminho_e, caminho_s);
		System.out.println();
		// Ex.2 - Navegador + Abas
		System.out.println(" === Ex 2 ==== ");
		Navegador chrome = new Navegador();
		chrome.nova_aba();
		chrome.nova_aba();
		chrome.alterarURL(chrome.abas.get(0), "www.facebook.com.br");
		chrome.alterarURL(chrome.abas.get(0), "www.google.com");
		chrome.alterarURL(chrome.abas.get(0), "www.cancaonova.com.br");
		chrome.retornar(chrome.abas.get(0));
		chrome.alterarURL(chrome.abas.get(1), "www.xvideos.com");
		chrome.alterarURL(chrome.abas.get(1), "www.brasileirinhas.com.br");
		System.out.println();
		chrome.imprime_histórico();
		System.out.println();
		//Ex. 3 - Protocolo de Manchester
		System.out.println(" === Ex 3 ==== ");
		Médico hans_chicrute = new Médico(1,1);
		Médico dr_who = new Médico(2,2);
		Médico dr_rey = new Médico(3,1);
		Médico dr_frakenstein = new Médico(4,3);
		
		Paciente[] pacientes = new Paciente[10];
		pacientes[0] = new Paciente(1, 34, Ticket.VERMELHO);
		pacientes[1] = new Paciente(2, 12, Ticket.AMARELO);
		pacientes[2] = new Paciente(3, 45, Ticket.AZUL);
		pacientes[3] = new Paciente(4, 87, Ticket.VERMELHO);
		pacientes[4] = new Paciente(5, 23, Ticket.AMARELO);
		pacientes[5] = new Paciente(6, 9, Ticket.VERDE);
		pacientes[6] = new Paciente(7, 50, Ticket.VERDE);
		pacientes[7] = new Paciente(8, 17, Ticket.AZUL);
		pacientes[8] = new Paciente(9, 13, Ticket.VERMELHO);
		pacientes[9] = new Paciente(10, 39, Ticket.AMARELO);
		
		/*
		 * O laço dará a entender que todos esperaram mais de 1 hr
		 * porque 1 passada = 1 hora. Comentando o for que atende 
		 * por tempo todos serão atendidos por idade.
		 */
		
		while(precisaAtendimento(pacientes)) {
			hans_chicrute.atende(pacientes);
			dr_who.atende(pacientes);
			dr_rey.atende(pacientes);
			dr_frakenstein.atende(pacientes);
		}
	}
}

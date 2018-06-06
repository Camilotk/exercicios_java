package lista;

public class Paciente {
	int cod;
	int idade;
	Ticket ticket;
	boolean atendido = false;
	int espera = 0;
	
	Paciente(int cod, int idade, Ticket ticket){
		this.cod = cod;
		this.idade = idade;
		this.ticket = ticket;
	}
}

package lista;

public class Médico {
	/*
	 * Crie um sistema de atendimento com tickets que simula o atendimento de
	 * pessoas por 4 médicos em um hospital. Pacientes são cadastrados através do
	 * protocolo Manchester “modificado” de 4 cores (vermelho, amarelo, verde e
	 * azul). Pacientes em vermelho deverão ser atendidos imediatamente. Pacientes
	 * amarelos deverão ser atendidos com prioridade sobre os pacientes verdes de
	 * azuis. Pacientes verdes e azuis deverão ser atendidos por idade se estiverem
	 * esperando menos do que 1 hora, ou apenas por ordem de chegada se estiverem
	 * esperando por mais do que 1 hora. O sistema deverá indicar qual médico
	 * atendeu qual paciente, supondo que os médicos demoram: • médico 1: um
	 * paciente por período de tempo (por laço de for) • médico 2: um paciente por 2
	 * períodos de tempo • médico 3: um paciente por período de tempo • médico 4: um
	 * paciente por 3 períodos de tempo
	 */
	int cod;
	int pacientes_atendidos_turno;

	Médico(int cod, int pacientes_atendidos_turno) {
		this.cod = cod;
		this.pacientes_atendidos_turno = pacientes_atendidos_turno;
	}
	
	public int maiorIdade(Paciente[] p) {
		int maior_idade = 0;
		for (Paciente paciente : p) {
			if (paciente.idade > maior_idade && !paciente.atendido) {
				maior_idade = paciente.idade;
			}
		}
		return maior_idade;
	}
	
	public void atende(Paciente[] pacientes) {
		int i = 0;
		for (Paciente paciente : pacientes) {
			if ((!paciente.atendido) && paciente.ticket == Ticket.VERMELHO) {
				System.out.println("Médico " + this.cod + " atendendo: " + paciente.cod);
				paciente.atendido = true;
				i++;
			} 
			if(i >= pacientes_atendidos_turno) {
				break;
			}
		}
		for (Paciente paciente : pacientes) {
			if ((!paciente.atendido) && paciente.ticket == Ticket.AMARELO) {
				System.out.println("Médico " + this.cod + " atendendo: " + paciente.cod);
				paciente.atendido = true;
				i++;
			} 
			if(i >= pacientes_atendidos_turno) {
				break;
			}
		}
		
		for (Paciente paciente : pacientes) {
			if (paciente.espera >= 1 && paciente.atendido == false) {
				System.out.println("Médico " + this.cod + " atendendo: " + paciente.cod);
				paciente.atendido = true;
				i++;
			} 
			if(i >= pacientes_atendidos_turno) {
				break;
			}
		}
		
		for (Paciente paciente : pacientes) {
			if (paciente.idade == maiorIdade(pacientes)) {
				System.out.println("Médico " + this.cod + " atendendo: " + paciente.cod);
				paciente.atendido = true;
				i++;
			} 
			if(i >= pacientes_atendidos_turno) {
				break;
			}
		}
		for (Paciente paciente : pacientes) {
			paciente.espera += 1;
		}
	}
}

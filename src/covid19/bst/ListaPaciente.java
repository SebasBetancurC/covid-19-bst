package covid19.bst;

public class ListaPaciente {
	
	
	NodoPaciente head;
	
	
void insert(Paciente paciente) {
		
		NodoPaciente nuevoNodo = new NodoPaciente();
		nuevoNodo.paciente = paciente;
		
		if (head == null) {
			head = nuevoNodo;
		}
		
		else { 
			NodoPaciente tmp = head;
			while (tmp != null) {
				tmp = tmp.next;
				
				
			}
			
			tmp = nuevoNodo;
			
		}
		
	}


}

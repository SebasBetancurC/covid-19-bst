package covid19.bst;

public class ListaContinente {
	
	NodoContinente head;
	
void insert(Continente continente) {
		
		NodoContinente nuevoNodo = new NodoContinente();
		nuevoNodo.continente = continente;
		
		if (head == null) {
			head = nuevoNodo;
		}
		
		else { 
			NodoContinente tmp = head;
			while (tmp != null) {
				tmp = tmp.next;
				
				
			}
			
			tmp = nuevoNodo;
			
		}
		
	}

}

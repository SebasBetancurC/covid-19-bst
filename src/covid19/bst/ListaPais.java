package covid19.bst;

public class ListaPais {
	
	NodoPais head;
	
void insert(Pais pais) {
		
		NodoPais nuevoNodo = new NodoPais();
		nuevoNodo.pais = pais;
		
		if (head == null) {
			head = nuevoNodo;
		}
		
		else { 
			NodoPais tmp = head;
			while (tmp != null) {
				tmp = tmp.next;
				
				
			}
			
			tmp = nuevoNodo;
			
		}
		
	}

}

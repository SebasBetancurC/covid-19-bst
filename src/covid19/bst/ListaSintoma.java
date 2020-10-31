package covid19.bst;

public class ListaSintoma {
	
	NodoSintoma head;
	
void insert(Sintoma sintoma) {
		
		NodoSintoma nuevoNodo = new NodoSintoma();
		nuevoNodo.sintoma = sintoma;
		
		if (head == null) {
			head = nuevoNodo;
		}
		
		else { 
			NodoSintoma tmp = head;
			while (tmp != null) {
				tmp = tmp.next;
				
				
			}
			
			tmp = nuevoNodo;
			
		}
		
	}

}

package covid19.bst;


public class Mundo {

	String nombre;
	int cantidadContinentes;
	
	
Mundo(){
		
		continentesList = new ListaContinente();
	}
	
	ListaContinente continentesList;
	
	void agregarAvion (Continente continente) {
		continentesList.insert(continente);
		cantidadContinentes++;
	}
	
}

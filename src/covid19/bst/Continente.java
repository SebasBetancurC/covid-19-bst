package covid19.bst;

public class Continente {
	
	String nombre;
	int cantidadPaises;
	
	
	Continente(String vlrNombre){
		nombre = vlrNombre;
		paisesList = new ListaPais();
	}

	ListaPais paisesList;
	
    void agregarPais (Pais pais) {
	   paisesList.insert(pais);
	   cantidadPaises++;
      }
			

}

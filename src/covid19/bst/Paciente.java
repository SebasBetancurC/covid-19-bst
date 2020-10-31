package covid19.bst;

public class Paciente {
	
	String nombre;
	String id;
	int cantidadSintomas;
	
	
	void Sintoma(String vlrNombre){
		nombre = vlrNombre;
		sintomasList = new ListaSintoma();
	}

	ListaSintoma sintomasList;
	
    void agregarSintoma (Sintoma sintoma) {
	   sintomasList.insert(sintoma);
	   cantidadSintomas++;
      }
			

}

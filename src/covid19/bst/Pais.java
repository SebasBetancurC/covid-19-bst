package covid19.bst;


public class Pais {
	
	String nombre;
	int cantidadPacientes;
	
	
	
	
	void Paciente(String vlrNombre){
		nombre = vlrNombre;
		pacientesList = new ListaPaciente();
	}

	ListaPaciente pacientesList;
	
    void agregarPaciente (Paciente paciente) {
	   pacientesList.insert(paciente);
	   cantidadPacientes++;
      }
			

}

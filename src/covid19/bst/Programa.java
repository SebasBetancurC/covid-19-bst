package covid19.bst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Programa {

public static void main(String[] args) throws NumberFormatException, IOException {
		
	    Mundo tierra= new Mundo();
		
		BufferedReader bf = new BufferedReader(new FileReader("datos-proyecto-covid19.txt"));
		
		int cantidadContinentes  = Integer.parseInt(bf.readLine());
		
		
		String[] arrDatosContinente;
		String[] arrDatosPais;
		String[] arrDatosPaciente;
		for(int i=0; i < cantidadContinentes; i++) {
			arrDatosContinente = bf.readLine().split(",");
			Continente continente = new Continente(arrDatosContinente[0]);
			int cantidadPaises = Integer.parseInt(arrDatosContinente[1]);
			for(int j=0; j < cantidadPaises; j++); {
				arrDatosPais = bf.readLine().split(",");
				Pais pais = new Pais(arrDatosPais[0]);
				continente.agregarPais(pais);
				int cantidadPacientes = Integer.parseInt(arrDatosPais[1]);
				for(int k=0; k<cantidadPacientes; k++) {
					arrDatosPaciente = bf.readLine().split(",");
					Paciente paciente = new Paciente(arrDatosPaciente[0], Float.parseFloat(arrDatosPaciente[1]), Integer.parseInt(arrDatosPaciente[2]), Float.parseFloat(arrDatosPaciente[3]), Integer.parseInt(arrDatosPaciente[4]));
					pais.agregarPaciente(paciente);
				}
						
				
				
			}
					
			tierra.agregarContinente(continente);
		}
				
				
				
	}

}

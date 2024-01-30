package no;

public class Main {

	public static void main(String[] args) {
		AccesoADatos accesoADatos = new AccesoADatos(new DatabaseService());
		accesoADatos.getDatabaseService().getDatos();
		
	}

}

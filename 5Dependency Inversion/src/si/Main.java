package si;

public class Main {

	public static void main(String[] args) {
		
		// AccesoADatos accesoADatos = new AccesoADatos(new DatabaseService());
		AccesoADatos accesoADatos = new AccesoADatos(new ApiService());
		accesoADatos.getiConexion().getDatos();
		
	}

}

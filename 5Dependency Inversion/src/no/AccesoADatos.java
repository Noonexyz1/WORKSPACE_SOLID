package no;

// modulo de alto nivel
public class AccesoADatos {

	private DatabaseService databaseService;

	public AccesoADatos(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}

	
	public DatabaseService getDatabaseService() {
		return databaseService;
	}

	public void setDatabaseService(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
	
	
}

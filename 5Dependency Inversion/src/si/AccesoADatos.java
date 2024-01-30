package si;

public class AccesoADatos {

	private IConexion iConexion;

	
	public AccesoADatos(IConexion iConexion) {
		this.iConexion = iConexion;
	}


	public IConexion getiConexion() {
		return iConexion;
	}


	public void setiConexion(IConexion iConexion) {
		this.iConexion = iConexion;
	}

	
}

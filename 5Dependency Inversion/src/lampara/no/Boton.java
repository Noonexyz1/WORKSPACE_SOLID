package lampara.no;

public class Boton {
	
	// Boton depende directamente de la clase Lampara
	private Lampara lampara;
	
	public Boton(Lampara lampara) {
		this.lampara = lampara;
	}
	
	
	public void poll(boolean ordenes) {
		if (ordenes) {
			lampara.encender();
		} else {
			lampara.apagar();
		}
	}

	
}

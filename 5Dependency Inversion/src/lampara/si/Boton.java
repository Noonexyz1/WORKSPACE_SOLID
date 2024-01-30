package lampara.si;

public class Boton {
	
	// Boton depende directamente de la clase Lampara
	private ServicioBoton servicioBoton;
	
	public Boton(ServicioBoton servicioBoton) {
		this.servicioBoton =servicioBoton;
	}
	
	
	public void poll(boolean ordenes) {
		if (ordenes) {
			servicioBoton.encender();
		} else {
			servicioBoton.apagar();
		}
	}

	
}

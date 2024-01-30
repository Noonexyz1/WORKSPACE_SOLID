package lampara.si;

public class Auto implements ServicioBoton {
	
	@Override
	public void encender() {
		System.out.println("Encendido");
	}
	
	@Override
	public void apagar() {
		System.out.println("Apagado");
	}


}

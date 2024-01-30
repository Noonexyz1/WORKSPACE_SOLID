package lampara.si;

public class Main {

	public static void main(String[] args) {
		
		Boton boton = new Boton(new Lampara());
		//Boton boton1 = new Boton(new Auto());
		boton.poll(true);
		
	}
	
}

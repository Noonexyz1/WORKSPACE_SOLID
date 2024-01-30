package main.si;

public class MainSI {

	public static void main(String[] args) {
		
		Coche[] coches = {new Renault(),
						  new Audi(),
						  new Mercedes()};
		
		imprimirPrecioMedioCoche(coches);
		
	}
	
	public static void imprimirPrecioMedioCoche(Coche[] coches) {
		for (Coche coche : coches) {
			System.out.println(coche.precioMedioCoche());
		}
		
	}
	

}

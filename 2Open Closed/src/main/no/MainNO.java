package main.no;

public class MainNO {

	public static void main(String[] args) {
		
		Coche[] coches = {new Coche("Renault"),
						  new Coche("Audi")};

		// si agregamos otro coche, tendriamos que modificar el metodo
		
		imprimirPrecioMedioCoche(coches);
		
	}
	
	
	public static void imprimirPrecioMedioCoche(Coche[] coches) {
		for (Coche coche : coches) {
			if (coche.getMarcaCoche().equals("Renault")) {
				System.out.println("Precio: " + 18000);
			} else if (coche.getMarcaCoche().equals("Audi")) {
				System.out.println("Precio: " + 25000);
			} else {
				System.out.println("Coche no encontrado...");
			}
			
			// tendriamos que modificar el if para el nuevo coche (otro else if)
		}
		
	}
	
	
	

}

package main.si;

public class MainSI {

	public static void main(String[] args) {
		Coche[] coches = {new Renault(),
		          new Audi(),
		          new Mercedes()};

		imprimirNumAsientos(coches);
		
	}

	private static void imprimirNumAsientos(Coche[] coches) {
		for (Coche coche : coches) {
			System.out.println(coche.getNumDeAsientos());
			
		}
		
	}

}

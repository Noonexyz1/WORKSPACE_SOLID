package main.no;

public class MainNO {

	public static void main(String[] args) {

		Coche[] coches = {new Renault(),
				          new Audi(),
				          new Mercedes()};
		
		imprimirNumAsientos(coches);
		
	}
	
	
	public static void imprimirNumAsientos(Coche[] coches) {
		for (Coche coche : coches) {
			if (coche instanceof Renault) {
				System.out.println(numAsientosRenault(coche));
			} else if (coche instanceof Audi) {
				System.out.println(numAsientosAudi(coche));
			}  else if (coche instanceof Mercedes) {
				System.out.println(numAsientosMercedes(coche));
			} /* else if (coche instanceof Mercedes) {
				System.out.println(numAsientosMercedes(coche));
			} y esto no se debe hacer */
			
		}
	}


	private static int numAsientosRenault(Coche coche) {
		return coche.getNumDeAsientos();
	}
	private static int numAsientosMercedes(Coche coche) {
		return coche.getNumDeAsientos();
	}
	private static int numAsientosAudi(Coche coche) {
		return coche.getNumDeAsientos();
	}
	
	
}

package main.no;

public class CocheNO {

	private String marcaCoche;

	public CocheNO(String marca) {
		this.marcaCoche = marca;
	}

	public String getMarcaCoche() {
		return marcaCoche;
	}

	public void setMarcaCoche(String marca) {
		this.marcaCoche = marca;
	}
	
	public void guardarCocheDB(CocheNO coche) {
		// este metodo viola la primera regla
	}
	
}

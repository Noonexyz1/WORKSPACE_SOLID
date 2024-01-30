package main.si;

public abstract class Coche {
	
	private int numDeAsientos;

	
	public Coche() {
		
	}
	
	public abstract int getNumDeAsientos();

	public void setNumDeAsientos(int numDeAsientos) {
		this.numDeAsientos = numDeAsientos;
	}
	

}

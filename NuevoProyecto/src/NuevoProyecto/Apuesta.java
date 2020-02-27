package NuevoProyecto;
public class Apuesta {
	private int IDApuesta;
	private double cantidad;
	private String piloto;
	
	public Apuesta() {
		IDApuesta=0;
		cantidad=0.0;
		piloto="";
	}
	
	public Apuesta(int inIDApuesta, double inCantidad, String inPiloto) {
		this.IDApuesta=inIDApuesta;
		this.cantidad=inCantidad;
		this.piloto=inPiloto;
	}

	public int getIDApuesta() {
		return IDApuesta;
	}

	public void setIDApuesta(int iDApuesta) {
		IDApuesta = iDApuesta;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	
	public void mostarInformacionApuesta() {
		System.out.println("Este es el ID "+ IDApuesta+" la cantidad apostada "+cantidad+
				" y el piloto por el que apuestas "+piloto);
	}
	
}
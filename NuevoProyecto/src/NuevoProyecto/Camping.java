package NuevoProyecto;

public class Camping {
	
	private String nombre;
	private double CIF;
	private int plaza;
	private double precio;
	
	public Camping() {
		CIF=0.0;
		nombre="";
		plaza=0;
		precio=0.0;
	}
	
	public Camping(double inCIF, String inNombre, int inPlaza, double inPrecio) {
		CIF=inCIF;
		nombre=inNombre;
		plaza=inPlaza;
		precio=inPrecio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCIF() {
		return CIF;
	}

	public void setCIF(double cIF) {
		CIF = cIF;
	}

	public int getPlaza() {
		return plaza;
	}

	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrarInformacionCamping() {
		System.out.println("Este es el CIF "+CIF+" el nombre "+nombre+" la cantidad de plazas "+plaza+" y el precio "+precio);
	}
}

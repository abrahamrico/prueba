package NuevoProyecto;
public class Circuito {
	private String nombre;
	private String ubicacion;
	private double longitud;
	
	public Circuito() {
		nombre="";
		ubicacion="";
		longitud=0.0;
	}
	
	public Circuito(String inNombre, String inUbicacion, double inLongitud) {
		this.nombre=inNombre;
		this.ubicacion=inUbicacion;
		this.longitud=inLongitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public void mostarInformacionCircuito() {
		System.out.println("El nombre del circuito es "+nombre+" la ubicacion "+ubicacion+
				" la longitud "+longitud);
	}
}
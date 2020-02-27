package NuevoProyecto;

public class Persona {

	private String DNI;
	private String nombre;
	private int edad;
	private String nacionalidad;
	private boolean conductor;
	
	public Persona() {
		DNI="";
		nombre="";
		edad=0;
		nacionalidad="";
		conductor=true;
	}
	
	public Persona(String inDNI,String inNombre, int inEdad, String inNacionalidad, boolean inConductor) {
		DNI=inDNI;
		nombre=inNombre;
		edad=inEdad;
		nacionalidad=inNacionalidad;
		conductor=inConductor;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public boolean isConductor() {
		return conductor;
	}

	public void setConductor(boolean conductor) {
		this.conductor = conductor;
	}

	public void mostrarPersona() {
		System.out.println("El DNI es "+DNI+" el nombre es"+nombre+" la edad es "+edad+" la nacionalidad es "+nacionalidad+" es conductor "+conductor);
	}
}

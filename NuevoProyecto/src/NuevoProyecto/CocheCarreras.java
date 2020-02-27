package NuevoProyecto;
public class CocheCarreras {
	private String marca;
	private String modelo;
	private String piloto;
	
	public CocheCarreras() {
		marca="";
		modelo="";
		piloto="";
	}
	
	public CocheCarreras(String inMarca, String inModelo, String inPiloto ) {
		this.marca=inMarca;
		this.modelo=inModelo;
		this.piloto=inPiloto;				
	}
	
	public CocheCarreras(final CocheCarreras inCoche) {
		marca=inCoche.marca;
		modelo=inCoche.modelo;
		piloto=inCoche.piloto;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public void mostrarInformacionCoche() {
		System.out.println("Esta es la marca del coche "+marca+" el modelo "+modelo+
				" y el piloto "+piloto+"\n");
	}

}
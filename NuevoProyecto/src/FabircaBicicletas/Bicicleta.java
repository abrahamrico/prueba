package FabircaBicicletas;

import java.util.Calendar;

public class Bicicleta implements Comparable<Bicicleta> {
	private long numeroSerie;
	private String color;
	private String numeroBastidor;
	private Calendar fechaMontaje;
	private double precio;
	private String modeloPintura;
	
	public static final String COLOR_ROJO="rojo";
	public static final String COLOR_VERDE="verde";
	
	public long getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public Calendar getFechaMontaje() {
		return fechaMontaje;
	}

	public void setFechaMontaje(Calendar fechaMontaje) {
		this.fechaMontaje = fechaMontaje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getModePintura() {
		return modeloPintura;
	}

	public void setModePintura(String modePintura) {
		this.modeloPintura = modePintura;
	}

	public Bicicleta(long numeroSerie, String color, String numeroBastidor, Calendar fechaMontaje, double precio,
			String modePintura) {
		super();
		this.numeroSerie = numeroSerie;
		this.color = color;
		this.numeroBastidor = numeroBastidor;
		this.fechaMontaje = fechaMontaje;
		this.precio = precio;
		this.modeloPintura = modePintura;
	}
	
	public int compareTo(Bicicleta bici){
		int resultado=0;
		
		if(bici!=null) {
			if (bici.getColor().equals(COLOR_ROJO)) {
				resultado=1;
			}
			else {
				resultado=-1;
			}
		}
		else{
			resultado=0;
		}
		return resultado;
	}
	
	public String toString() {
		return "El numero de serie es "+numeroSerie+" el color "+color+" el numero de bastidor "+numeroBastidor+" la fecha de montaje "+fechaMontaje.getTime()
				+" el modelo de la pintura "+modeloPintura+" y el precio "+precio+"€.\n";
	}
	
}

package FabircaBicicletas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;


public class CadenaMontaje {
	private static LinkedList<Bicicleta> colaBicicletas=new LinkedList<Bicicleta>();
	private static String COLOR_MATE="mate";
	private static String COLOR_METALIZADO="metalizado";
	
	public LinkedList<Bicicleta> getColaBicicletas() {
		return colaBicicletas;
	}

	public void setColaBicicletas(LinkedList<Bicicleta> colaBicicletas) {
		CadenaMontaje.colaBicicletas = colaBicicletas;
	}
	
	public static void crearColaBicicletas() {
		long numeroSerie= crearNumeroSerie();
		String color=crearColor();
		String numeroBastidor=crearCodigoBastidor();
		Calendar fechaMontaje= new GregorianCalendar();
		double precio=crearPrecio();
		String modeloPintura=crearModeloPintura();
		
		colaBicicletas.addFirst(
				new Bicicleta(numeroSerie, color, numeroBastidor, fechaMontaje, precio, modeloPintura)
				);
		
	}
	
	private static long crearNumeroSerie() {
		long numeroSerie= Math.abs(new Random().nextLong());	
		return numeroSerie;
	}
	
	private static String crearCodigoBastidor() {
		String numeroBastidor= java.util.UUID.randomUUID().toString();;
		return numeroBastidor;
	}
	
	private static String crearModeloPintura() {
		String modelo="";
		Random selector=new Random();
		boolean valor;
		valor =selector.nextBoolean();
		if(valor) {
			modelo=COLOR_MATE;
		}
		else {
			modelo=COLOR_METALIZADO;	
		}
		return modelo;
	}
	
	private static String crearColor() {
		String color="";
		Random selector=new Random();
		boolean valor;
		valor =selector.nextBoolean();
		if(valor) {
			color=Bicicleta.COLOR_ROJO;
		}
		else {
			color=Bicicleta.COLOR_VERDE;	
		}
		return color;
	}
	
	private static double crearPrecio() {
		double numeroSerie=(double) Math.round(Math.random()*150);	
		return numeroSerie;
	}
	
	private static void modificarModeloPintura() {
		
	}

}

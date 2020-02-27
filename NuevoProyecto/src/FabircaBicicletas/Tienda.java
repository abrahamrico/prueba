package FabircaBicicletas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Tienda {
	private static LinkedList<Bicicleta> pilaBicicletas;
	private static ArrayList<Bicicleta> listaVendidas= new ArrayList<Bicicleta>();
	private double recaudaci�n;
	
	
	public ArrayList<Bicicleta> getListaVendidas() {
		return listaVendidas;
	}
	public void setListaVendidas(ArrayList<Bicicleta> listaVendidas) {
		Tienda.listaVendidas = listaVendidas;
	}
	public LinkedList<Bicicleta> getPilaBicicletas() {
		return pilaBicicletas;
	}
	public void setPilaBicicletas(LinkedList<Bicicleta> pilaBicicletas) {
		Tienda.pilaBicicletas = pilaBicicletas;
	}
	public double getRecaudaci�n() {
		return recaudaci�n;
	}
	public void setRecaudaci�n(double recaudaci�n) {
		this.recaudaci�n = recaudaci�n;
	}
	
	public static void ordenarPilaColores() {
		Collections.sort(pilaBicicletas);
	}
	
	public static void obtenerRecaudacion(LinkedList<Bicicleta> pilaBici) {
		double suma;
		double recaudaci�n=0;
		for(Bicicleta bici: pilaBici) {
			suma=bici.getPrecio();
			recaudaci�n+=suma;
		}
		System.out.println("Esta es la recaudaci�n total "+recaudaci�n+"�");
	}
	
	public void venderBicicleta() {
		//pilaBicicletas.pop();
		listaVendidas.add(pilaBicicletas.pop());
	}
}

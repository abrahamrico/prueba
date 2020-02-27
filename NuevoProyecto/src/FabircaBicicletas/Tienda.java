package FabircaBicicletas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Tienda {
	private static LinkedList<Bicicleta> pilaBicicletas;
	private static ArrayList<Bicicleta> listaVendidas= new ArrayList<Bicicleta>();
	private double recaudación;
	
	
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
	public double getRecaudación() {
		return recaudación;
	}
	public void setRecaudación(double recaudación) {
		this.recaudación = recaudación;
	}
	
	public static void ordenarPilaColores() {
		Collections.sort(pilaBicicletas);
	}
	
	public static void obtenerRecaudacion(LinkedList<Bicicleta> pilaBici) {
		double suma;
		double recaudación=0;
		for(Bicicleta bici: pilaBici) {
			suma=bici.getPrecio();
			recaudación+=suma;
		}
		System.out.println("Esta es la recaudación total "+recaudación+"€");
	}
	
	public void venderBicicleta() {
		//pilaBicicletas.pop();
		listaVendidas.add(pilaBicicletas.pop());
	}
}

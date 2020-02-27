package FabircaBicicletas;

import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpresaBicicleta {
	static Tienda tienda= new Tienda();
	static CadenaMontaje cadena= new CadenaMontaje();
	public static void main(String[] args) throws IOException{
		int selector;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		do {
			System.out.println("1.Crear bicicletas en la cadena de montaje. \n2.Mostrar información de las bicis creadas. \n3.Obtener recaudación."
					+ "\n4.Ordenar pila bicicletas por color. \n5.Vender bicicleta. \n6.Salir");
			selector=Integer.parseInt(bufferLectura.readLine());
			
			switch(selector) {
			case 1:
				crearBicicleta();
				break;
			case 2:
				mostrarBicicletas();
				break;
			case 3:
				Tienda.obtenerRecaudacion(tienda.getPilaBicicletas());
				break;
			case 4:
				ordenarPila();
				break;
			case 5:
				venderBicicleta();
				break;
				default:
					System.out.println("Hasta luego");
			}
		}while(selector!=6);
	}
	
	private static void crearBicicleta() throws IOException{
		int cantidadBicis;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		System.out.println("Introduzca cuantas bicis vas a crear");
		cantidadBicis=Integer.parseInt(bufferLectura.readLine());
		
		for (int i=0;i<cantidadBicis;i++){
			CadenaMontaje.crearColaBicicletas();
			//Añado las bicicletas de la lista en la pila
			
		}
		tienda.setPilaBicicletas(cadena.getColaBicicletas());
		//Aqui elimino la cola de bcicletas que tengo
		cadena.getColaBicicletas().remove();
	}
	
	private static void mostrarBicicletas() {
		
		if (!cadena.getColaBicicletas().isEmpty()) {
		System.out.println(tienda.getPilaBicicletas().toString());}
		else {
			System.out.println("No has creado ninguna bicicleta");
		}
	}
	
	private static void ordenarPila() {
		Collections.sort(tienda.getPilaBicicletas());
	}
	
	private static void venderBicicleta() throws IOException{
		int selector;
		String color;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		
		if (!cadena.getColaBicicletas().isEmpty()) {
			System.out.println("Como quieres comprar la bici. \n1.Por color. \n2.Por orden.");
			selector=Integer.parseInt(bufferLectura.readLine());
			
			switch(selector) {
			case 1:
				System.out.println("Que color quieres de bici, rojo o verde");
				color=bufferLectura.readLine();
				
				for(Bicicleta bici: tienda.getPilaBicicletas()) {
					if (bici.getColor().equals(color)){
						//No vende por color
						tienda.venderBicicleta();
						System.out.println(tienda.getListaVendidas().toString());
					}
					else {
						System.out.println("Ese color no existe");
					}
				}
				break;
			case 2:
				tienda.venderBicicleta();
				System.out.println(tienda.getListaVendidas().toString());
				break;
				default:
			}
		}
		else {
			System.out.println("No has creado ninguna bicicleta");
		}
	}
}

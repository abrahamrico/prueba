package NuevoProyecto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CarreraCoches {
	
	static CocheCarreras coche[]=null;
	static String fecha;
	static String clima, ganador="";
	static Apuesta apuesta[]=null;
	static int total=0;
	static double longitud=0;

	
	public static void main(String args[]) throws IOException , InterruptedException {
		
		int selector=0;
		String variable="";
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		
		System.out.println("Dime la fecha de la carrera");
		fecha=bufferLectura.readLine();
		selectorClima();
		
		do {
		System.out.println("La fecha de la carrera es "+fecha+" el clima "+clima
				+ " Tienes un menú para hacer diferentes cosas:\n"
				+ "1. Crear coches.\n2. Mostrar información de los coches.\n"
				+ "3. Crear circuito. \n4. Realizar apuesta.\n5. Iniciar carrera. \n"
				+ "6. Salir.");
		
		System.out.println("Selecciona una opción");
		selector=Integer.parseInt(bufferLectura.readLine());
		
			switch(selector) {
			case 1:
				crearCoche();
			break;
			case 2:
				mostrarInformacionCoches();
			break;
			case 3:
				crearCircuito();
			break;
			case 4:
				realizarApuesta();
			break;
			case 5:
				iniciarCarrera();
			break;
			default:
				System.out.println("Hasta luego");
			}
		
		
		}while(selector!=6);
		System.out.println(variable);
	
	}
	
	private static void crearCoche() throws IOException{
		String marca;
		String modelo;
		String piloto;
		int cantidadCoches;
		
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		System.out.println("Cuantos coches quieres crear");
		cantidadCoches=Integer.parseInt(bufferLectura.readLine());
		
		coche=new CocheCarreras[cantidadCoches];
		for (int i=0;i<cantidadCoches;i++) { 
		
		System.out.println("dime la marca");
		marca=bufferLectura.readLine();
		System.out.println("dime el modelo");
		modelo=bufferLectura.readLine();
		System.out.println("dime el nombre del piloto");
		piloto=bufferLectura.readLine();
		
		
		coche[i]= new CocheCarreras(marca,modelo,piloto);
		coche[i].mostrarInformacionCoche();
		}
	}
	
	private static void mostrarInformacionCoches() {
		for (int i=0;i<(coche.length);i++) {
			coche[i].mostrarInformacionCoche();
		}
	}

	private static void crearCircuito() throws IOException{
		String nombre;
		String ubicacion;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
	
		System.out.println("dime el nombre");
		nombre=bufferLectura.readLine();
		System.out.println("dime la ubicación");
		ubicacion=bufferLectura.readLine();
		System.out.println("dime la longitud");
		longitud=Double.parseDouble(bufferLectura.readLine());
		
		Circuito circuito1= new Circuito(nombre, ubicacion,longitud);
		circuito1.mostarInformacionCircuito();
	}
	
	private static void realizarApuesta() throws IOException{
		int IDApuesta, cantidadApuestas;
		double cantidad;
		String piloto;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		System.out.println("Cuantas apuestas quieres realizar");
		cantidadApuestas=Integer.parseInt(bufferLectura.readLine());

				
		apuesta=new Apuesta[cantidadApuestas];
		
		for (int i=0;i<cantidadApuestas;i++) { 
		
		
		IDApuesta=i+1;
		System.out.println("dime la cantidad que apuestas");
		cantidad=Double.parseDouble(bufferLectura.readLine());
		piloto=comprobarPiloto();
		
		System.out.println("EL PILOTO "+piloto);
		
		apuesta[i]= new Apuesta(IDApuesta,cantidad,piloto);
		apuesta[i].mostarInformacionApuesta();
		}
		
	}

	private static void selectorClima() throws IOException{
		int seleccion;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		System.out.println("Selecciona la climatologia: \n1.Soleado \n2.Nublado. \n3.Lluvioso.");
		seleccion=Integer.parseInt(bufferLectura.readLine());
		
		switch(seleccion) {
		case 1:
			clima="Soleado";
			break;
		case 2:
			clima="Nublado";
			break;
		case 3:
			clima="Lluvioso";
			break;
		default:
			System.out.println("Elección no valida");
		}
	}
	
	private static String comprobarPiloto() throws IOException{
		String piloto;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		do {
			if (coche.length!=0) {
				System.out.println("dime el nombre del piloto");
				piloto=bufferLectura.readLine();
				
				for (int i=0;i<(coche.length);i++){
					if (piloto.equals(coche[i].getPiloto()))
					{
						piloto=coche[i].getPiloto();
					}
					else 
					{
						return("Ninguna coincidencia");
					}
				}
			}
			else {
				return("No hay ningún piloto");
			}
		}while(piloto!=null);
		return(piloto);
	}
	
	private static void iniciarCarrera() throws IOException , InterruptedException {
		int distancia[], calculoDistancia=0, aleatorio;
		distancia= new int[coche.length];
		
		if (coche.length!=0 && longitud!=0) {
			do {
				for (int i=0;i<coche.length;i++) {
					aleatorio=(int)(Math.random()*3+1);
					switch(aleatorio) {
					case 1:
						distancia[i]+=10;
						break;
					case 2:
						distancia[i]+=50;
						break;
					case 3:
						distancia[i]+=100;
						break;
						default:
					}
					
					System.out.println("EL piloto es "+coche[i].getPiloto()+
							" distacia recorrida "+distancia[i]+"\n");
					
					if (calculoDistancia<distancia[i]) 
					{
						calculoDistancia=distancia[i];
						ganador=coche[i].getPiloto();
					}
				}
				Thread.sleep(1500);
 
			}while(calculoDistancia<=longitud);
			System.out.println("El ganador es "+ganador+"\n");
		}
		else 
		{
			System.out.println("No tienes ningún coche introducido o no has creado el circuito");
		}
	}
		
}

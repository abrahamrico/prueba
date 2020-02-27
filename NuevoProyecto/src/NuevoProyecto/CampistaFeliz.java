package NuevoProyecto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class CampistaFeliz {
	static Camping listaCampings[]=null;
	
	public static void main(String[] args) throws IOException{
	int eleccion;
	InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
	BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
	
		do {
		System.out.println("Dime la eleccion que quieres hacer: \n1. Crear camping \n2. Ingresar caravana \n3. Salir");
		eleccion=Integer.parseInt(bufferLectura.readLine());
		
		switch (eleccion) {
		case 1:
			crearCamping();
			break;
		case 2:
			ingresarCaravana();;
		break;
		case 3:
			System.out.println("Hasta luego");
		break;
		}
		
		}while(eleccion!=3);
	}
	
	private static void crearCamping() throws IOException{
		String nombre;
		double CIF,precio;
		int cantidadPlazas, plaza, cantidadCampings;
		
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		System.out.println("Dime la cantidad de camping que quieres crear");
		cantidadCampings=Integer.parseInt(bufferLectura.readLine());
		 listaCampings=new Camping[cantidadCampings];
		for (int i=0;i<cantidadCampings;i++){
			
			System.out.println("Dime el CIF del camping");
			CIF=Integer.parseInt(bufferLectura.readLine());
			System.out.println("Dime el nombre del camping");
			nombre=bufferLectura.readLine();
			System.out.println("Dime las plazas del camping");
			cantidadPlazas=Integer.parseInt(bufferLectura.readLine());
			plaza=cantidadPlazas;
			System.out.println("Dime el precio del camping");
			precio=Double.parseDouble(bufferLectura.readLine());
			listaCampings[i]= new Camping(CIF,nombre,plaza,precio);
			listaCampings[i].mostrarInformacionCamping();
		}
	}
	
	private static void ingresarCaravana() throws IOException{
		String seleccionCamping, matricula;
		Caravana caravana;
		int año, ocupantes[], cantidadOcupantes;
		int plazas;
		Date horaEntrada=new Date(), horaSalida=null;
		boolean conductor;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		System.out.println("Dime la cantidad de caravanas que quieres crear");
		seleccionCamping=bufferLectura.readLine();
		
		if (listaCampings.length!=0) {
			System.out.println("Dime en que camping vas a meter la caravana");
			seleccionCamping=bufferLectura.readLine();
			
			for (int i=0;i<(listaCampings.length);i++){
				if (seleccionCamping.equals(listaCampings[i].getNombre()))
				{
					plazas=listaCampings[i].getPlaza();
					System.out.println(plazas);
					
					System.out.println("Dime la matricula de la caravana");
					matricula=bufferLectura.readLine();
					System.out.println("Dime el año de la caravana");
					año=Integer.parseInt(bufferLectura.readLine());
					System.out.println("Dime la cantidad de ocupantes de la caravana");
					cantidadOcupantes=Integer.parseInt(bufferLectura.readLine());
					ocupantes=new int[cantidadOcupantes];

					caravana= new Caravana(matricula,año,ocupantes,horaEntrada,horaSalida);
					caravana.mostrarCaravana();
				}
				else 
				{
					System.out.println("Ninguna coincidencia");
				}
			}
		}
		else {
			System.out.println("No hay ningún camping");
		}
	}
	/*private static void mostrarRecaudacionCamping() throws IOException{
		String camping;
		double recaudacion;
		
		InputStreamReader manejadorEntrada= new InputStreamReader(System.in);
		BufferedReader bufferLectura= new BufferedReader(manejadorEntrada);
		
		System.out.println("¿La recaudación de que camping quieres mostrar?");
		camping=bufferLectura.readLine();
		
		do {
			if (listaCampings.length!=0) {
				System.out.println("dime el nombre del piloto");
				camping=bufferLectura.readLine();
				
				for (int i=0;i<(listaCampings.length);i++){
					if (camping.equals(listaCampings[i].getNombre()))
					{
						recaudacion=listaCampings[i].getRecaudacion();
					}
					else 
					{
						return("Ninguna coincidencia");
					}
				}
			}
			else {
				return("No hay ningún camping");
			}
		}while(piloto!=null);
	}*/
}

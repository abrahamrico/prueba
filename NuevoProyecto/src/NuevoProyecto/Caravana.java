package NuevoProyecto;
import java.util.Date;
public class Caravana {

	private String matricula;
	private int a�o;
	private int ocupantes[];
	private Date horaEntrada= new Date();
	private Date horaSalida=null;
	
	public Caravana() {
		matricula="";
		a�o=0;
		ocupantes=null;
		horaEntrada=null;
		horaSalida=null;
	}
	
	public Caravana(String inMatricula,int inA�o, int inOcupantes[], Date inHoraEntrada,Date inHoraSalida) {
		matricula=inMatricula;
		a�o=inA�o;
		ocupantes=inOcupantes;
		horaEntrada=inHoraEntrada;
		horaSalida=inHoraSalida;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int[] getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(int ocupantes[]) {
		this.ocupantes = ocupantes;
	}

	public Date getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public void mostrarCaravana() {
		System.out.println("La matricula de la caravana es "+matricula+" el a�o es "+a�o+" los ocupantes "+ocupantes.length
				+" la hora de entrada "+horaEntrada+" y la hora de salida es "+horaSalida);
	}
}

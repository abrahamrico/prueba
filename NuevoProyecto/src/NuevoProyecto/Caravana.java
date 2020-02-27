package NuevoProyecto;
import java.util.Date;
public class Caravana {

	private String matricula;
	private int año;
	private int ocupantes[];
	private Date horaEntrada= new Date();
	private Date horaSalida=null;
	
	public Caravana() {
		matricula="";
		año=0;
		ocupantes=null;
		horaEntrada=null;
		horaSalida=null;
	}
	
	public Caravana(String inMatricula,int inAño, int inOcupantes[], Date inHoraEntrada,Date inHoraSalida) {
		matricula=inMatricula;
		año=inAño;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		System.out.println("La matricula de la caravana es "+matricula+" el año es "+año+" los ocupantes "+ocupantes.length
				+" la hora de entrada "+horaEntrada+" y la hora de salida es "+horaSalida);
	}
}

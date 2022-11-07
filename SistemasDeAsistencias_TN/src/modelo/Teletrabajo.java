package modelo;

import java.time.LocalDate;

public class Teletrabajo extends Asistencia {
private String motivo;
private int tareasRealizadas;
public Teletrabajo(int idAsistencia, LocalDate fecha, String legajo, String motivo, int tareasRealizadas) throws Exception {
	super(idAsistencia, fecha, legajo);
	this.motivo = motivo;
	this.setTareasRealizadas(tareasRealizadas);
}
public String getMotivo() {
	return motivo;
}
public void setMotivo(String motivo) {
	this.motivo = motivo;
}
public int getTareasRealizadas() {
	return tareasRealizadas;
}
public void setTareasRealizadas(int tareasRealizadas) throws Exception {
	
	if(tareasRealizadas>8) {
	throw new Exception("hay demasiadas tareas :(");	
	}
	this.tareasRealizadas = tareasRealizadas;
}


@Override
public double calcularHorasTrabajadas() {
double tarea=this.tareasRealizadas*1.5;
	return tarea;
}
@Override
public String toString() {
	return "\nTeletrabajo [motivo=" + motivo + ", tareasRealizadas=" + tareasRealizadas + ","+super.toString();
}


}

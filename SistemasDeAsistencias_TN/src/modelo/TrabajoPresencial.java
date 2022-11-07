package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrabajoPresencial extends Asistencia {
private LocalTime horaDesde;
private LocalTime horaHasta;

public TrabajoPresencial(int idAsistencia, LocalDate fecha, String legajo, LocalTime horaDesde, LocalTime horaHasta) {
	super(idAsistencia, fecha, legajo);
	this.horaDesde = horaDesde;
	this.horaHasta = horaHasta;
}

public LocalTime getHoraDesde() {
	return horaDesde;
}

public void setHoraDesde(LocalTime horaDesde) {
	this.horaDesde = horaDesde;
}

public LocalTime getHoraHasta() {
	return horaHasta;
}

public void setHoraHasta(LocalTime horaHasta) {
	this.horaHasta = horaHasta;
}



@Override
public double calcularHorasTrabajadas() {
double horas=(this.horaHasta.getHour()-this.horaDesde.getHour())*60+((this.horaHasta.getMinute()-this.horaDesde.getMinute())/60);
	return horas;
}

@Override
public String toString() {
	return "\nTrabajoPresencial [horaDesde=" + horaDesde + ", horaHasta=" + horaHasta + ","+super.toString();
}

}

package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Asistencia> asistencias;

	public Sistema() {

		this.asistencias = new ArrayList<Asistencia>();
	}

	public Asistencia traerAsistencia(LocalDate fecha, String legajo) {
		Asistencia asi = null;
		int i = 0;
		while (asi == null && i < asistencias.size()) {
			if (asistencias.get(i).getFecha().equals(fecha) && asistencias.get(i).getLegajo().equals(legajo)) {
				asi = asistencias.get(i);
			}
			i++;
		}

		return asi;
	}

	public List<Asistencia> traerAsistencia(LocalDate fecha) {
		List<Asistencia> lista = new ArrayList<Asistencia>();
		for (int i = 0; i < asistencias.size(); i++) {
			if (asistencias.get(i).getFecha().equals(fecha)) {
				lista.add(asistencias.get(i));
			}
		}
		return lista;
	}

	public List<Asistencia> traerAsistencia(boolean esPresencial) {
		List<Asistencia> lista = new ArrayList<Asistencia>();
		for (int i = 0; i < asistencias.size(); i++) {
			if (asistencias.get(i) instanceof TrabajoPresencial) {
				lista.add(asistencias.get(i));
			}
		}
		return lista;
	}

	public Asistencia traerAsistencia(int id) {
		Asistencia asi = null;
		int i = 0;
		while (asi == null && i < asistencias.size()) {
			if (asistencias.get(i).getIdAsistencia() == id) {
				asi = asistencias.get(i);
			}
			i++;
		}
		return asi;
	}

	public boolean agregarTrabajoPresencial(LocalDate fecha, String legajo, LocalTime horaDesde, LocalTime horaHasta)
			throws Exception {
		Asistencia aux = traerAsistencia(fecha, legajo);
		if (aux != null) {
			throw new Exception("ya existe una asistencia con un mismo legajo y fecha");
		}
		int proxId = 1;
		if (asistencias.size() > 0) {
			proxId = asistencias.get(asistencias.size() - 1).getIdAsistencia() + 1;
		}
		return this.asistencias.add(new TrabajoPresencial(proxId, fecha, legajo, horaDesde, horaHasta));
	}

	public boolean agregarTeletrabajo(LocalDate fecha, String legajo, String motivo, int tareasRealizadas)
			throws Exception {
		int proxId = 1;

		if (0 < asistencias.size()) {
			proxId = asistencias.get(asistencias.size() - 1).getIdAsistencia() + 1;
		}
		return this.asistencias.add(new Teletrabajo(proxId, fecha, legajo, motivo, tareasRealizadas));
	}

	public List<Asistencia> getAsistencias() {
		return asistencias;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSistema [asistencias=" + asistencias + "]";
	}

}

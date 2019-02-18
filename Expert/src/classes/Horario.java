package classes;

/**
 * @author Joanes M. de Souto / Emerson Sousa
 *
 */

public class Horario {

	private String turno;
	private Integer horaInicio;
	private Integer horaFim;

	public Horario(String turno, Integer horaInicio, Integer horaFim) {
		this.turno = turno;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Integer getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Integer getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Integer horaFim) {
		this.horaFim = horaFim;
	}

}

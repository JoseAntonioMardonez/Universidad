public class Profesor extends Trabajador {
	private String tipoContrato;

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public String asignarHorario() {
		throw new UnsupportedOperationException();
	}
}
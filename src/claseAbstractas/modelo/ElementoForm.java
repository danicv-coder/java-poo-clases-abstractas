package claseAbstractas.modelo;

abstract public class ElementoForm {
	protected String valor;
	protected String nombre;

	public ElementoForm() {
	}

	public ElementoForm(String nombre) {
		this();
		this.nombre = nombre;
	}

	abstract public String dibujarHtml();
}

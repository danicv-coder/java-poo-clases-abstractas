package claseAbstractas.modelo;

public class TextareaForm extends ElementoForm {
	private int filas;
	private int columna;

	public TextareaForm(String nombre) {
		super(nombre);
	}

	public TextareaForm(String nombre, int filas, int columna) {
		super(nombre);
		this.filas = filas;
		this.columna = columna;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public String dibujarHtml() {
		// TODO Auto-generated method stub
		return "<textarea name='" + this.nombre + "' cols='" + this.columna + "' rows='" + this.filas + "'>"
				+ this.valor + "</textarea>";
	}

}

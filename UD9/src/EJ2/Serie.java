package EJ2;

import javax.swing.JOptionPane;

public class Serie implements Empleable {
	private final int N_TEMP = 3;
	private final boolean ENT_DEF = false;

	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String autor;

	public Serie() {
		this.titulo = "";
		this.genero = "";
		this.autor = "";
		this.entregado = ENT_DEF;
		this.nTemporadas = N_TEMP;
	}

	public Serie(String titulo, String autor) {
		this.titulo = titulo;
		this.genero = "";
		this.autor = autor;
		this.entregado = ENT_DEF;
		this.nTemporadas = N_TEMP;
	}

	public Serie(String titulo, String autor, String genero, int nTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.nTemporadas = nTemporadas;
		this.entregado = ENT_DEF;

	}
	
	public void imprimirSerie() {
		System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nGenero: " + this.genero
				+ "\nTemporadas: " + this.nTemporadas);
		if (this.entregado) {
			System.out.println("Entregado: SI");
		} else {
			System.out.println("Entregado: NO");
		}
		System.out.println("-------------------------");
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado(boolean entregado) {
		if (entregado) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void compareTo(Object a) {
		if (a instanceof Serie) {
			if (this.nTemporadas == ((Serie) a).getnTemporadas()) {
				JOptionPane.showMessageDialog(null, "Las series tiene el mismo numero de temporadas");
			}
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}

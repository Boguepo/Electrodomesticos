package EJ2;

import javax.swing.JOptionPane;

public class Videojuego implements Empleable {
	private final int H_DEF = 10;
	private boolean ENT_DEF = false;
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = H_DEF;
		this.entregado = ENT_DEF;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENT_DEF;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
		this.entregado = ENT_DEF;
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
		if(entregado) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void compareTo(Object a) {
		if (a instanceof Videojuego) {
			if (this.horasEstimadas == ((Videojuego) a).getHorasEstimadas()) {
				JOptionPane.showMessageDialog(null, "Las series tiene el mismo numero de temporadas");
			}
		}
		
	}
	
	public void imprimirVG() {
		System.out.println("Titulo: " + this.titulo + "\nGenero: " + this.genero + "\nCompañia: " + this.compañia
				+ "\nHoras estimadas de juego: " + this.horasEstimadas);
		if (this.entregado) {
			System.out.println("Entregado: SI");
		} else {
			System.out.println("Entregado: NO");
		}
		System.out.println("-------------------------");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
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

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	
}

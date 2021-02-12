package EJ2;

import javax.swing.JOptionPane;

public class Videojuego implements Empleable {
	private final int H_DEF = 10;
	private boolean ENT_DEF = false;
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = H_DEF;
		this.entregado = ENT_DEF;
		this.genero = "";
		this.compa�ia = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENT_DEF;
		this.genero = "";
		this.compa�ia = "";
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
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
		System.out.println("Titulo: " + this.titulo + "\nGenero: " + this.genero + "\nCompa�ia: " + this.compa�ia
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
	
}

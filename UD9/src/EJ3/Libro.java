package EJ3;

import javax.swing.JOptionPane;

public class Libro {
	
	private String titulo;
	private String autor;
	private int nPaginas;
	private String isbn;
	
	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.isbn = "";
		this.nPaginas = 0;
	}
	
	
	public Libro(String titulo, String autor, int nPaginas, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
		this.isbn = isbn;
	}
	
	public void imprimirLibro() {
		JOptionPane.showMessageDialog(null, "El libro "+this.titulo+" con ISBN "+this.isbn+" creado por el autor "+this.autor+" tiene "+this.nPaginas+" paginas");
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}

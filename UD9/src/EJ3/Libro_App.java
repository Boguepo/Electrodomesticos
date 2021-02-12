package EJ3;

public class Libro_App {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Las margaritas","Elenea Hoz",467,"1122894BB");
		
		Libro libro2 = new Libro("El cielo","Mathew Edson",580,"3327534UH");
		
		
		libro1.imprimirLibro();
		
		libro2.imprimirLibro();
		
		if(libro1.getnPaginas() > libro2.getnPaginas()) {
			libro1.imprimirLibro();
		}else {
			libro2.imprimirLibro();
		}

	}

}

package EJ2;

import javax.swing.JOptionPane;

public class Serie_App {

	public static void main(String[] args) {
		Serie series[] = new Serie[5];
		
		Videojuego vgs[] = new Videojuego[5];
		
		series[0] = new Serie("Outlander","Jose Perez");
		series[1] = new Serie();
		series[2] = new Serie();
		series[3] = new Serie("Hache", "Almodovar", "Apasionada",4);
		series[4] = new Serie("Lupin","Pierre Montblanc","Ladrones",1);
		
		vgs[0] = new Videojuego();
		vgs[1] = new Videojuego("Cyberpunk 2077",30);
		vgs[2] = new Videojuego("Skyrim",60,"Mundo abierto, Exploracion","Bethesda");
		vgs[3] = new Videojuego("Mario Bros",20);
		vgs[4] = new Videojuego();
		
		series[1].entregar();
		series[4].entregar();
		
		vgs[3].entregar();
		vgs[4].entregar();
		
		int numSeries = 0, numVG = 0;
		for (int i = 0; i < vgs.length && i < series.length; i++) {
			if(series[i].isEntregado()) {
				series[i].imprimirSerie();
				numSeries++;
			}
			
			if(vgs[i].isEntregado()) {
				vgs[i].imprimirVG();
				numVG++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Han sido entregados "+numSeries+" Series y "+numVG+" Videojuegos");
		maxVG(vgs);
		
		maxSerie(series);

	}

	private static void maxSerie(Serie[] series) {
		int aux1 = series[0].getnTemporadas(), aux2=0;
		int i = 0;
		
		while( i< series.length ) {
			if(aux1 < series[i].getnTemporadas()) {
				aux1 = series[i].getnTemporadas();
				aux2 = i;
			}
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "La serie con mas temporadas es :\n"
				+"Titulo: "+series[aux2].getTitulo()
				+"\nAutor: "+series[aux2].getAutor()
				+"\nGenero: "+series[aux2].getGenero()
				+"\nTemporadas: "+series[aux2].getnTemporadas());
		
	}

	private static void maxVG(Videojuego[] vgs) {
		int aux1 = vgs[0].getHorasEstimadas(), aux2=0;
		int i = 0;
		
		while( i< vgs.length ) {
			if(aux1 < vgs[i].getHorasEstimadas()) {
				aux1 = vgs[i].getHorasEstimadas();
				aux2 = i;
			}
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "El videojuego con mas horas es :\n"
				+"Titulo: "+vgs[aux2].getTitulo()
				+"\nCompañia: "+vgs[aux2].getCompañia()
				+"\nGenero: "+vgs[aux2].getGenero()
				+"\nHoras de juego: "+vgs[aux2].getHorasEstimadas());
		
		
	}

}

package EJ5;

import javax.swing.JOptionPane;

public class Aula_App {

	public static void main(String[] args) {
		
		Aula a1 = new Aula(20,"filosofia");
		
		if (a1.darClase()) {
			a1.sacarNotas();
		
		}else {
			JOptionPane.showMessageDialog(null, "No se ha podido dar clase");
		}

	}

}

package EJ1;



import javax.swing.JOptionPane;


/*
 * @author Toni Arjona
 * */
public class Electrodomestico_App {
	// creo las variable fuera del main porque las voy a usar desde diferentes metodos
	private static int i = 1, numTV = 0, numLav = 0;
	private static double totalTV = 0, totalLav = 0, totalElec = 0;
	
	//MAIN
	public static void main(String[] args) {
	

		String val = JOptionPane.showInputDialog("Cuantos electrodomesticos: ");
		int limite = Integer.parseInt(val);

		while (i <= limite) {
			String op = JOptionPane.showInputDialog(
					"Producto " + i + ":" + "\n1.- Electrodomestico" + "\n2.- Lavadora" + "\n3.- Televisor");

			switch (op) {
			case "1":
				crearMaquina();
				break;
			case "2":
				crearLavadora();
				break;
			case "3":
				crearTV();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion erronea");
				break;
			}
		}

		precioFinal(limite);

	}
//Metodo que imprime el precio final
	private static void precioFinal( int limite) {
		
		JOptionPane.showMessageDialog(null, "El total es de "+(totalElec+totalTV+totalLav)+"€"
				+"\n Electrodomesticos ->"+(limite-(numTV+numLav))+""
						+ "-> "+totalElec
						+"\n Televisores -> "+numTV+" -> "+totalTV
						+"\n Lavadoras -> "+numLav+" -> "+totalLav);

	}
//Metodo para crear televisiones
	private static void crearTV() {

		Television tv = crearObjtTV();//llamo al metodo que me devuelve una Television
		if (tv != null) {
			totalTV += tv.getPrecioTotal();
			numTV ++;
			i++;
		} else {
			JOptionPane.showMessageDialog(null, "Error al guardar el televisor");
		}

	}
	
	private static Television crearObjtTV() {
		String precio = JOptionPane.showInputDialog("Precio: ");
		String peso = JOptionPane.showInputDialog("Peso(Kg) : ");
		String color = JOptionPane.showInputDialog("Color: ");
		String consumo = JOptionPane.showInputDialog("Consumo(A->F) : ");
		String resolucion = JOptionPane.showInputDialog("Resolucion: ");
		String tdt = JOptionPane.showInputDialog("TDT(S/N) : ");

		if (!precio.equals("") && !peso.equals("")) {
			Television tv = new Television(Integer.parseInt(precio), Integer.parseInt(peso));
			return tv;
		} else if (!precio.equals("") && !peso.equals("") && !color.equals("") && !consumo.equals("")
				&& !resolucion.equals("") && !tdt.equals("")) {
			boolean aux = false;
			if (tdt.equals("S")) {
				aux = true;
				;
			}

			Television tv = new Television(Integer.parseInt(precio), Integer.parseInt(peso), color, consumo.charAt(0),
					Integer.parseInt(resolucion), aux);
			return tv;
		} else if (precio.equals("") && peso.equals("") && color.equals("") && consumo.equals("")
				&& resolucion.equals("") && tdt.equals("")) {
			Television tv = new Television();
			return tv;
		} else {
			return null;
		}

	}
	
	private static void crearLavadora() {
		Lavadora lavadora = crearObjtLavadora();
		if (lavadora != null) {
			totalLav += lavadora.getPrecioTotal();
			numLav++;
			i++;
		} else {
			JOptionPane.showMessageDialog(null, "Error al guardar la lavadora");
		}

	}
	
	private static Lavadora crearObjtLavadora() {
		String precio = JOptionPane.showInputDialog("Precio: ");
		String peso = JOptionPane.showInputDialog("Peso(Kg) : ");
		String color = JOptionPane.showInputDialog("Color: ");
		String consumo = JOptionPane.showInputDialog("Consumo(A->F) : ");
		String carga = JOptionPane.showInputDialog("Carga(Kg) : ");

		if (!precio.equals("") && !peso.equals("")) {

			Lavadora lavadora = new Lavadora(Integer.parseInt(precio), Integer.parseInt(peso));
			return lavadora;

		} else if (!precio.equals("") && !peso.equals("") && !color.equals("") && !consumo.equals("")
				&& !carga.equals("")) {

			Lavadora lavadora = new Lavadora(Integer.parseInt(precio), Integer.parseInt(peso), color, consumo.charAt(0),
					Integer.parseInt(carga));
			return lavadora;

		} else if (precio.equals("") && peso.equals("") && color.equals("") && consumo.equals("") && carga.equals("")) {
			Lavadora lavadora = new Lavadora();
			return lavadora;
		} else {
			return null;
		}
	}
	
	private static void crearMaquina() {
		Maquina maq = crearObjtMaquina();
		if (maq != null) {
			totalElec += maq.getPrecioTotal();
			i++;
		} else {
			JOptionPane.showMessageDialog(null, "Error al guardar el electrodomestico");
		}
	}

	private static Maquina crearObjtMaquina() {
		String precio = JOptionPane.showInputDialog("Precio: ");
		String peso = JOptionPane.showInputDialog("Peso(Kg) : ");
		String color = JOptionPane.showInputDialog("Color: ");
		String consumo = JOptionPane.showInputDialog("Consumo(A->F) : ");

		if (!precio.equals("") && !peso.equals("")) {

			Maquina maq = new Maquina(Integer.parseInt(precio), Integer.parseInt(peso));
			return maq;

		} else if (!precio.equals("") && !peso.equals("") && !color.equals("") && !consumo.equals("")) {

			Maquina maq = new Maquina(Integer.parseInt(precio), Integer.parseInt(peso), color, consumo.charAt(0));
			return maq;

		} else if (precio.equals("") && peso.equals("") && color.equals("") && consumo.equals("")) {
			Maquina maq = new Maquina();
			return maq;
		} else {
			return null;
		}
	}

	

	

}

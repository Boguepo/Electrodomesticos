package punto1;

import javax.swing.JOptionPane;

public class ElectrodomesticosAPP {

	public static void main(String[] args) {
		/*Ahora crea una clase ejecutable que realice lo siguiente:
			-Crea un array de Electrodomesticos de 10 posiciones.
			-Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
			-Ahora, recorre este array y ejecuta el método precioFinal().
			-Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y la suma de los
			Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.

			Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una
			lavadora de 200 y una televisión de 500, el resultado final sera de 1000
			(300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
		*/
		
		Electrodomestico electrodomestico[]=new Electrodomestico[2];
		
		
		//Ciclo para crear el array con objetos
		for(int i=0;i<electrodomestico.length;i++) {
			int indicador=Integer.parseInt(JOptionPane.showInputDialog("Indique que electrodomestico desea ingresar:\n 1-Electrodomestico\n 2-Lavadora\n 3-Televisión"));
			String precioB_txt=JOptionPane.showInputDialog("Ingrese el precio base:");
			String color_txt=JOptionPane.showInputDialog("Digite un color:");
			String consumoE_txt=JOptionPane.showInputDialog("Ingrese tipo de consumo energetico:");
			String peso_txt=JOptionPane.showInputDialog("Ingrese el peso:");
			
				if(indicador==1) {
					electrodomestico[i]=crearElectrodomestico(precioB_txt,color_txt,consumoE_txt,peso_txt);
				}else if(indicador==2) {
					String carga_txt=JOptionPane.showInputDialog("Ingrese la carga de la lavadora:");
					
					electrodomestico[i]=crearLavadora(precioB_txt,color_txt,consumoE_txt,peso_txt,carga_txt);
				}else if(indicador==3) {
					String pulgadas_txt=JOptionPane.showInputDialog("Ingrese la resolución (pulgadas):");
					String sintonizador_txt=JOptionPane.showInputDialog("TDT (SI/NO):");
					electrodomestico[i]=crearTelevision(precioB_txt,color_txt,consumoE_txt,peso_txt,pulgadas_txt,sintonizador_txt);
				}else {
					JOptionPane.showMessageDialog(null, "La opción ingresada no es correcta");
				}
		}
		
		mostrarArray(electrodomestico);
	}
	
	
	
	public static void mostrarArray(Electrodomestico e[]) {
		Electrodomestico electrodomestico=new Electrodomestico();
		Lavadora lavadora=new Lavadora();
		Television television=new Television();
		
		double sumaPrecio_Lavadora=0;
		double sumaPrecio_Elec=0;
		double sumaPrecio_Tele=0;
		
		for(int j=0;j<e.length;j++) {
			if(e[j] instanceof Electrodomestico) {
				sumaPrecio_Elec+=electrodomestico.precioFinal();
			}
			
			if(e[j] instanceof Television) {
				sumaPrecio_Lavadora+=lavadora.precioFinal();
			}
			
			if(e[j] instanceof Lavadora) {
				sumaPrecio_Tele+=television.precioFinal();
			}
		}
		
		JOptionPane.showMessageDialog(null, "El precio de los electrodomesticos es: "+sumaPrecio_Elec
				+"\nPrecio de las lavadoras: "+sumaPrecio_Lavadora
				+"\nPrecio de los Televisores: "+sumaPrecio_Tele);
		
	}

	
	public static Electrodomestico crearElectrodomestico(String precioB_txt,String color_txt,String consumoE_txt,String peso_txt) {
		
		Electrodomestico electrodomestico=new Electrodomestico();
		double precioBase;
		char consumoE;
		double peso;
		
		if(!precioB_txt.equals("") && !color_txt.equals("") && !consumoE_txt.equals("") && !peso_txt.equals("")){
			precioBase=Double.parseDouble(precioB_txt);
			consumoE=consumoE_txt.charAt(0);
			peso=Double.parseDouble(peso_txt);
			
			electrodomestico=new Electrodomestico(precioBase,color_txt,consumoE,peso); 
			
		}else if(!precioB_txt.equals("") && !peso_txt.contains("")) {
			 precioBase=Double.parseDouble(precioB_txt);
			 peso=Double.parseDouble(peso_txt);
			
			electrodomestico=new Electrodomestico(precioBase,peso);
		}else {
		
			electrodomestico=new Electrodomestico();
		}
		
		return electrodomestico;
		
		
	}
	
	public static Lavadora crearLavadora(String precioB_txt,String color_txt,String consumoE_txt,String peso_txt,String carga_txt) {
		Lavadora lavadora=new Lavadora();
		
		double precioBase;
		char consumoE;
		double peso;
		double carga;
		
		if(!precioB_txt.equals("") && !color_txt.equals("") && !consumoE_txt.equals("") && !peso_txt.equals("") && !carga_txt.equals("")){
			precioBase=Double.parseDouble(precioB_txt);
			consumoE=consumoE_txt.charAt(0);
			peso=Double.parseDouble(peso_txt);
			carga=Double.parseDouble(carga_txt);
			
			lavadora =new Lavadora(precioBase,color_txt,consumoE,peso,carga); 
			
		}else if(!precioB_txt.equals("") && !peso_txt.contains("")) {
			precioBase=Double.parseDouble(precioB_txt);
			peso=Double.parseDouble(peso_txt);
			
			lavadora=new Lavadora(precioBase,peso);
		}else {
		
			lavadora=new Lavadora();
		}
		
		return lavadora;
	}
	
	public static Television crearTelevision(String precioB_txt,String color_txt,String consumoE_txt,String peso_txt,String pulgadas_txt,String sintonizador_txt) {
		
		Television television;
		double precioBase;
		char consumoE;
		double peso;
		int pulgadas;
		boolean sintonizador=false;
		
		//Comprobar si el televisor lleva sintonizador
		
		
		
		if(!precioB_txt.equals("") && !color_txt.equals("") && !consumoE_txt.equals("") && !peso_txt.equals("") && !pulgadas_txt.equals("") && !sintonizador_txt.equals("")){
			precioBase=Double.parseDouble(precioB_txt);
			consumoE=consumoE_txt.charAt(0);
			peso=Double.parseDouble(peso_txt);
			pulgadas=Integer.parseInt(pulgadas_txt);
			
			if(sintonizador_txt.equals("SI".toLowerCase())) {
				sintonizador=true;
			}else {
				sintonizador=false;
			}
			
			television =new Television(precioBase,color_txt,consumoE,peso,pulgadas,sintonizador); 
			
		}else if(!precioB_txt.equals("") && !peso_txt.contains("")) {
			precioBase=Double.parseDouble(precioB_txt);
			peso=Double.parseDouble(peso_txt);
			
			television=new Television(precioBase,peso);
		}else {
		
			television=new Television();
		}
		
		return television;
	}

}

package punto1;

public class Electrodomestico {
	/*1. Crearemos una supeclase llamada Electrodomestico con las siguientes características:
		• Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar.
		• Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
		• Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
		
		Los constructores que se implementaran serán
		- Un constructor por defecto.
		- Un constructor con el precio y peso. El resto por defecto.
		- Un constructor con todos los atributos.
	*/
	//CONSTANTES
	protected final double PRECIOBASE_CONST=100;
	protected final String COLOR_CONST="blanco";
	protected final char CONSUMO_CONST='F';
	protected final double PESO_CONST=5;
	
	//ATRIBUTOS
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//CONSTRUCTORES
	public Electrodomestico() {
	this.precioBase=PRECIOBASE_CONST;
	this.color=COLOR_CONST;
	this.consumoEnergetico=CONSUMO_CONST;
	this.peso=PESO_CONST;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		this.color=COLOR_CONST;
		this.consumoEnergetico=CONSUMO_CONST;
	}
	
	
	public Electrodomestico(double precioBase,String color,char consumoEnergetico,double peso) {
		this.precioBase=precioBase;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.peso=peso;
	}

	
	//MÉTODOS GET Y SET
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//MÉTODO PARA COMBROBAR QUE LA LETRA SE ENCUENTRA ENTRE LAS OPCIONES
	private void comprobarConsumoEnergetico(char letra) {
		char[] letraConsumo= {'A','B','C','D','E','F'};
		
		for(int i=0;i<letraConsumo.length;i++) {
			if(letraConsumo[i]==letra){
				this.consumoEnergetico=letra;
			}else {
				this.consumoEnergetico=CONSUMO_CONST;
			}
		}
		
	}
	
	//MÉTODO PARA COMPROBAR EL COLOR
	private void comprobarColor(String color) {
		String[] colores={"blanco", "negro", "rojo", "azul","gris"};
		
		for(int i=0;i<colores.length;i++) {
			if(colores[i].equals(color.toLowerCase())){
				this.color=color;
			}else {
				this.color=COLOR_CONST;
			}
		}
		
	}
	
	
	//Según el consumo energético, aumentara su precio, y según su tamaño, también. 
	public  double precioFinal() {
		double precioFinal=0;
		
		switch(this.consumoEnergetico) {
		case'A':
			precioFinal=this.precioBase+100;
			break;
		case'B':
			precioFinal=this.precioBase+80;
			break;
		case'C':
			precioFinal=this.precioBase+60;
			break;
		case'D':
			precioFinal=this.precioBase+50;
			break;
		case'E':
			precioFinal=this.precioBase+30;
			break;
		case'F':
			precioFinal=this.precioBase+10;
			break;
		default:
			
		}
		
		if(this.peso>0 && this.peso<=19) {
			precioFinal=precioFinal+10;
		}else if(this.peso>=20 && this.peso<=49) {
			precioFinal=precioFinal+50;
		}else if(this.peso>=50 && this.peso<=79) {
			precioFinal=precioFinal+80;
		}else if(this.peso>=80) {
			precioFinal=precioFinal+100;
		}
		
		return precioFinal;
		
		
	}
	
	
	
	
	
}

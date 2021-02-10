package EJ1;

public class Lavadora extends Maquina{
	//CONSTANTES
	private final int CARGA_DEF = 5;
	//ATRIBUTOS
	private int carga;
	
	//Constructor por defecto
	public Lavadora() {
		super();//llamada al constructor de la clase padre
		this.carga = CARGA_DEF;
	}
	
	//Constructor sobrecargado, le pasamos el precio y el peso
	public Lavadora(int precio,  int peso) {
		super(precio,peso);//llamada al constructo sobrecargado con el peso y el precio de la clase padre
		this.carga = CARGA_DEF;
	}
	//constructor sobrecargado le pasamos todos los atributos
	public Lavadora(int precio, int peso, String color, char consumo, int carga) {
		super(precio,peso,color,consumo);//llamada al constructor sobrecargado con todos los atributos de la clase padre
		this.carga = carga;
		precioFinal(this.carga);//vuelvo a calcular el precio total 
	}
	//Metodo sobrecargado que actualiza el precio final si cuample la consicion
	private void precioFinal(int carga) {
		super.precioFinal();
		if(carga >= 30) {
			this.precioTotal += 50;
		}
	}
	
	
	//GET && SET
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
}

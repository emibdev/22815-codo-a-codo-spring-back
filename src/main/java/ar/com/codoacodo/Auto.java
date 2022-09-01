package ar.com.codoacodo;

//los nombres de las clases la primer letra es en mayuscula
public class Auto {
	
	/*
	 atributos
	*/
	
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	//todas las clases tienen un constructor por defecto
	//constructor por defecto/explicito
	Auto() {
		//aca va el codigo cuando nace el auto
		encendido = false;
	}
	
	//metodos
	void encender() {
		encendido = true;
	}
	
	void apagar() {
		
	}
	
	void acelerar() {
		
	}
	
	void frenar() {
		
	}
	
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);
		
	}

}

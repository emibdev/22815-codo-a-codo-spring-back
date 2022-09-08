package ar.com.codoacodo;

//los nombres de las clases la primer letra es en mayuscula
public class Auto {
	
	/*
	 atributos
	*/
	
	boolean encendido;
	float velocidadActual;
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	
	//todas las clases tienen un constructor por defecto
	//constructor por defecto/explicito
	Auto() {
		//aca va el codigo cuando nace el auto
		this.encendido = false;
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	Auto(final float velocidadMaxima) {
		//this // F6
		this.velocidadActual = 0; // F6
		this.velocidadMaxima = velocidadMaxima;
	}// F6
	
	//metodos
	void encender() {
		if(!encendido) {
			System.out.println("se ha encendido");
			encendido = true;			
		} else {
			System.out.println("ya esta encendido");
		}
	}
	
	void apagar() {
		if(this.encendido) {
			System.out.println("apagando");
			this.encendido = false;
			
			//extra!!
			this.detener();
		} else {
			System.out.println("ya esta apagado");
		} 	
	}
	
	void acelerar() {
		if(this.encendido) {
			
			if(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			} else {
				System.out.println("se quema el auto");
			}
			
		} else {
			System.out.println("debe encender el auto");
		}	
	}
	
	void quintaAFondo() {
		if(this.encendido) {
			while(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}
			System.out.println("se quema el auto");
		} else {
			System.out.println("debe encender el auto");
		}	
	}
	
	void frenar() {
//		if(this.encendido) {
			if(this.velocidadActual > 0) {
				System.out.println("frenando");
				this.velocidadActual--;
			} else {
				System.out.println("llegaste a 0");
			}
//		} else {
//			System.out.println("auto apagado");
//		}	
	}
	
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);	
	}

	public void detener() {
		while(velocidadActual > 0) {
			this.frenar();			
		}	
	}

	
}

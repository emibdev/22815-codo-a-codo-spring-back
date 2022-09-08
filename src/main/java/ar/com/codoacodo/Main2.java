package ar.com.codoacodo;

public class Main2 {

	public static void main(String[] args) {
		
		Auto miPrimerAuto = new Auto(5);
	
		miPrimerAuto.encender();
		
		miPrimerAuto.quintaAFondo();
		
		System.out.println("ahora frenando");
		
		//miPrimerAuto.detener();
		
		miPrimerAuto.apagar();
		
		System.out.println("fin");
		
	}
}
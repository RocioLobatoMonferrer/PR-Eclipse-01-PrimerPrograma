package tema2_eclipse;

public class HelloEclipse {
	public void firstprogramme() {
		
		// Este programa imprime mensajes en consola
		
		System.out.println("¡Mi primer programa!");
		System.out.println("Reglas básicas de Java");
		System.out.println("1) Distingue MAYÚSCULAS y minúsculas");
		System.out.println("2) Cada instrucción termina con ;");
		
		/* 
		   Autor: (Rocío Lobato Monferrer)
		   Fecha: (03/10/2025)
		*/
		
		int contandorMensajes = 0;
		contandorMensajes++;
		System.out.println("Mensajes impresos: " + contandorMensajes);
		
		int x = 3;
		System.out.print("Este código no está");
		System.out.print(" muy bien ");
		System.out.print("tabulado");
		x = 7;
		System.out.println();
		
	}
	public static void main(String[] args) {
		new HelloEclipse().firstprogramme();
	}

}

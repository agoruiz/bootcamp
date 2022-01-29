package principal;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero1to10 {
	static int numusuario;
	static int numrandom;
	static int intentos = 0;

	public void inicializa() {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		numusuario = sc.nextInt();

		System.out.println("El numero es: "+numrandom);
		System.out.println("El numero de intentos es: " + this.jugada());

		for(int i=0; i<10; i++)	{	
			
			if (numusuario==numrandom) {
				System.out.println("Has acertado el numero " + this.jugada() );				
				break;				
			}
			if (numusuario>numrandom) {
				
				System.out.println("El numero es menor, intentalo de nuevo" + this.jugada());
				numusuario = sc.nextInt();
				
			}
			if (numusuario<numrandom) {
				System.out.println("El numero es mayor, intentalo de nuevo"+ this.jugada());
				numusuario = sc.nextInt();
			}	
			
		}
		if (intentos==10)
			System.out.println("No has conseguido hacer los 10 intentos"+ this.jugada());				
		sc.close();
	}
	
	public String jugada() {
		return "El numero de intentos son "+ ++intentos;
	}

	
	public static void main(String[] args) {
		System.out.println("Bienvenido al juego de advinar numeros pon un numero del 1 al 100");
		Random rd = new Random();
		numrandom = rd.nextInt(100);	
		AdivinaNumero1to10 ad = new AdivinaNumero1to10(); 
		ad.inicializa();
		
	}
	
		}



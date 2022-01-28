package principal;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero1to10 {
	static int numusuario;
	static int numrandom;
	
	public static void adivinaelnumero() {
		int intentos = 0;
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("El numero es: "+numrandom);
		for(int i=0; i<10; i++)	{	
			intentos = i;
			if (numusuario==numrandom) {
				System.out.println("Has acertado el numero " + intentos );				
				break;				
			}
			if (numusuario>numrandom) {
				
				System.out.println("El numero es menor, intentalo de nuevo" + intentos);
				numusuario = sc.nextInt();
				
			}
			if (numusuario<numrandom) {
				System.out.println("El numero es mayor, intentalo de nuevo"+ intentos);
				numusuario = sc.nextInt();
			}	
			
		}
		System.out.println("No has conseguido hacer los 10 intentos"+ intentos);				
		sc.close();
	}

	
	public static void main(String[] args) {
		System.out.println("Bienvenido al juego de advinar numeros pon un numero del 1 al 100");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String cadena = sc.nextLine();
		numusuario = Integer.parseInt(cadena);
		numrandom = rd.nextInt(100);	
		adivinaelnumero();
		sc.close();
		
	}
	
		}



package ejercicios2;


public class calculadora {
	/*  3+4+3,4-7*1= decodificar cadena
	 * 
*/
public static void main(String args[]) {
	String cadena = "3+4+3,4-7*1";
	String punto = cadena.replace(",", ".");
	String separados[] =punto.split("(?<=[-+*=])");
	
	int numero1;
	int numero2;
	int operador;
	
	char caracter;
	
for (int i=0; i<separados.length; i++) {
 	System.out.println("El caracter es "+ separados[i]);
		caracter = separados[i].charAt(i);
	    numero1 = separados[i].charAt(i);
	    System.out.println("el numero es numero1 "+ numero1);
		 if(String.valueOf(caracter)=="+" || String.valueOf(caracter)=="-" || String.valueOf(caracter)=="*" || String.valueOf(caracter)=="*") {
			operador = caracter;
			numero2 = separados[i].charAt(i+1);
		    System.out.println("el numero es numero2 "+ numero2);

		}
		
 	
 	
// 	for (int j=0; j<separados[i].length(); j++) {
// 		
// 		caracter = separados[i].charAt(j);
// 		//System.out.println("El caracter separado es "+ caracter);
// 		if(String.valueOf(caracter)=="+" || String.valueOf(caracter)=="-" || String.valueOf(caracter)=="*" || String.valueOf(caracter)=="*") {
// 			operador = caracter;
// 		}
// 		else {
// 			
// 		}
 	}

		
	}
}
	
	
	




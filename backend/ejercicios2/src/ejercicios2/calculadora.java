package ejercicios2;

import java.nio.charset.Charset;

public class calculadora {
	/*  3+4+3,4-7*1= decodificar cadena
	 * 
*/
public static void main(String args[]) {
	String cadena = "3+4+3,4-7*1";
	char caracter;
	int posicion=0;
	for (int i=0; i<cadena.length(); i++) 
	{ 
		 caracter = cadena.charAt(posicion);
		 if (caracter == '+'  || caracter == '-' || caracter =='*' ) { 
			 cadena.lines();
		 }
		 if(caracter ==',') {
			 posicion++;
		 }
	}
	
}

}

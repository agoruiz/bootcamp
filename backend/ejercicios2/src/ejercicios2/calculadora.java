package ejercicios2;


public class calculadora {
	/*  3+4+3,4-7*1= decodificar cadena
	 * 
*/
public static void main(String args[]) {
	String cadena = "3+4+3,4-7*1";
	String separados[] =cadena.split("(?<=[-+*=])");
	int numero1;
	int numero2;
	int operador;
	char caracter;
	
for (int i=0; i<separados.length; i++) {
	for (int j=0; j<separados[i].length(); j++) {
	 	caracter = separados[j].charAt(j);
	 	System.out.println("El caracter es "+ caracter);
		
	}
}
	
	
	
}

}

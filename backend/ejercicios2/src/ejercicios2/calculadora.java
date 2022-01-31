package ejercicios2;


public class calculadora {
	/*  3+4+3,4-7*1= decodificar cadena
	 * 
*/
public static void main(String args[]) {
	String cadena = "3+4+3,4-7*1";
	String separados[] =cadena.split("(?<=[-+*=])");
	
for (int i=0; i<separados.length; i++) {
	System.out.println("La cadena es: " + separados[i]);
}
	
	
	
}

}

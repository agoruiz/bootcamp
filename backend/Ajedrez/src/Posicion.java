
public class Posicion {
	
private int laFila;
private int laColumna;

Posicion(int fila, int columna){
	this.laFila = fila;
	this.laColumna = columna;
	
}
//Pasar caracteres de notacion Internacion a matriz de numero de 8x8 para que sean numero en vez de
//de caracteres, se utiliza el rango de 0-7 por matriz y evitar su confusión
Posicion(char letra, char numero){
	if(letra=='A'|| letra=='B' || letra=='C'|| letra=='D'|| letra=='E' || letra=='F' || letra=='G'|| letra=='H') {
		if(letra=='A')
			laFila = 0;
		if(letra=='B')
			laFila = 1;
		if(letra=='C')
			laFila = 2;
		if(letra=='D')
			laFila = 3;
		if(letra=='E')
			laFila = 4;
		if(letra=='F')
			laFila = 5;
		if(letra=='G')
			laFila = 6;
		if(letra=='H')
			laFila = 7;
	}
	if(numero=='0'|| numero=='1' || numero=='2'|| numero=='D'|| numero=='E' || numero=='F' || letra=='G' || letra=='H') {
		if(letra=='0')
			laColumna = 0;
		if(letra=='1')
			laColumna = 1;
		if(letra=='2')
			laColumna = 2;
		if(letra=='3')
			laColumna = 3;
		if(letra=='4')
			laColumna = 4;
		if(letra=='5')
			laColumna = 5;
		if(letra=='6')
			laColumna = 6;
		if(letra=='7')
			laColumna = 7;
	}
	}

public int getLaFila() {
	return laFila;
}

public int getLaColumna() {
	return laColumna;
}

public Boolean Equals() {
	return false;
}



}

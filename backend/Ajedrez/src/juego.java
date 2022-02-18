
public class juego{
Tablero tablero; 
Color turno;
public void Inicializar(){
    String tabla[][];
	tabla = new String[8][8];
	//PiezaBlancas
	tabla[0][0]="TorreB";
	tabla[0][1]="AlfilB";
	tabla[0][2]="CaballoB";
	tabla[0][3]="ReinaB";
	tabla[0][4]="ReyB";
	tabla[0][5]="AlfilB";
	tabla[0][6]="CaballoB";
	tabla[0][6]="TorreB";
	
	tabla[1][0]="PeonB";
	tabla[1][1]="PeonB";
	tabla[1][2]="PeonB";
	tabla[1][3]="PeonB";
	tabla[1][4]="PeonB";
	tabla[1][5]="PeonB";
	tabla[1][6]="PeonB";
	tabla[1][7]="PeonB";
	
	//Piezas Negras
	tabla[8][0]="TorreB";
	tabla[8][1]="AlfilB";
	tabla[8][2]="CaballoB";
	tabla[8][3]="ReinaB";
	tabla[8][4]="ReyB";
	tabla[8][5]="AlfilB";
	tabla[8][6]="CaballoB";
	tabla[8][7]="TorreB";
	
	tabla[7][0]="PeonN";
	tabla[7][1]="PeonN";
	tabla[7][2]="PeonN";
	tabla[7][3]="PeonN";
	tabla[7][4]="PeonN";
	tabla[7][5]="PeonN";
	tabla[7][6]="PeonN";
	tabla[7][7]="PeonN";

}
public String Jugada(String jugada){
if(jugada==null || jugada.isEmpty()) {
	return null;
}
if(jugada.charAt(0)=='A'|| jugada.charAt(0)=='B'|| jugada.charAt(0)=='C'|| jugada.charAt(0)=='D'|| jugada.charAt(0)=='E'|| jugada.charAt(0)=='F') {
	if(jugada.charAt(1)=='1'|| jugada.charAt(1)=='2'|| jugada.charAt(1)=='3' || jugada.charAt(1)=='4'|| jugada.charAt(1)=='5'|| jugada.charAt(1)=='6'|| jugada.charAt(1)=='7'|| jugada.charAt(1)=='8' ) {
		if(jugada.charAt(2)=='A'|| jugada.charAt(2)=='B'|| jugada.charAt(2)=='C'|| jugada.charAt(2)=='D'|| jugada.charAt(2)=='E'|| jugada.charAt(2)=='F') {
			if(jugada.charAt(3)=='1'|| jugada.charAt(3)=='2'|| jugada.charAt(3)=='3' || jugada.charAt(3)=='4'|| jugada.charAt(3)=='5'|| jugada.charAt(3)=='6'|| jugada.charAt(3)=='7'|| jugada.charAt(3)=='8' ) {
			}
		}
			}
	}
return "Formato no valido";
}
}



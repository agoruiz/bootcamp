
public class juego{
Tablero tablero; 
Color turno;
public void Inicializar(){
    String piezas[][];
	piezas = new String[8][8];
	String tabla[][] = new String[8][8];
	
	//PiezaBlancas
	piezas[0][0]="TorreB";
	piezas[0][1]="AlfilB";
	piezas[0][2]="CaballoB";
	piezas[0][3]="ReinaB";
	piezas[0][4]="ReyB";
	piezas[0][5]="AlfilB";
	piezas[0][6]="CaballoB";
	piezas[0][6]="TorreB";
	
	piezas[1][0]="PeonB";
	piezas[1][1]="PeonB";
	piezas[1][2]="PeonB";
	piezas[1][3]="PeonB";
	piezas[1][4]="PeonB";
	piezas[1][5]="PeonB";
	piezas[1][6]="PeonB";
	piezas[1][7]="PeonB";
	
	//Piezas Negras
	piezas[8][0]="TorreB";
	piezas[8][1]="AlfilB";
	piezas[8][2]="CaballoB";
	piezas[8][3]="ReinaB";
	piezas[8][4]="ReyB";
	piezas[8][5]="AlfilB";
	piezas[8][6]="CaballoB";
	piezas[8][7]="TorreB";
	
	piezas[7][0]="PeonN";
	piezas[7][1]="PeonN";
	piezas[7][2]="PeonN";
	piezas[7][3]="PeonN";
	piezas[7][4]="PeonN";
	piezas[7][5]="PeonN";
	piezas[7][6]="PeonN";
	piezas[7][7]="PeonN";

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
Movimiento m = new Movimiento(jugada);
this.tablero.Mover(m);
return jugada;
}
}




public class juego{
Tablero tablero; 
Color turno;
public void Inicializar(){
		
	
     Pieza piezasTablero [] = new Pieza[16];
	 Tablero tabla[][] = new Tablero[8][8];
	
	//PiezaBlancas
	piezasTablero[0]=new Torre(Color.Blanco);
	piezasTablero[1]=new Caballo(Color.Blanco);
	piezasTablero[2]=new Alfil(Color.Blanco);
	piezasTablero[3]=new Reina(Color.Blanco);
	piezasTablero[4]=new Rey(Color.Blanco);
	piezasTablero[5]=new Alfil(Color.Blanco);
	piezasTablero[6]=new Caballo(Color.Blanco);
	piezasTablero[7]= new Torre(Color.Blanco);
	
	piezasTablero[8]=new Torre(Color.Negro);
	piezasTablero[9]=new Caballo(Color.Negro);
	piezasTablero[10]=new Alfil(Color.Negro);
	piezasTablero[11]=new Reina(Color.Negro);
	piezasTablero[12]=new Rey(Color.Negro);
	piezasTablero[13]=new Alfil(Color.Negro);
	piezasTablero[14]=new Caballo(Color.Negro);
	piezasTablero[15]= new Torre(Color.Negro);
	
	tabla[0][0] = piezasTablero[0];
	tabla[0][1] = piezasTablero[1];
	tabla[0][2] = piezasTablero[2];
	tabla[0][3] = piezasTablero[3];
	tabla[0][4] = piezasTablero[4];
	tabla[0][5] = piezasTablero[5];
	tabla[0][6] = piezasTablero[6];
	tabla[0][7] = piezasTablero[7];
	
	tabla[1][0] = piezasTablero[8];
	tabla[1][1] = piezasTablero[9];
	tabla[1][2] = piezasTablero[10];
	tabla[1][3] = piezasTablero[11];
	tabla[1][4] = piezasTablero[12];
	tabla[1][5] = piezasTablero[13];
	tabla[1][6] = piezasTablero[14];
	tabla[1][7] = piezasTablero[15];
	
	
}
public String Jugada(String jugada){
if(jugada==null || jugada.isEmpty()) {
	return null;
}
if(jugada.charAt(0)=='A'|| jugada.charAt(0)=='B'|| jugada.charAt(0)=='C'|| jugada.charAt(0)=='D'|| jugada.charAt(0)=='E'|| jugada.charAt(0)=='F'|| jugada.charAt(0)=='G'|| jugada.charAt(0)=='H') {
	if(jugada.charAt(1)=='1'|| jugada.charAt(1)=='2'|| jugada.charAt(1)=='3' || jugada.charAt(1)=='4'|| jugada.charAt(1)=='5'|| jugada.charAt(1)=='6'|| jugada.charAt(1)=='7'|| jugada.charAt(1)=='8' ) {
		if(jugada.charAt(2)=='A'|| jugada.charAt(2)=='B'|| jugada.charAt(2)=='C'|| jugada.charAt(2)=='D'|| jugada.charAt(2)=='E'|| jugada.charAt(2)=='F' || jugada.charAt(2)=='G'|| jugada.charAt(2)=='H') {
			if(jugada.charAt(3)=='1'|| jugada.charAt(3)=='2'|| jugada.charAt(3)=='3' || jugada.charAt(3)=='4'|| jugada.charAt(3)=='5'|| jugada.charAt(3)=='6'|| jugada.charAt(3)=='7'|| jugada.charAt(3)=='8' ) {
			 new Movimiento(jugada);
			}
		}
	}
}
Movimiento m = new Movimiento(jugada);
this.tablero.Mover(m);
return jugada;
}
}



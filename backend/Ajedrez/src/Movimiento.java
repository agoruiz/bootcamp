
public class Movimiento {
	private Posicion PosicionInicial;
	private Posicion PosicionFinal;
	
	/*Consigue la posicion inicial*/
	public Posicion getPosicionInicial() {
		return PosicionInicial;
	}
	/*Modifica la posicion final*/
	public void setPosicionInicial(Posicion posicionInicial) {
		PosicionInicial = posicionInicial;
	}
	/*Consigue la posicion inicial*/
	public Posicion getPosicionFinal() {
		return PosicionFinal;
	}
	

	class prueba{
	
	}
	/*Modifica la posicion final*/
	public void setPosicionFinal(Posicion posicionFinal) {
		PosicionFinal = posicionFinal;
	}
	
	/*Notacion Internacional Fila A-F columna 1-8*/
	Movimiento (String jugada) {
		if(jugada == null || jugada.isEmpty()|| jugada.length()!=4) {
			new Exception("Movimiento no valido");
		}
		//Revisar con expresion regular en la siguiente revision del método
		if(jugada.charAt(0)=='A'|| jugada.charAt(0)=='B'|| jugada.charAt(0)=='C'|| jugada.charAt(0)=='D'|| jugada.charAt(0)=='E'|| jugada.charAt(0)=='F' || jugada.charAt(0)=='G' || jugada.charAt(0)=='H') {
			if(jugada.charAt(1)=='1'|| jugada.charAt(1)=='2'|| jugada.charAt(1)=='3' || jugada.charAt(1)=='4'|| jugada.charAt(1)=='5'|| jugada.charAt(1)=='6'|| jugada.charAt(1)=='7'|| jugada.charAt(1)=='8' ) {
				if(jugada.charAt(2)=='A'|| jugada.charAt(2)=='B'|| jugada.charAt(2)=='C'|| jugada.charAt(2)=='D'|| jugada.charAt(2)=='E'|| jugada.charAt(2)=='F' || jugada.charAt(0)=='G' || jugada.charAt(0)=='H') {
					if(jugada.charAt(3)=='1'|| jugada.charAt(3)=='2'|| jugada.charAt(3)=='3' || jugada.charAt(3)=='4'|| jugada.charAt(3)=='5'|| jugada.charAt(3)=='6'|| jugada.charAt(3)=='7'|| jugada.charAt(3)=='8' ) {								
						this.PosicionInicial = new Posicion(jugada.charAt(0),jugada.charAt(1));
						this.PosicionFinal = new Posicion(jugada.charAt(2),jugada.charAt(3));		
					}
				}
			}
		}
		
	}
	//Posicion i, Posicion p.
	/*Devuelve true si el movimiento es vertical en caso contrario false*/	
	Boolean EsVertical(Posicion i, Posicion f) {
		return false;
	}
	/*Devuelve true si el movimiento es horizontal en caso contrario false*/	
	Boolean EsHorizonal() {return false;}
	/*Devuelve true si el movimiento es diagonal en caso contrario false*/	
	Boolean EsDiagonal() {return false;}
	//Devuelve Integer si el movimiento es salto vertical en caso contrario false	
	Integer SaltoVertical() {return -1;}
	//Devuelve Integer si el movimiento es horizontal en caso contrario false	
	Integer SaloHorizontal() {return -1;}
	//Devuelve Integer si el movimiento es DeltaFila en caso contrario false	
	Integer DeltaFila() {return -1;}
	//Devuelve Integer si el movimiento es delta Columna en caso contrario false	
	Integer DeltaColumna() {return -1;}
}

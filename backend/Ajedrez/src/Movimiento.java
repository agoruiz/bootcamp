
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
	Movimiento (String movimiento) {
		if(movimiento == null || movimiento.isEmpty()|| movimiento.length()!=4) {
			new Exception("Movimiento no valido");
		}
	}
	/*Devuelve true si el movimiento es vertical en caso contrario false*/	
	Boolean EsVertical() {return false;}
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


public class Tablero implements Cloneable{

	public Pieza Escaque;
	public Posicion Escaquepos;
	public Boolean esValido() {return false;}
	public Boolean hayPieza(Integer fila, Integer columna ) {return false;}
	public Boolean hayPieza(Posicion p) {return false;}
	public void quitaPieza(int fila, int columna) {}
	public void quitaPieza(Posicion p) {}
	public void Mover(Movimiento m) {}
	public void Clone() {}
	public Color ColorEscaque(int i1,int i2) {
		return Color.Negro;
	}
	public Boolean HayPiezasEntre(Movimiento m) {return false;}	
		
	}



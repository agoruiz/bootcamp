
public class Pieza extends Tablero {
	private Color color;
	
	Pieza(Color c){
		this.color = c;		
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
    boolean esValido(Movimiento m, Tablero t) {
	return false;	
	}
	
       void Mover(Movimiento m, Tablero t) {}	

}

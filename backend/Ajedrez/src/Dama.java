
public class Dama extends Pieza {
	private Color color;
	Dama(Color c){
		super(c);
		this.color = c;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	boolean esValido(Movimiento m,Tablero t) {
		return false;
	}

}


public class Torre extends Pieza {
	private Color color;
	Torre(Color c){
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

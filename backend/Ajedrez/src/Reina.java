
public class Reina extends Pieza{

private Color color;	
	
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
Reina(Color c){
	super(c);
}
boolean esValido(Movimiento m,Tablero t) {
	return false;
}

}


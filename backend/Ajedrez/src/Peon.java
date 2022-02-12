
public class Peon extends Pieza{
  //Hacer metodos delegates para Event Promocion
	private Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Peon(Color c) {
		super(c);
	}
	

}

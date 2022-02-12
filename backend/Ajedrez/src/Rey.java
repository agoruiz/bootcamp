
public class Rey extends Pieza {
	private Color color;
	Rey(Color c){
		super(c);
		this.color = c;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

}

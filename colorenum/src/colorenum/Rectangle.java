package colorenum;

public class Rectangle extends Shape{

	private int l;
	private int b;
	private Color c;
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	public int getL() {
		return l;
	}
	public int getB() {
		return b;
	}
	public Color getC() {
		return c;
	}
	public void setC(Color c) {
		this.c = c;
	}
	
	
}

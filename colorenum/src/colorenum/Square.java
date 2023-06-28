package colorenum;

public class Square extends Shape{

	
	private int s;
    private Color c;
    
	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}

	public Square(int s) {
		super();
		this.s = s;
	}

	public int getS() {
		return s;
	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		int area=s*s;
		System.out.print(area);
	}
	
}

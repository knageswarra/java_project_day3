package colorenum;

public class CalcTest {
	public static void main(String args[])
	{
		Color c1=Color.BLUE;
		Color c2=Color.YELLOW;
		Square s=new Square(5);
		s.setC(c2);
		Rectangle r=new Rectangle(6,4);
		r.setC(c1);
		System.out.println(s.getC().getColor());
		System.out.println(r.getC().getColor());
	}

}

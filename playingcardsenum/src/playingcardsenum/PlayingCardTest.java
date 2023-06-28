package playingcardsenum;

public class PlayingCardTest {
 
	public static void main(String args[])
	{
		Suit s=Suit.SUIT_DIAMONDS;
		PlayingCard x=new PlayingCard(s);
		System.out.println(x.getTsuit().getName());
		System.out.println(x.getTsuit().getRank());
	}
}

package playingcardsenum;

public enum Suit {
	
	SUIT_SPADES("Spades", 1),
	SUIT_HEARTS("Hearts", 2), 
	SUIT_CLUBS("Clubs", 3),
	SUIT_DIAMONDS("Diamond", 4);
	
	private String name;
	private int rank;
	private Suit(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public int getRank() {
		return rank;
	}
	
	
	

}

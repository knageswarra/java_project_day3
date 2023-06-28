package colorenum;

public enum Color {
	
		RED(" the color of the shape is red color"),
		BLUE("the color of the shape is blue color"),
		YELLOW("the color of shape is yellow color"),
		BROWN("the color of shape is brown color");
	
	private String color;

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	
}

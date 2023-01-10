package learn;

public interface Bag {
	public static String bagType() {
		return "travel bag";
	}
	public default String printColor() {
		return "red";
	}

}

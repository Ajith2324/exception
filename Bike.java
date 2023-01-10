package learn;

public interface Bike {
	public default void printBrand() {
		System.out.println("It is some bike manufacture");
	}

}

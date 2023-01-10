package learn;

public interface Calculator {
	public int math(int a,int b);
	public static void operation() {
		System.out.println("This files performs calculation");
	}
	public default void print() {
		System.out.println("add,subtract,multiply,divide");
	}

}

package learn;

public class Mobile implements Electronics {
	public void printBrand() {
		System.out.println("vivo");
	}
	public static void onOff(boolean isOn) {
		System.out.println("working");
	}
	public void printPrice() {
		System.out.println(100000);
	}

}

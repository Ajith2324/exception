package learn;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.printBrand();
		Electronics.onOff(false);
		m.onOff(false);
		m.printPrice();
	}

}

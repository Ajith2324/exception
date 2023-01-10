package learn;

public interface Electronics {
	public static void onOff(boolean isOn) {
		if(isOn==true) {
			System.out.println("is Working");
		}
		else {
			System.out.println("It is not working");
		}
	}

}

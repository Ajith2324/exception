package learn;

public class Methods {
	public int findMax(int [] a) {
		int max=a[0];
		for(Integer i:a) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	public static int findMin(int [] a) {
		int min=a[0];
		for(Integer c:a) {
			if(c<min) {
				min=c;
			}
		}
		return min;
	}

}

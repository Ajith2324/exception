package learn;

public class UseMaxMin {
	public static void main(String[] args) {
		Methods m=new Methods();
		MaxMin max=m::findMax;
		MaxMin min=Methods::findMin;
		int []nums= {10,50,-39,48,100};
		System.out.println(max.find(nums));
		System.out.println(min.find(nums));
	}

}

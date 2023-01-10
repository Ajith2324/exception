package learn;

public class TravelBag implements Bag {
	public String printColor() {
		return "blue";
	}
	public String waterProof(boolean isWaterProof) {
		if(isWaterProof==true) {
			return "The bag is Water proof";
		}else {
			return "The bag is not waterProof";
		}
			
		}
	}



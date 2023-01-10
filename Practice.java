package learn;

import java.util.Optional;

public class Practice {
	public static void main(String[] args) {
		String word=null;
		//System.out.println(word.toUpperCase());
		Optional<String>check=Optional.ofNullable(word);
//		if(check.isPresent()) {
//			System.out.println(word.toUpperCase());
//		}
//		else {
//			System.out.println("The string is null");
//		}
		System.out.println(check.orElse("The string is null"));
	}

}

package learn;

public class UseStringMethods {
	public static void main(String[] args) {
		StringMethods length=(b)->System.out.println(b.length());
		length.operate("ajith");
		StringMethods upper=(b)->System.out.println(b.toUpperCase());
		upper.operate("mani");
		StringMethods lower=(b)-> System.out.println(b.toLowerCase());
		lower.operate("KARTHIK");
	    StringMethods contains=(b)->{if(b.contains("a")||b.contains("e")||b.contains("i")||b.contains("o")||b.contains("u")) {
	    	System.out.println("vowels contains");
	    }
	    else {
	    	System.out.println("vowels not contains");
	    }};
	    contains.operate("vimal");
		
	}

}

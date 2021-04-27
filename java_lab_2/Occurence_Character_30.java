package lab.java.two.com;

public class Occurence_Character_30 {

	public static void main(String[] args)
	{
		long count = countMatches("javaguiaades", 'a');
        System.out.println("occurence of a  : " + count);
          
		
	}

	private static long countMatches(final String str, final char character) {
		return str.codePoints().filter(ch -> ch == character).count();
	}

}

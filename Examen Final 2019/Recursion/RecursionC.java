public class RecursionC {

	/**
	 * Exercise #1
	 * Returns the remainder obtained by dividing two integers
	 * by RECURSIVELY subtracting one integer from the other
	 *  
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static long mod(int dividend, int divisor) {
		if(dividend < divisor) return dividend;
		if(dividend == divisor) return 0; 
		if(divisor == 1) return dividend;
		
		return mod(dividend - divisor, divisor); 
	}

	/**
	 * Exercise #2
	 * Returns true if and only if a patterns (a String) appears inside a text at least n times
	 * 
	 * YOUR METHOD MUST BE RECURSIVE.  Non-recursive methods will receive zero credit.
	 * HINT: The startsWith method from the String class may come in handy
	 * 
	 * @param pattern
	 * @param text
	 * @param times
	 * @return
	 */
	public static boolean patternExists(String pattern, String text, int times) {
		// YOUR CODE HERE
		return false; // Dummy return
	}

	/**
	 * Exercise #3
	 * Returns a NEW String that capitalizes the nth occurrence of a given (from) 
	 * pattern in a given string (text).  Capitalizing means replacing any lowercase
	 * letters with their upper case counterparts.
	 * The method must return a new String even if the pattern does not appear in the text.
	 * 
	 * YOUR METHOD MUST BE RECURSIVE.  Non-recursive methods will receive zero credit.
	 * 
	 * HINT: The startsWith method from the String class may come in handy
	 * WARNING: YOU CANNOT USE THE replace nor replaceAll methods from the String class.
	 *
	 * @param from
	 * @param to
	 * @param text
	 * @param nth
	 * @return
	 */
	public static String replace(String from, String text, int nth) {
		// YOUR CODE HERE
		return ""; // Dummy return
	}
}
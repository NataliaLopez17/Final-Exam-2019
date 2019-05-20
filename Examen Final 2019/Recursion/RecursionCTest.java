import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RecursionCTest {
	
	String emptyString = "";
	String nullString = null;
	String welcome = "Welcome my friend! ";
	
	public static String countPatternC = "a:b:c";
	public static String countPatternInCapsC = "A:B:C";
	public static String existPatternC = "(<->)";
	
	String oneOccurrenceStart = countPatternC + welcome;
	String oneOccurrenceEnd = welcome+countPatternC;
	String oneOccurrenceMiddle = welcome+countPatternC+welcome;
	String twoOccurrences = countPatternC + 
			welcome + countPatternC;
	String fourOccurrences = countPatternC + 
			" " + countPatternC + 
			" " + countPatternC +
			" " + countPatternC;
	
	String oneOccurrenceStartP2 = existPatternC + welcome;
	String oneOccurrenceEndP2 = welcome+existPatternC;
	String oneOccurrenceMiddleP2 = welcome+existPatternC+welcome;
	String twoOccurrencesP2 = existPatternC + 
			welcome + existPatternC;
	String fourOccurrencesP2 = existPatternC + 
			" "	+ existPatternC + 
			" " + existPatternC + 
			" " + existPatternC;
	
	public static String hugeString1;
	public static String hugeString2;
	
	@BeforeClass
	public static void setup() {
		for (int i=0; i<50000; i++) {
			hugeString1 += "1";
			hugeString2 += "2";
		}
	}

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testDivBaseCase() {
		assertEquals(1, RecursionC.mod(1,10));
		assertEquals(0, RecursionC.mod(5,1));
		assertEquals(0, RecursionC.mod(125,25));
		assertEquals(1, RecursionC.mod(126,25));
		exception.expect(StackOverflowError.class);
		assertEquals(100000, RecursionC.mod(100000, 1));	
		assertEquals(10000, RecursionC.mod(20000,2));
	}

	@Test
	public void testDivAdvCase() {
		assertEquals(0, RecursionC.mod(0,10));
		//assertEquals(0, RecursionC.mod(0,10));
		assertEquals(0, RecursionC.mod(100,1));
		assertEquals(0, RecursionC.mod(100,100));
		assertEquals(1, RecursionC.mod(101,100));
		assertEquals(99, RecursionC.mod(99,100));
		exception.expect(StackOverflowError.class);
		assertEquals(100000, RecursionC.mod(100000, 1));	
		assertEquals(10000, RecursionC.mod(20000,2));
	}

	@Test
	public void testPatternExistsCBaseCase() {
		assertFalse(RecursionC.patternExists(existPatternC, emptyString, 1));
		assertTrue(RecursionC.patternExists(existPatternC, oneOccurrenceStartP2, 1));
		assertTrue(RecursionC.patternExists(existPatternC, oneOccurrenceEndP2, 1));
		assertTrue(RecursionC.patternExists(existPatternC, oneOccurrenceMiddleP2, 1));
		exception.expect(StackOverflowError.class);
		assertFalse(RecursionC.patternExists("2", hugeString1, 1));	
		assertFalse(RecursionC.patternExists("1", hugeString2, 1));
	}

	@Test
	public void testPatternExistsCAdvCase() {
		assertFalse(RecursionC.patternExists(existPatternC, emptyString, 1));
		assertTrue(RecursionC.patternExists(existPatternC, twoOccurrencesP2, 2));
		assertTrue(RecursionC.patternExists(existPatternC, twoOccurrencesP2, 1));
		assertFalse(RecursionC.patternExists(existPatternC, twoOccurrencesP2, 3));
		assertTrue(RecursionC.patternExists(existPatternC, fourOccurrencesP2, 1));
		assertTrue(RecursionC.patternExists(existPatternC, fourOccurrencesP2, 2));
		assertTrue(RecursionC.patternExists(existPatternC, fourOccurrencesP2, 3));
		assertTrue(RecursionC.patternExists(existPatternC, fourOccurrencesP2, 4));
		assertFalse(RecursionC.patternExists(existPatternC, fourOccurrencesP2, 5));
		exception.expect(StackOverflowError.class);
		assertFalse(RecursionC.patternExists("2", hugeString1, 1));	
		assertFalse(RecursionC.patternExists("1", hugeString2, 1));
	}
	
	@Test
	public void testReplaceCBaseCase() {
		assertEquals(emptyString,RecursionC.replace(countPatternC, emptyString, 1));
		assertEquals(countPatternC.toUpperCase() + welcome,RecursionC.replace(countPatternC, oneOccurrenceStart, 1));
		assertEquals(welcome + countPatternC.toUpperCase(),RecursionC.replace(countPatternC, oneOccurrenceEnd, 1));
		assertEquals(welcome + countPatternC.toUpperCase() + welcome,RecursionC.replace(countPatternC, oneOccurrenceMiddle, 1));
	}

	@Test
	public void testReplaceCAdvCase() {
		assertEquals(countPatternC + welcome + countPatternC.toUpperCase(), RecursionC.replace(countPatternC, twoOccurrences, 2));
		assertEquals(countPatternC + " " + countPatternC + " " + countPatternC.toUpperCase() + " " + countPatternC, 
				RecursionC.replace(countPatternC, fourOccurrences, 3));
	}

}
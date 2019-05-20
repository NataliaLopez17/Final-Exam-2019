import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CollectionsC {

	public enum Gender {MALE, FEMALE, OTHER}
	public enum Major {CIIC, INSO, ICOM, SICI, COMP}

	public static class Student {
		private int id;
		private String firstName;
		private String lastName;
		private Gender gender;
		private double gpa;
		private Major major;

		public Student(int id, String firstName, String lastName, Gender gender, double gpa, Major major) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.gpa = gpa;
			this.major = major;
		}

		public int getId() { return id; }
		public String getFirstName() { return firstName; }
		public String getLastName() { return lastName; }		
		public Gender getGender() { return gender; }
		public double getGPA() { return gpa; }
		public Major getMajor() { return major; }

		public boolean equals(Object o) {
			if (o instanceof Student) {
				Student s = (Student) o;
				return (s.getId() == this.getId());
			}
			return false;
		}

		@Override 
		public int hashCode() { return this.id; }
	}

	/**
	 * EXERCICE #1
	 * A method that returns all non CSE (CIIC or INSO) students with a GPA
	 * that is equal or greater than 3.0.  These will be invited to CSE orientation.
	 * Hint: A HashSet might be helpful.
	 * @param s
	 * @return
	 */
	public static Set<Student> getTransferCandidates(Set<Student> s) {
		Set<Student> result = new HashSet<Student>();
		for(Student c: s) {
			if(c.major != Major.INSO && c.major != Major.CIIC && c.getGPA() >= 3) {
				result.add(c);
			}
		}
		// TODO YOUR CODE HERE
		return result;
	}


	/**
	 * EXERCISE #2
	 * A method that returns a NEW set with the union of two other sets.
	 * The union of sets A,B consists of the set of all elements that are
	 * either in A or in B or in both.
	 * Ex. If s1 = {1, 2, 3, 4} and s2 = {3, 4, 5, 6} the union is the set
	 * {1, 2, 3, 4, 5, 6}.
	 * Hint: The Set methods could come in handy.
	 * THIS PROBLEM DOES NOT REQUIRE ANY LOOPS
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static Set<Student> getUnion(Set<Student> s1, Set<Student> s2) {
		Set<Student> result = new HashSet<Student>();
		if(s1.contains(s2) || s2.contains(s1)) {
			//result.add(s1.)
		}
		// TODO YOUR CODE HERE

		return result; // DUMMY RETURN
	}


	/**
	 * EXERCISE #3
	 * A method that takes a collection of students and returns a map with
	 * the count or histogram of gpa scores of a set of students.
	 * @param words
	 * @return
	 */
	public static Map<Double, Integer> gpaCount(Collection<Student> students) {
		Map<Double,Integer> result = new HashMap<Double,Integer>();
		int count = 0;
		for(Student c: students) {
			count++;
		}
		return result;
	}



	/**
	 * EXERCISE #4
	 * A method that returns if a given a string consists of 
	 * a sequence of balanced parenthesis is balanced or not. 
	 * The string may contain '(', ')', '{', and '}'
	 * 
	 * You must use a Stack<Character> to check that a string is balanced.
	 * 
	 * Read the test cases for examples of balanced and unbalanced
	 * strings.
	 * 
	 * NO RECURSION ALLOWED. MUST USE A STACK FOR CREDIT.
	 * @param parens
	 * @return
	 */
	public static boolean hasBalancedParens(String parens) {
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i < parens.length(); i++) {
			if(parens.startsWith(")") || parens.startsWith("(") || parens.startsWith("{") || parens.startsWith("}")) {
				//s.push();
			}
		}
		return false;
	}
}
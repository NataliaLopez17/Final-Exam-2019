import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class CollectionsCTest {

	public CollectionsC.Student s0;
	public CollectionsC.Student s1;
	public CollectionsC.Student s2;
	public CollectionsC.Student s3;
	public CollectionsC.Student s4;
	public CollectionsC.Student s5;
	public CollectionsC.Student s6;
	public CollectionsC.Student s7;
	public CollectionsC.Student s8;
	public CollectionsC.Student s9;

	public Set<CollectionsC.Student> empty;
	public Set<CollectionsC.Student> allStudents;
	public Set<CollectionsC.Student> allCSE;
	public Set<CollectionsC.Student> noCSE;
	public Set<CollectionsC.Student> noCSEHonors;
	public Set<CollectionsC.Student> onlyCSEHonors;
	public Set<CollectionsC.Student> transCandidates;
	

	@Before
	public void setUp() {

		s0 = new CollectionsC.Student(10, "Juan", "Perez",CollectionsC.Gender.MALE, 3.2, CollectionsC.Major.CIIC);
		s1 = new CollectionsC.Student(20, "Juana", "Perez",CollectionsC.Gender.FEMALE, 3.3, CollectionsC.Major.INSO);
		s2 = new CollectionsC.Student(30, "Pedro", "Rivera",CollectionsC.Gender.MALE, 2.8, CollectionsC.Major.SICI);
		s3 = new CollectionsC.Student(40, "Petra", "Rivera",CollectionsC.Gender.FEMALE, 3.9, CollectionsC.Major.CIIC);
		s4 = new CollectionsC.Student(50, "Jose", "Rosas",CollectionsC.Gender.MALE, 3.3, CollectionsC.Major.ICOM);
		s5 = new CollectionsC.Student(60, "Josefa", "Rosas",CollectionsC.Gender.FEMALE, 3.3, CollectionsC.Major.INSO);
		s6 = new CollectionsC.Student(70, "Carmelo", "Rivera",CollectionsC.Gender.MALE, 2.8, CollectionsC.Major.CIIC);
		s7 = new CollectionsC.Student(80, "Carmela", "Rivera",CollectionsC.Gender.FEMALE, 3.9, CollectionsC.Major.INSO);
		s8 = new CollectionsC.Student(90, "Millo", "Diaz",CollectionsC.Gender.MALE, 3.9, CollectionsC.Major.SICI);
		s9 = new CollectionsC.Student(99, "Milla", "Diaz",CollectionsC.Gender.FEMALE, 3.9, CollectionsC.Major.ICOM);

		empty = new HashSet<CollectionsC.Student>();
		allStudents = new HashSet<CollectionsC.Student>();
		allStudents.add(s0); allStudents.add(s1); allStudents.add(s2); allStudents.add(s3); allStudents.add(s4);
		allStudents.add(s5); allStudents.add(s6); allStudents.add(s7); allStudents.add(s8); allStudents.add(s9);
		
		allCSE = new HashSet<CollectionsC.Student>();
		allCSE.add(s0); allCSE.add(s1); allCSE.add(s3); allCSE.add(s5); allCSE.add(s6); allCSE.add(s7);
		
		noCSE = new HashSet<CollectionsC.Student>();
		noCSE.add(s2); noCSE.add(s4); noCSE.add(s8); noCSE.add(s9);
		
		noCSEHonors = new HashSet<CollectionsC.Student>();
		noCSEHonors.add(s0); noCSEHonors.add(s1); noCSEHonors.add(s4); noCSEHonors.add(s8); noCSEHonors.add(s9);
		
		onlyCSEHonors = new HashSet<CollectionsC.Student>();
		onlyCSEHonors.add(s3); onlyCSEHonors.add(s7); // onlyCSEHonors.add(s8); onlyCSEHonors.add(s9);
		
		transCandidates = new HashSet<CollectionsC.Student>();
		transCandidates.add(s4); transCandidates.add(s8); transCandidates.add(s9);
	}

	@Test
	public void testgetTransferCandidatesBasic() {
		assertEquals(empty, CollectionsC.getTransferCandidates(empty));
		assertEquals(empty, CollectionsC.getTransferCandidates(allCSE));
		assertNotEquals(empty, CollectionsC.getTransferCandidates(noCSE));
	}
	
	@Test
	public void testgetTransferCandidatesAdvanced() {
		assertEquals(transCandidates, CollectionsC.getTransferCandidates(noCSE));
		assertEquals(transCandidates, CollectionsC.getTransferCandidates(allStudents));
		assertEquals(transCandidates, CollectionsC.getTransferCandidates(transCandidates));
		assertFalse(onlyCSEHonors == CollectionsC.getTransferCandidates(onlyCSEHonors));
		assertEquals(transCandidates, CollectionsC.getTransferCandidates(transCandidates));
		assertFalse(transCandidates == CollectionsC.getTransferCandidates(transCandidates));
	}


	@Test
	public void testgetUnionBasic() {	
		assertEquals(empty, CollectionsC.getUnion(empty, empty));
		assertNotEquals("the first set is empty", empty,CollectionsC.getUnion(allCSE, allStudents)); 
	}
	
	@Test
	public void testgetUnionAdvanced() {
		assertEquals(allStudents, CollectionsC.getUnion(allStudents, allStudents));
		assertFalse(allStudents == CollectionsC.getUnion(allStudents, allStudents));
		assertEquals(allStudents, CollectionsC.getUnion(allCSE, allStudents));
		assertFalse(allStudents == CollectionsC.getUnion(allCSE, allStudents));
		assertEquals(allCSE, CollectionsC.getUnion(onlyCSEHonors, allCSE));
		assertEquals(allCSE, CollectionsC.getUnion(allCSE, onlyCSEHonors));
		assertFalse(onlyCSEHonors == CollectionsC.getUnion(allCSE, onlyCSEHonors));
	}

	@Test
	public void testgpaCountBasic() {
		assertEquals(0, (int) CollectionsC.gpaCount(empty).size()); 
		assertNotEquals(1, (int) CollectionsC.gpaCount(allStudents).get(3.3));
		assertNotEquals(1, (int) CollectionsC.gpaCount(allStudents).get(3.9));
	}
		
	@Test
	public void testgpaCountAdvanced() {	
		assertEquals(2, (int) CollectionsC.gpaCount(allStudents).get(2.8));
		assertEquals(1, (int) CollectionsC.gpaCount(allStudents).get(3.2));
		assertEquals(3, (int) CollectionsC.gpaCount(allStudents).get(3.3));
		assertEquals(4, (int) CollectionsC.gpaCount(allStudents).get(3.9));
		assertEquals(null, CollectionsC.gpaCount(allCSE).get(3.8)); 
		assertEquals(null, CollectionsC.gpaCount(allCSE).get(3.0)); 	
		assertEquals(4, (int) CollectionsC.gpaCount(allCSE).size());
		assertEquals(1, (int) CollectionsC.gpaCount(onlyCSEHonors).size());
		assertEquals(3, (int) CollectionsC.gpaCount(noCSEHonors).size());		
	}

	@Test
	public void testHasBalancedParensBasic() {
		assertTrue(CollectionsC.hasBalancedParens("()"));
		assertTrue(CollectionsC.hasBalancedParens("({})"));
		assertFalse(CollectionsC.hasBalancedParens("}{"));
		assertFalse(CollectionsC.hasBalancedParens("}{}{"));
		assertTrue(CollectionsC.hasBalancedParens("(){}()"));
		assertFalse(CollectionsC.hasBalancedParens("{{}"));
		assertFalse(CollectionsC.hasBalancedParens("{}}"));
	}

	@Test
	public void testHasBalancedParensAdvanced() {
		assertTrue(CollectionsC.hasBalancedParens("(){}"));
		assertTrue(CollectionsC.hasBalancedParens("(){()({})}"));
		assertTrue(CollectionsC.hasBalancedParens("{}{}{{()}}()(())"));
		assertFalse(CollectionsC.hasBalancedParens("({)"));
		assertFalse(CollectionsC.hasBalancedParens("(})"));
		assertFalse(CollectionsC.hasBalancedParens("({)}"));
		assertFalse(CollectionsC.hasBalancedParens("({}})"));
		assertFalse(CollectionsC.hasBalancedParens("({{})"));
	}
}
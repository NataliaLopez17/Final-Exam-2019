import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class LoopsAndArraysCTester {
	
	LoopsAndArraysC.BriscaCard B1;
	LoopsAndArraysC.BriscaCard B2;
	LoopsAndArraysC.BriscaCard B3;
	LoopsAndArraysC.BriscaCard B7;
	LoopsAndArraysC.BriscaCard B10;
	LoopsAndArraysC.BriscaCard B12;
	
	LoopsAndArraysC.BriscaCard E1;
	LoopsAndArraysC.BriscaCard E2;
	LoopsAndArraysC.BriscaCard E3;
	LoopsAndArraysC.BriscaCard E7;
	LoopsAndArraysC.BriscaCard E10;
	LoopsAndArraysC.BriscaCard E12;
	
	LoopsAndArraysC.BriscaCard C1;
	LoopsAndArraysC.BriscaCard C2;
	LoopsAndArraysC.BriscaCard C3;
	LoopsAndArraysC.BriscaCard C7;
	LoopsAndArraysC.BriscaCard C10;
	LoopsAndArraysC.BriscaCard C11;
	LoopsAndArraysC.BriscaCard C12;
	
	LoopsAndArraysC.BriscaCard O1;
	LoopsAndArraysC.BriscaCard O2;
	LoopsAndArraysC.BriscaCard O3;
	LoopsAndArraysC.BriscaCard O7;
	LoopsAndArraysC.BriscaCard O10;
	LoopsAndArraysC.BriscaCard O12;

	@Before
	public void loadCards() {
		
		B1 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.ONE);
		B2 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.TWO);
		B3 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.THREE);
		B7 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.SEVEN);
		B10 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.TEN);
		B12 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.TWELVE);
		
		E1 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ESPADA, LoopsAndArraysC.BriscaCard.Rank.ONE);
		E2 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ESPADA, LoopsAndArraysC.BriscaCard.Rank.TWO);
		E3 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ESPADA, LoopsAndArraysC.BriscaCard.Rank.THREE);
		E7 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ESPADA, LoopsAndArraysC.BriscaCard.Rank.SEVEN);
		E10 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ESPADA, LoopsAndArraysC.BriscaCard.Rank.TEN);
		E12 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ESPADA, LoopsAndArraysC.BriscaCard.Rank.TWELVE);
		
		C1 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.COPA, LoopsAndArraysC.BriscaCard.Rank.ONE);
		C2 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.COPA, LoopsAndArraysC.BriscaCard.Rank.TWO);
		C3 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.COPA, LoopsAndArraysC.BriscaCard.Rank.THREE);
		C7 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.COPA, LoopsAndArraysC.BriscaCard.Rank.SEVEN);
		C10 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.COPA, LoopsAndArraysC.BriscaCard.Rank.TEN);
		C11 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.COPA, LoopsAndArraysC.BriscaCard.Rank.ELEVEN);
		C12 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.COPA, LoopsAndArraysC.BriscaCard.Rank.TWELVE);
		
		O1 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.ONE);
		O2 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.TWO);
		O3 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.THREE);
		O7 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.SEVEN);
		O10 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.TEN);
		O12 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.TWELVE);
	}
	
	  @Test
	    public void testequalCardExistBaseCase() {
	    	LoopsAndArraysC.BriscaCard[] emptyDeck = {};
	    	LoopsAndArraysC.BriscaCard[] oneCardDeck = { C7 } ;
	    	LoopsAndArraysC.BriscaCard[] verySmallDeck = { B2, C11 , E7, C2 };
	    	LoopsAndArraysC.BriscaCard[] largeDeck = { O1, E2, C7, E12, O7, C3, C2 };
		  	
		  
	    	LoopsAndArraysC.BriscaCard c1 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.ELEVEN);
	    	LoopsAndArraysC.BriscaCard c2 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.THREE);
	    	
	    	assertFalse("No Card exist in empty list.", c1.equalCardExist(emptyDeck));
	    	assertFalse("There is no equal card.", c1.equalCardExist(oneCardDeck));
	    	assertFalse("There is no equal card.", c2.equalCardExist(oneCardDeck));
	    	assertTrue("There is an equal card.", c1.equalCardExist(verySmallDeck));
	    	assertFalse("There is no equal card.", c2.equalCardExist(verySmallDeck));
	    	assertFalse("There is no equal card.", c1.equalCardExist(largeDeck));
	    	assertTrue("There is a equal card.", c2.equalCardExist(largeDeck));
	    }
	    
	    @Test(timeout=25)
	    public void testequalCardExistAdvCase() {
	    	LoopsAndArraysC.BriscaCard[] boundaryCase1 = { B2, B7 , C12,  E2, B10 };
	    	LoopsAndArraysC.BriscaCard[] boundaryCase2 = { B10, E2, E1, E7, B12, C10, C1, O12  } ;
	    	LoopsAndArraysC.BriscaCard[] extremlylargeDeck = new LoopsAndArraysC.BriscaCard[1000000];
	    	for(int i = 0; i < extremlylargeDeck.length; i++) {
	    		extremlylargeDeck[i] = C10;
	    	}
	    	Random r = new Random();
	    	extremlylargeDeck[r.nextInt(10)] = C11;
	    	extremlylargeDeck[10 + r.nextInt(10)] = C3;

		  
	    	LoopsAndArraysC.BriscaCard c1 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.ORO, LoopsAndArraysC.BriscaCard.Rank.ELEVEN);
	    	LoopsAndArraysC.BriscaCard c2 = new LoopsAndArraysC.BriscaCard(LoopsAndArraysC.BriscaCard.House.BASTO, LoopsAndArraysC.BriscaCard.Rank.THREE);
	    
	    	assertFalse("There is no equal card.", c1.equalCardExist(boundaryCase1));
	    	assertFalse("There is no equal card.", c2.equalCardExist(boundaryCase1));
	    	assertFalse("There is no equal card.", c1.equalCardExist(boundaryCase2));
	    	assertFalse("There is no equal card.", c2.equalCardExist(boundaryCase2));
	    	assertTrue("There is a equal card.", c1.equalCardExist(extremlylargeDeck));
	    	assertTrue("There is a equal card.", c2.equalCardExist(extremlylargeDeck));
	    }
	
	
    @Test
    public void testMaxCardBaseCase() {
    	LoopsAndArraysC.BriscaCard[] emptyDeck = {};
    	LoopsAndArraysC.BriscaCard[] oneCardDeck = { O7 } ;
    	LoopsAndArraysC.BriscaCard[] twoSameRankDeck = { E3, C3 };
    	LoopsAndArraysC.BriscaCard[] twoSameHouseDeck = { B2, B10 } ;
    	LoopsAndArraysC.BriscaCard[] twoSameDeck = { O3, O3 };


    	
    	assertEquals("It should have returned -1", -1, LoopsAndArraysC.BriscaCard.findMaxCard(emptyDeck));
    	assertEquals("This should have returned the pos 0.", 0, LoopsAndArraysC.BriscaCard.findMaxCard(oneCardDeck));
    	assertEquals("This should have returned the pos 1.", 1 , LoopsAndArraysC.BriscaCard.findMaxCard(twoSameRankDeck));
    	assertEquals("This should have returned the pos 1.", 1 , LoopsAndArraysC.BriscaCard.findMaxCard(twoSameHouseDeck));
    	assertEquals("This should have returned the pos 0." , 0, LoopsAndArraysC.BriscaCard.findMaxCard(twoSameDeck));
    }
    
    @Test
    public void testMaxCardAdvCase() {
    	LoopsAndArraysC.BriscaCard[] twoCardDeck = { C7, E12 };
    	LoopsAndArraysC.BriscaCard[] twoCardDeck2 = { B10, O1 } ;
    	LoopsAndArraysC.BriscaCard[] bigFirstDeck = { C12, C7, E12, E1, B1, B12, C10, C1, E3, C3, E2};
    	LoopsAndArraysC.BriscaCard[] bigLastDeck = { C10, C3, E12, E1, O10, B1, C7, B12, O1, C1, C2, E7, O12 };
    	LoopsAndArraysC.BriscaCard[] bigMiddleDeck = { C1, E3, B12, E2, B10, B1, C7, B2, E1, C3, C2, E7, E12 };
    	LoopsAndArraysC.BriscaCard[] twoBigDeck = { E10, E3, B12, E12, B10, B1, E7, B2, E2, E12, E7, E1 };

    	
    	assertEquals("It should have returned pos 0", 0, LoopsAndArraysC.BriscaCard.findMaxCard(twoCardDeck));
    	assertEquals("It should have returned the pos 1.", 1, LoopsAndArraysC.BriscaCard.findMaxCard(twoCardDeck2));
    	assertEquals("This should have returned the pos 0.", 0 , LoopsAndArraysC.BriscaCard.findMaxCard(bigFirstDeck));
    	assertEquals("This should have returned the pos 12.", 12 , LoopsAndArraysC.BriscaCard.findMaxCard(bigLastDeck));
    	assertEquals("This should have returned the pos 6." , 6, LoopsAndArraysC.BriscaCard.findMaxCard(bigMiddleDeck));
    	assertEquals("This should have returned the pos 3." , 3, LoopsAndArraysC.BriscaCard.findMaxCard(twoBigDeck));
    }
    
    @Test
    public void testhasMoreThanTwoThirdOfPointsBaseCase() {
    	LoopsAndArraysC.BriscaCard[] emptyDeck = {};
    	LoopsAndArraysC.BriscaCard[] oneCardDeck = { C12 } ;
    	LoopsAndArraysC.BriscaCard[] zeroPointDeck = { B2, B7, O7, O2 , E7, C2 };
    	LoopsAndArraysC.BriscaCard[] smallPointDeck = { B12, E10, E2, E7, B7, C12, O7, O3 } ;
    	LoopsAndArraysC.BriscaCard[] largePointDeck = { O1, E2, C7, E12, O7, C12, C2, E1, B1, E3, C1, B12, O12, B3, O3, C10 };
	  	    	
    	assertFalse("The deck has no more than 1/2 the points.", LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(emptyDeck));
    	assertFalse("The deck has no more than 1/2 the points.", LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(oneCardDeck));
    	assertFalse("The deck has no more than 1/2 the points.", LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(zeroPointDeck));
    	assertFalse("The deck has no more than 1/2 the points.", LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(smallPointDeck));
    	assertTrue("The deck has no more than 1/2 the points.",  LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(largePointDeck));

    }
    
    @Test
    public void testhasMoreThanTwoThirdOfPointsAdvCase() {
    	LoopsAndArraysC.BriscaCard[] seventyNinePointDeck = { E3, C12, B2, E3, B1, C10, C3, C1, E7, O7, O3, E1 };
    	LoopsAndArraysC.BriscaCard[] eightyPointDeck = { E3, C12, B2, E3, B1, C11, C3, C1, E7, O7, O3, E1 } ;
    	LoopsAndArraysC.BriscaCard[] extremlylargeDeck = new LoopsAndArraysC.BriscaCard[10000000];
    	for(int i = 0; i < extremlylargeDeck.length; i++) {
    		extremlylargeDeck[i] = C12;
    	}
    	
    	assertFalse("The deck has no more than 1/2 the points.", LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(seventyNinePointDeck));
    	assertTrue("The deck has no more than 1/2 the points.",  LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(eightyPointDeck));
    	double timeBefore = System.currentTimeMillis();
    	assertTrue("The deck has no more than 1/2 the points.",  LoopsAndArraysC.BriscaCard.hasMoreThanTwoThirdOfPoints(extremlylargeDeck));
    	double timeAfter = System.currentTimeMillis();
    	assertTrue("Must finish as soon as answer is known.", timeAfter-timeBefore < 7 );
    }
    
    @Test
    public void testdifferenceOfDecksBaseCase() {
    	LoopsAndArraysC.BriscaCard[] emptyDeck = {};
    	LoopsAndArraysC.BriscaCard[] twoCardDeck = { C7, E12 };
    	LoopsAndArraysC.BriscaCard[] twoCardDeck2 = { B10, O1 } ;
    	LoopsAndArraysC.BriscaCard[] smallDeck = { C12, C7, E12, E1, B12, C10, E3, C3, E2};

    	LoopsAndArraysC.BriscaCard[] assert1Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(emptyDeck, emptyDeck);
    	assertFalse("It should return a new array instance.", assert1Result==emptyDeck);
    	assertEquals("It should have returned an empty deck", 0 ,assert1Result.length);
    	
    	LoopsAndArraysC.BriscaCard[] assert2Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(twoCardDeck, twoCardDeck2);
    	LoopsAndArraysC.BriscaCard[] expectedResult2 = {C7, E12, null, null};
    	assertFalse("It should return a new array instance.", assert2Result==twoCardDeck);
    	assertFalse("It should return a new array instance.", assert2Result==twoCardDeck2);
    	assertEquals("It should have returned a array sized of both arrays", 4 ,assert2Result.length);
    	assertTrue("It should have returned an array with the items in that order.", Arrays.equals(expectedResult2 ,assert2Result));
    	
    	LoopsAndArraysC.BriscaCard[] assert3Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(smallDeck, smallDeck);
    	LoopsAndArraysC.BriscaCard[] expectedResult3 =  new LoopsAndArraysC.BriscaCard[smallDeck.length*2];
    	assertFalse("It should return a new array instance.", assert3Result==smallDeck);
    	assertEquals("It should have returned a array sized of both arrays", expectedResult3.length ,assert3Result.length);
    	assertTrue("It should have returned an array with the items in that order.", Arrays.equals(expectedResult3 ,assert3Result));
    	
    	LoopsAndArraysC.BriscaCard[] assert4Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(smallDeck, twoCardDeck);
    	LoopsAndArraysC.BriscaCard[] expectedResult4 =  { C12, E1, B12, C10, E3, C3, E2, null, null, null, null };
    	assertFalse("It should return a new array instance.", assert4Result==smallDeck);
    	assertEquals("It should have returned a array sized of both arrays", smallDeck.length + twoCardDeck.length ,assert4Result.length);
    	assertTrue("It should have returned an array with the items in that order.", Arrays.equals(expectedResult4 ,assert4Result));
    }
    
    @Test
    public void testdifferenceOfDecksAdvCase() {
    	LoopsAndArraysC.BriscaCard[] emptyDeck = {};
    	LoopsAndArraysC.BriscaCard[] twoCardDeck = { C7, E12 };
    	LoopsAndArraysC.BriscaCard[] smallDeck = { C12, C7, E12, E1, E10, C10, O3, C3, E2};
    	LoopsAndArraysC.BriscaCard[] smallDeck2 = { C1, C11, E10, B1, C10, O10, E3, O3, O1};
    	
    	
    	LoopsAndArraysC.BriscaCard[] assert1Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(smallDeck, emptyDeck);
    	assertFalse("It should return a new array instance.", assert1Result==smallDeck);
    	assertFalse("It should return a new array instance.", assert1Result==emptyDeck);
    	assertEquals("It should have returned a array sized of both arrays", smallDeck.length ,assert1Result.length);
    	assertTrue("It should have returned an array with the items in that order.", Arrays.equals(smallDeck ,assert1Result));
    	
    	LoopsAndArraysC.BriscaCard[] assert2Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(emptyDeck, smallDeck);
    	LoopsAndArraysC.BriscaCard[] expectedResult2 =  new LoopsAndArraysC.BriscaCard[smallDeck.length];
    	assertFalse("It should return a new array instance.", assert2Result==smallDeck);
    	assertFalse("It should return a new array instance.", assert2Result==emptyDeck);
    	assertEquals("It should have returned a array sized of both arrays", expectedResult2.length ,assert2Result.length);
    	assertTrue("It should have returned an array with the items in that order.", Arrays.equals(expectedResult2 ,assert2Result));
    	
    	LoopsAndArraysC.BriscaCard[] assert3Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(smallDeck, smallDeck2);
    	LoopsAndArraysC.BriscaCard[] expectedResult3 =  {  C12, C7, E12, E1, C3, E2, null, null, null, null, null, null, null, null, null, null, null, null };
    	assertFalse("It should return a new array instance.", assert3Result==smallDeck);
    	assertFalse("It should return a new array instance.", assert3Result==smallDeck2);
    	assertEquals("It should have returned a array sized of both arrays", expectedResult3.length ,assert3Result.length);
    	assertTrue("It should have returned an array with the items in that order.", Arrays.equals(expectedResult3 ,assert3Result));
    	
    	LoopsAndArraysC.BriscaCard[] assert4Result = LoopsAndArraysC.BriscaCard.differenceOfDecks(twoCardDeck, smallDeck);
    	LoopsAndArraysC.BriscaCard[] expectedResult4 =  new LoopsAndArraysC.BriscaCard[smallDeck.length + twoCardDeck.length];
    	assertFalse("It should return a new array instance.", assert4Result==smallDeck);
    	assertEquals("It should have returned a array sized of both arrays", smallDeck.length + twoCardDeck.length ,assert4Result.length);
    	assertTrue("It should have returned an array with the items in that order.", Arrays.equals(expectedResult4 ,assert4Result));
    } 	
}
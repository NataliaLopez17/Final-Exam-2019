public class LoopsAndArraysC {

	public static class BriscaCard implements Comparable<BriscaCard>{

		//Enumerated type for a house
		public enum House {BASTO, ESPADA, COPA, ORO};

		//Enumerated type for a rank
		public enum Rank { ONE(11), TWO(0), THREE(10), FOUR(0), FIVE(0),
			SIX(0), SEVEN(0), TEN(2), ELEVEN(3), TWELVE(4); 
			private final int value;
			Rank(int value) {
				this.value = value;
			}
			int value() {
				return value;
			}
		}

		private House house; //House of a card, it goes between Basto, Espada, Copa and Oro.
		private Rank rank; // Rank of a card, it goes between 1 till 12 (In order of 1, 2, ... , 11, 12) 

		/**
		 * A constructor that requires a suit and rank input to initialize a Hacker Card
		 * @param house - A suit between Hacker, PC, Internet, Program
		 * @param rank - 
		 */
		public BriscaCard(House house, Rank rank) {
			this.house = house;
			this.rank = rank;
		}

		//getters
		public Rank getRank() {
			return rank;
		}

		public House getSuit() {
			return house;
		}

		//To string to print the object
		public String toString() {
			return "Card:[" + house.name() + ", " + rank.name() + "]";
		}

		//Equals method for comparing if another object is the same as this instance
		public boolean equals(Object obj) {
			if(!(obj instanceof BriscaCard))
				return false;
			BriscaCard other = (BriscaCard) obj;
			return this.house == other.getSuit() && this.rank == other.getRank();
		}

		/**
		 * The compareTo method that return 0 if equals, positive if instance is bigger and
		 * negative if the parameter is bigger.
		 */
		@Override
		public int compareTo(BriscaCard secondCard) {
			if(this.getSuit().ordinal() - secondCard.getSuit().ordinal() == 0) {
				return this.getRank().ordinal() - secondCard.getRank().ordinal();
			} else {
				return this.getSuit().ordinal() - secondCard.getSuit().ordinal();
			}
		}

		/**
		 * Exercise #1
		 * A method that checks if a card exists that has an equal card value 
		 * as the value of the target object.
		 * The value is how many points a card is worth and that value is given by the rank
		 * where any number below 10 is worth 0, 10 is 2, 11 is 3, 12 is 4, 3 is 10 and 1 is 11.
		 * Hint: Use the value() method from the enum type Rank. 
		 * Restriction: End Method as soon as the answer is known.
		 * @param deck
		 * @return
		 */
		public boolean equalCardExist(BriscaCard[] deck) {
			for(int i = 0; i < deck.length; i++) {
				if(this.rank.value() == deck[i].getRank().value()) {
					return true;
				}
			}

			return false;
		}

		/**
		 * Exercise #2
		 * A method that searches the smallest card in the deck.
		 * It returns the position of the found card, -1 if no card is present.
		 * Hint: Use the compareTo Method.
		 * @param deck
		 * @return
		 */
		public static int findMaxCard(BriscaCard[] deck) {
			BriscaCard neue = deck[0];
			for(int i = 0; i < deck.length; i++) {
				for(int j = i+1; j < deck.length; j++) {
					if(deck[i].compareTo(deck[j]) > 0) {
						return j;
					}
				}
			}
			return -1;
		}

		/**
		 * Exercise #3
		 * A method that checks if the deck's total value is more or equal than 2/3 of 
		 * the total points of the game. 
		 * The total points of the game is 120 points.
		 * Hint: The value is how many points a card 
		 * is worth (Use the value method from the variables type Rank)
		 * Restriction: End Method as soon as the answer is known.
		 * @param deck
		 * @return
		 */
		public static boolean hasMoreThanTwoThirdOfPoints(BriscaCard[] deck) {
			int sum = 0;
			for(int i = 0; i < deck.length; i++) {
				sum += deck[i].getRank().value();
				if(sum >= 80) {
					return true;
				}
			}

			return false;
		}

		/**
		 * Exercise #4
		 * A method that returns a new array with the difference between 2 decks
		 * (a.k.a only elements that appear on the first deck, but not both decks)
		 * You may assume the arrays have unique elements.
		 * Restriction: End Method or Partial Code as soon as the answer is known.
		 * Restriction: You can't use collections.
		 * @param deck
		 * @return
		 */
		public static BriscaCard[] differenceOfDecks(BriscaCard[] deck1, BriscaCard[] deck2) {
			int count = 0;
			BriscaCard[] result = new BriscaCard[deck1.length + deck2.length];
			for(int i = 0; i < deck1.length; i++) {
				for(int j = 0; j < deck2.length; j++) {
					if(!(deck1[i].equals(deck2[j]))) {
						count++;
						result[i] = deck1[i];
					}
				}
			}
			BriscaCard[] result2 = new BriscaCard[count];
			for(int i = 0; i < result.length; i++) {
				if(result[i] != null) {
					result2[i] = result[i];
				}
			}
			return result2;
		}
	}
}
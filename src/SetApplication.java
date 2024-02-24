import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetApplication {
	// Instantiate new hashset
	private static Set<String> pokerHands = new HashSet<>();

	public static void main(String[] args) throws FileNotFoundException {
		
		// extract the data from the CSV
		extractDataFromCSV("PokerHands.csv");
		printToConsole("After Task 2:");

		// remove ACE HIGH and QUEEN HIGH
		removeHands("ACE HIGH", "QUEEN HIGH");
		printToConsole("After Task 3:");

		// Update PAIR to DEUCES
		updateHand("PAIR", "DEUCES");
		printToConsole("After Task 4:");
	}

	public static void printToConsole(String message) {
		System.out.println(message);
		System.out.println("");
		System.out.println("--------------------------------");
		
		for (String hand : pokerHands) {
			System.out.println(hand);
		}
		System.out.println("");
	}

	public static void extractDataFromCSV(String fileName) throws FileNotFoundException {
		fileName = "PokerHands.csv";
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));

			// Skip the header line
			scanner.nextLine();

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(",");

				// Assuming the CSV structure is "Player,Winning Hand"
				//String player = parts[0].trim();
				String winningHand = parts[1].trim();

				// Add the winning hand to the HashSet
				pokerHands.add(winningHand);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Method to remove specific hands from the HashSet
	public static void removeHands(String hand1, String hand2) {
		pokerHands.remove(hand1);
		pokerHands.remove(hand2);
	}

	// Method to update a hand in the HashSet
	public static void updateHand(String oldHand, String newHand) {
		if (pokerHands.remove(oldHand)) {
			pokerHands.add(newHand);
		}
	}
}

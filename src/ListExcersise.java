import java.util.ArrayList;
import java.util.List;

public class ListExcersise {

	public static void main(String[] args) {

		List<String> chores = new ArrayList<String>();
		chores.add("Wash Dishes");
		chores.add("Fold Laundry");
		chores.add("Code for an hour");

		System.out.println("After Task 2:");
		System.out.println();
		printChoresToConsole(chores);

		System.out.println("After Task 3:");
		System.out.println();
		chores.remove(0);
		printChoresToConsole(chores);

		System.out.println("After Task 4:");
		System.out.println();
		chores.remove(1);
		chores.add("Code All Day");
		printChoresToConsole(chores);
	}

	private static void printChoresToConsole(List<String> chores) {
		for (String chore : chores) {
			System.out.println(chore);

		}
		System.out.println();
	}

}

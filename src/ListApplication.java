import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {

	// CRUD = Create Read Update Delete -> what programmers do in the daily
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Trevor Page");
		names.add("Jone Doe");
		names.add("Jane Doe");
		names.add("Elon Musk");
		names.add("Josh Someone");

		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

		printArrayListToConsole(names);

		// example1();
	}

	private static void example1() {
		String[] names = new String[4];

		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "Jone Doe";
		names[3] = "Elon Musk";

		names[1] = null;
		for (String name : names) {
			System.out.println(name);
		}
		// Note: an interface is not a concrete class. you cannot instantiate an
		// interface

		// collections -> Java solution to common data structure problems
		// types of collections:
		// List
		// Set
		// Map

		System.out.println("--------------");
		System.out.println();

		List<String> elements = new ArrayList<String>();
		elements.add("Trevor Page");
		elements.add("Jone Doe");
		elements.add("Jane Doe");
		elements.add("Elon Musk");
		elements.add("Josh Someone");

		System.out.println("List example: ");
		printArrayListToConsole(elements);

		elements.remove(1);
		printArrayListToConsole(elements);
	}

	private static void printArrayListToConsole(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}

}

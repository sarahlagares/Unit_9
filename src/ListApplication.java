 import java.util.ArrayList;
import java.util.List;

public class ListApplication {

	//CRUD = Create Read Update Delete -> what programmers do in the daily
	public static void main(String[] args) {
		String[] names = new String[4];
		
		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "Jone Doe";
		names[3] = "Elon Musk";
		
		names[1] = null;
		for (String name : names) {
			System.out.println(name);
		}
		//Note: an interface is not a concrete class. you cannot instantiate an interface
		
		//collections -> Java solution to common data structure problems
		//types of collections:
		//List 
		//Set
		//Map
		
		System.out.println("--------------");
		System.out.println();
		
		List<String> elements = new ArrayList<String>();
		elements.add("Trevor Page");
		elements.add("Jone Doe");
		elements.add("Jane Doe");
		elements.add("Elon Musk");
		elements.add("Josh Someone");
		
		System.out.println("List example: ");
		PrintArrayListToConsole(elements);
		
		elements.remove(1);
		PrintArrayListToConsole(elements);
	}

	private static void PrintArrayListToConsole(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}
	
}

import java.util.ArrayList;
import java.util.List;

public class StreamApplication {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		populateNames(names);
		
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		names.parallelStream()
				  .forEach(name -> System.out.println(name));
	} 

	private static void populateNames(List<String> names) {
		names.add("Nahla Kirland");
		names.add("Charles Gray");
		names.add("Jamie-Lee Swan");
		names.add("George Mckeown");
		names.add("Deen Markman");
		names.add("Misha Ali");
		names.add("Tanya James");
		names.add("Taybah Wilkinson");
		names.add("Zac Holman");
		names.add("Kacie Dunlap");
		
	}

}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetApplication {
	public static void main(String[] args) {
		Set <Person> people = new HashSet<>();
		
		people.add(new Person(1111111111, "Trevor", "Page"));
		people.add(new Person(1111111111, "Treavor2", "Page2"));
		
		for (Person person : people) {
			System.out.println(person);
		}
		
				//example1();
	}
	
private static void example1() {
	Set<Integer> uniqueNumbers = new LinkedHashSet<>();
	
	System.out.println(uniqueNumbers.add(1));
	System.out.println(uniqueNumbers.add(2));
	System.out.println(uniqueNumbers.add(3));
	System.out.println(uniqueNumbers.add(4));
	System.out.println(uniqueNumbers.add(5));
	System.out.println(uniqueNumbers.add(6));
}
}
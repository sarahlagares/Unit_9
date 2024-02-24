import java.util.HashMap;
import java.util.Map;

public class MapApplication {

	public static void main (String[] args) {
		// Key = SSN
		// Value = Person's Name
		Map<Integer, String> people = new HashMap<>();
		
		//a Key is to uniquely identify the data that is being stored in the value. 
		// HashMaps store data as Key / Value pairs
		//											  K  /  V
		
		people.put(111111111, "Trevor Page");
		people.put(222222222, "Josh Someone");
		people.put(333333333, "Elon Musk");
		people.put(444444444, "Jane Doe");
		people.put(555555555, "Jeff Bezos");
		people.put(555555555, "John Doe");
		
		System.out.println("Get data using an invalid key");
		System.out.println(people.get(123456789));
		
		System.out.println("Get data using a valid key");
		System.out.println(people.get(333333333));
		
		System.out.println("Get data using a valid key");
		System.out.println(people.get(555555555));
		
		people.remove(555555555);
		System.out.println("Get data using an invalid key");
		System.out.println(people.get(555555555));
	}
}
 
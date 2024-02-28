import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApplication {

	public static void main(String[] args) {
		List<List<Integer>> listOfNumbersList = new ArrayList<>();
		listOfNumbersList.add(Arrays.asList(1,2,3)); 
		listOfNumbersList.add(Arrays.asList(2,3,4)); 
		listOfNumbersList.add(Arrays.asList(3,4,5)); 
		listOfNumbersList.add(Arrays.asList(4,5,6)); 
		
		long sum = listOfNumbersList.stream()
								                        .flatMap(x -> x.stream())
								                        .mapToInt(x -> x.intValue())
		                                                .sum();
		System.out.println(sum);
		
		
//		example2();
//		example1();
	}

	private static void example2() {
		List <Car> cars = new ArrayList<>();
		
		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "F150", 2017));
		cars.add(new Car("Toyota", "Corolla", 1997));
		cars.add(new Car("Toyota", "Celica", 2002));
		
		List<String> models = cars.stream()
		                                           .map(car -> car.getModel())
		                                           .collect(Collectors.toList());
		
		String brands = cars.stream()
				    				    .map(car -> car.getBrand())
				    				    .distinct()
				    				    .filter(brand -> brand.startsWith("T"))
				    					.collect(Collectors.joining(" \n"));
		
		models.stream()
					.forEach(model -> System.out.println(model));
		System.out.println("-------");
		System.out.println(brands);
		
//		cars.stream()
//			  .forEach(car -> System.out.println(car));
	}

	private static void example1() {
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

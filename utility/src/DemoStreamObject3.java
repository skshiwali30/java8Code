import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamObject3 {

	public static void main(String[] args) {
		List<DemoStreamObject3Bean> list = Arrays.asList(new DemoStreamObject3Bean(25, "Shiwali", "MZP"),
				new DemoStreamObject3Bean(30, "Anshu", "SGG"),
				new DemoStreamObject3Bean(1, "Kiaansh", "RJT"));
		
		// List of elements sorted in descending order
		List<DemoStreamObject3Bean> l = list.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
		System.out.println("sorted order: " + l);
		
		// filter on the basis of name
		List<DemoStreamObject3Bean> nameList = list.stream().filter(name -> name.getName().startsWith("K")).collect(Collectors.toList());
		System.out.println("Name with K: " + nameList);
	
	}

}

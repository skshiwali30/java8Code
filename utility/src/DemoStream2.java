import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {

	public static void main(String[] args) {
		
		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 12);
		System.out.println("Original list is: " + numsList);
		
		// Find odd number
		List<Integer> odd = numsList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		odd.forEach(System.out :: println);
		
		// Find even Numbers from an Array - Boxing - convert primitive values to their wrapper:
		int[] numsArr = {1,2,3,4,5,6,7};
		// approach 1
		List<Integer> s = Stream.of(1,2,3,4,5,6,7).filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Stream of list is: " + s);
		System.out.println("---------------------------------");
		// approach 2
		List<Integer> evenNums = Arrays.stream(numsArr).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
		evenNums.forEach(System.out :: println);
		
		// To find the first number which is divisible by both 2 and 3
		int num1 = numsList.stream().filter(n -> n % 2 == 0 && n % 3 == 0).findFirst().get();
		System.out.println("First element div by 2, 3 is: " + num1);
		
		int num2 = numsList.stream().filter(n -> n % 2 == 0 && n % 3 == 0).findAny().get();
		System.out.println("First element div by 2, 3 is: " + num2);
		
		// Processing by sorted()method
		List<Integer> l2 = numsList.stream().sorted().collect(Collectors.toList());
		List<Integer> l3 = numsList.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList());
		List<Integer> l4 = numsList.stream().sorted((n1, n2) -> -n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println("Sorted list naturally is: " + l2);
		System.out.println("Sorted list compare is: " + l3);
		System.out.println("Sorted list desc is: " + l4);
		
	}
}

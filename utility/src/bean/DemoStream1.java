import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class DemoStream1 {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("Anshu");
		l.add("Shiwali");
		l.add("Keshav");
		l.add("Keshu");
		l.add("");
		l.add("Kiaansh");
		
		System.out.println("Original List is: " + l);
		System.out.println("-------------------------------------------------------");
		
		// List of element having length > 5
		List<String> list1 = l.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		list1.forEach(System.out :: println);
		System.out.println("-------------------------------------------------------");
		
		// Count of elements having length > 5
		Long count = l.stream().filter(s -> s.length() > 5).count();
		System.out.println("Count of elements having length > 5 is : " + count);
		System.out.println("-------------------------------------------------------");
		
		//Counting empty string
		Long emptyCount = l.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Count of empty elements is : " + emptyCount);
		System.out.println("-------------------------------------------------------");
		
		// Count element start with k
		Long kCount = l.stream().filter(s -> s.startsWith("K")).count();
		System.out.println("Count of elements start with k is : " + kCount);
		System.out.println("-------------------------------------------------------");
		
		// Remove all empty string from list
		List<String> list2 = l.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		list2.forEach(System.out :: println);
		System.out.println("-------------------------------------------------------");
		
		// Remove all empty string from list and join them by :
		String str1 = l.stream().map(s -> s.toUpperCase()).filter(s -> !s.isEmpty()).collect(Collectors.joining(":"));
		System.out.println("String after removing and joing - " + str1);
		System.out.println("-------------------------------------------------------");
		
		// Convert string into uppercase and join them with :
		String str = l.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(":"));
		System.out.println("String after joing - " + str);
		System.out.println("-------------------------------------------------------");

		List<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(3);
		num.add(20);
		num.add(0);
		num.add(25);
		num.add(11);
		
		System.out.println("Original List is: " + num); 
		System.out.println("-------------------------------------------------------");
		
		// List of square of all distinct elements 
		List<Integer> num1 = num.stream().map(n -> n * n).distinct().collect(Collectors.toList());
		num1.forEach(System.out :: println);
		System.out.println("-------------------------------------------------------");
		Set<Integer> set = num.stream().map(n -> n * n).collect(Collectors.toSet());
		set.forEach(System.out :: println);
		System.out.println("-------------------------------------------------------");
		
		// Get count, max, min, average, sum of all elements
		IntSummaryStatistics stat = num.stream().mapToInt(n -> n).summaryStatistics();
		System.out.println("Sum of elements is : " + stat.getSum()); 
		System.out.println("Max of elements is : " + stat.getMax()); 
		System.out.println("Min of elements is : " + stat.getMin()); 
		System.out.println("Average of elements is : " + stat.getAverage());
		System.out.println("COunt of elements is : " + stat.getCount());
		System.out.println("Class of elements is : " + stat.getClass());
		System.out.println("-------------------------------------------------------");
		
	}
}

package stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author dagtekin
 *
 */
public class StreamBasic {

	public static void main(String[] args) {

		// 1. Integer Stream.
		IntStream.range(1, 10).forEach(x -> System.out.print(x + " "));
		System.out.println();

		// 2. Integer Stream skip first 6 elements
		IntStream.range(1, 10).skip(6).forEach(x -> System.out.print(x + " "));
		System.out.println();

		// 3. Integer Stream sum
		int sum = IntStream.range(1, 5).sum();
		System.out.println("Sum:" + sum);

		// 4. Stream of. sort and Find First.
		// prints Canada
		Stream.of("Usa", "Germany", "France", "Canada", "Turkey").sorted().findFirst().ifPresent(System.out::println);

		// 5. Stream of Array sort filter and print
		String[] country = { "Usa", "Germany", "France", "Canada", "Turkey", "Spain" };
		Arrays.stream(country).filter(x -> x.contains("an")).sorted().forEach(System.out::println);

		// 6. Stream of Array sugare of numbers and print average
		Arrays.stream(new int[] { 2, 3, 4, 5, 6 }).map(x -> x * x).average().ifPresent(System.out::println);

		// 7. String List filter,and print

		List<String> people = Arrays.asList("John", "Michael", "Catrine", "Alice", "Elida", "Sezayir", "Erich","Asmen");

		people.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("A")).forEach(System.out::println);

	}

}

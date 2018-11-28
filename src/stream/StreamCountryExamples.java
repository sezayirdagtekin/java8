package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author dagtekin
 *
 */
public class StreamCountryExamples {

	public static void main(String[] args) throws IOException {

		// Stream rows from text file ,filter and print
		Stream<String> stream = Files.lines(Paths.get("config/country.txt"));

		stream.filter(c -> c.startsWith("B")).forEach(System.out::println);
		stream.close();

		System.out.println("------------------------------------");

		// Stream rows from text file and save to list
		List<String> countryList = Files.lines(Paths.get("config/country.txt")).filter(s -> s.startsWith("F"))
				.collect(Collectors.toList());

		countryList.forEach(System.out::println);

		System.out.println("------------------------------------");

		// Stream rows from text file split
		Files.lines(Paths.get("config/country.txt")).map(line -> line.split(":")).filter(x -> x[0].startsWith("Z"))
				.forEach(data -> System.out.println("code:" + data[0] + " name:" + data[1]));

		System.out.println("------------------------------------");

		Stream<String> countryStream = Files.lines(Paths.get("config/country.txt"));

		Map<String, String> mapCountry = countryStream.map(line -> line.split(":")).filter(x -> x[0].startsWith("R"))
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));

		mapCountry.forEach((key, value) -> System.out.println("Country code:" + key + "  Country name:" + value));

	}

}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class LiteracyComparison {

    public static void main(String[] args) {

        List<Country> countries = readFile("literacy.csv");
        //System.out.println(countries);
        //Collections.sort(countries, (c1, c2) -> c1.getLiteracy() - c2.getLiteracy());
        Collections.sort( countries, new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                return Double.compare(c1.getLiteracy(), c2.getLiteracy());
            }
        });
        for( Country country: countries) {
            System.out.println(country);
        }
    }

    public static List<Country> readFile(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(parts -> new Country(parts[3].trim(), Integer.valueOf(parts[4].trim()), parts[2].split(" ")[1], Double.valueOf(parts[5].trim())))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new ArrayList<>();

    }
}

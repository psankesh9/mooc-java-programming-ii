import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.io.IOException;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("literacy.csv"));

            List<LiteracyRecord> records = lines.stream()
                .map(line -> line.split(","))
                .map(parts -> new LiteracyRecord(
                    parts[3].trim(), 
                    Integer.parseInt(parts[4].trim()), 
                    parts[2].trim(), 
                    Double.parseDouble(parts[5].trim())
                ))
                .sorted()
                .collect(Collectors.toList());

            records.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

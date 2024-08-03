import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class BooksFromFile {
    public static List<Book> readBooks(String file) throws Exception {
        return Files.lines(Paths.get(file))
                    .map(line -> {
                        String[] parts = line.split(",");
                        return new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]);
                    })
                    .collect(Collectors.toList());
    }
}


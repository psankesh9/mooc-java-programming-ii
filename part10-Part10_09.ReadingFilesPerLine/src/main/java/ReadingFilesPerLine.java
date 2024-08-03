import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {
    public static List<String> read(String file) throws Exception {
        return Files.lines(Paths.get(file)).collect(Collectors.toList());
    }
}

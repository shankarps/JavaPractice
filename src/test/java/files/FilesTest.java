package files;

import org.junit.Test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * This class has some basic tests for the Files class. It uses the Path and does the actual file CRUD operations.
 */
public class FilesTest {

    @Test
    public void testCurrentFile() throws IOException {
        Path currentFolder = Paths.get(".", "src", "test","java","files");
        Path currentFile = currentFolder.resolve("FilesTest.java");
        //Check if current file has a line with "package" in it.
        Optional match = Files.lines(currentFile).filter(s -> s.contains("package")).findAny();
        assert(match.isPresent());
    }

    @Test (expected = IOException.class)
    public void testInvalidFileRead() throws IOException {
        Path currentFolder = Paths.get(".");
        //get an invalid file
        Path invalid = currentFolder.resolve("invalidFile");
        //This will not happen. Invalid file.
        Files.lines(invalid).forEach(System.out::println);
    }
}

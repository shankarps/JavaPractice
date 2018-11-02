package files;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This class has some test cases for the Paths and Path class.
 * The Paths & Path classes help to decide the path of the file operations.
 */
public class FilePathTest {
    @Test
    public void getFilePathTest(){
        //Get current folder path
        Path filePath = Paths.get(".");

        assert(filePath.toAbsolutePath().toUri().toString() != null);
        System.out.println(filePath.toAbsolutePath().normalize().toUri());

        //Get child folder path
        Path srcFolder = filePath.resolve("src");
        assert(srcFolder.toAbsolutePath().toUri().toString().contains("src"));

        //get a sibling
        Path testFolder = filePath.resolveSibling("test");
        assert(testFolder.toAbsolutePath().toUri().toString().contains("/test"));

        //Path is Iterable.
        testFolder.toAbsolutePath().forEach(System.out::println);

        //NOTE - nothing is resolved (validated) for the child paths.
        // These are just path structures.
        //Even invalid paths will be created.
        Path invalid = Paths.get(".","C2");
        System.out.println(invalid.resolve("invalid").normalize().toUri());
    }
}

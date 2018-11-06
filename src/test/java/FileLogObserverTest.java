import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLogObserverTest {
    private final String FILE_NAME = "C:/temp/temp.txt";
    private final Path PATH = Paths.get(FILE_NAME);
    private final FileLogObserver observer = new FileLogObserver(FILE_NAME);

    @Before
    public void beforeTest() {
        try {
            Files.deleteIfExists(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void update() {
        observer.update("event1");
        String event = "";
        try {
            event = Files.readAllLines(PATH).get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("event1", event);
    }
}

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileLogObserver implements Observer {
    private String fileName;

    public FileLogObserver(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void update(String event) {
        Path path = Paths.get(fileName);
        event += "\r\n";
        byte[] buffer = event.getBytes();
        try {
            if (Files.notExists(path)) Files.createFile(path);
            Files.write(path, event.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.APPEND)) {
//            writer.write(event);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}

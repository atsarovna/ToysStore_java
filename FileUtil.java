import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    // Метод для записи данных в файл
    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
    public static void copyFile(File original, File clone) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(original);
            fileWriter = new FileWriter(clone);

            int count = 0;
            while ((count = fileReader.read()) != -1) {
                fileWriter.write(count);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File original = new File("G:\\codegym\\module2\\btCopyFileText\\src\\orginal");
        File cloneOriginal = new File("G:\\codegym\\module2\\btCopyFileText\\src\\cloneOriginal");

        TextFileCopy.copyFile(original, cloneOriginal);
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/giannis/Desktop/1pwd.txt");
        Scanner scanner = new Scanner(file);
        String fileContent = "";
        while (scanner.hasNext()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }
        FileWriter fileWriter = new FileWriter("/Users/giannis/Desktop/newFile.txt");
        fileWriter.write(fileContent);
        fileWriter.close();
    }
}

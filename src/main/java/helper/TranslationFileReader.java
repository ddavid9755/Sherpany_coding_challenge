package helper;

import java.nio.file.Files;
import java.nio.file.Paths;


public class TranslationFileReader {
    public String fileReader(String fileName) throws Exception {
        String file;
        file = convertFileIntoString(fileName);
        return file;
    }

    public static String convertFileIntoString(String file) throws Exception {
        String result;
        result = new String(Files.readAllBytes(Paths.get(file)));
        return result;
    }




}

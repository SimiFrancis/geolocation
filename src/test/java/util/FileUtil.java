package util;

import java.io.*;

public class FileUtil {
    public static FileReader getFile(String fileName) throws FileNotFoundException {
        File inputJsonFile = new File("" + fileName);
        return new FileReader(inputJsonFile);
    }
}

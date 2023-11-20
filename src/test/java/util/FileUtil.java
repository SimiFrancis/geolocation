package util;

import java.io.*;

public class FileUtil {
    public static FileReader getFile(String fileName) throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream(new File("src/test/resources/files/request.json"));

        File inputJsonFile = new File("" + fileName);
        return new FileReader(inputJsonFile);
    }
}

package util;

import com.google.gson.Gson;

import java.io.FileNotFoundException;

public class JsonUtil {

    public static <T> T getPojoFromFile(String fileName, Class<T> classOfT) throws FileNotFoundException {
        Gson gson = new Gson();
        return gson.fromJson(FileUtil.getFile(fileName), classOfT);
    }
}

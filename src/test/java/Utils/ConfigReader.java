package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     static Properties properties;

    public static Properties readProperty() throws IOException {
        FileInputStream file=new FileInputStream(Constants.PROPERTY_FILE_PATH);
        properties=new Properties();
        properties.load(file);


        return properties;
    }

    public static String getPropValue(String key){
        return properties.getProperty(key);

    }
}

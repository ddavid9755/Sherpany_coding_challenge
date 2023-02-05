package helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "src//main//resources//configuration.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("configuration.properties file not found at: " + propertyFilePath);
        }
    }

    public String getApplicationUrl() {
        String loginPage = properties.getProperty("loginPage");
        if(loginPage != null) return loginPage;
        else throw new RuntimeException("Url not specified in configuration.properties file");
    }

    public String getGermanTranslationFilepath(){
        String germanTranslationFile = properties.getProperty("germanTranslationFile");
        if(germanTranslationFile != null) return germanTranslationFile;
        else throw new RuntimeException("germanTranslationFile not specified in configuration.properties file");
    }

    public String getFrenchTranslationFilepath(){
        String frenchTranslationFile = properties.getProperty("frenchTranslationFile");
        if(frenchTranslationFile != null) return frenchTranslationFile;
        else throw new RuntimeException("frenchTranslationFile not specified in configuration.properties file");
    }

    public String getItalianTranslationFilepath(){
        String italianTranslationFile = properties.getProperty("italianTranslationFile");
        if(italianTranslationFile != null) return italianTranslationFile;
        else throw new RuntimeException("italianTranslationFile not specified in configuration.properties file");
    }

}

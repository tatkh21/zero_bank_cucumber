package com.zerobank.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
   private static Properties properties = new Properties();



    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("File not found in VConfiguration properties");
        }
    }

    public static String getProperty(String str) {
        return properties.getProperty(str);
    }

}

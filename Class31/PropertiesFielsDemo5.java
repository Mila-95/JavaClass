package com.syntax.Class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFielsDemo5 {
    public static void main(String[] args) throws IOException {
        //path of file
        String path="Files/Config.properties";
        //FileInputStream helps us read the data from a file
        FileInputStream fileInputStream=new FileInputStream(path);
        //special class that let us read the data from properties files
        Properties properties=new Properties();
        //Reading the existing data and storing in the properties class
        properties.load(fileInputStream);
        //adding new properties
        properties.put("URL","WWW.Google.com");
        //creating a file on mentioned path
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //Storing all the data from the object inside the class
        properties.store(fileOutputStream,"Aded new propertie URL");
    }
}

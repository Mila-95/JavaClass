package com.syntax.Class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {
        //first step locating the file that we want to read
        String path="/Users/liudmylakushchak/Documents/Config.properties";

        //having to that location
        FileInputStream fileInputStream=new FileInputStream(path);

        // That special class whitch knows how to read the .properties
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));


    }
}

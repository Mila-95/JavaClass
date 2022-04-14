package com.syntax.Class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo4 {
    public static void main(String[] args) throws IOException {
        String path="/Users/liudmylakushchak/Documents/Batch12/Trump.properties";
        FileOutputStream fileInputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("Its crazy","False");
        properties.put("Its ritch","True");
        properties.store(fileInputStream,"Aded some new fields");

    }
}

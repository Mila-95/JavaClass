package com.syntax.Class32;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExelReaderTester {
    public static void main(String[] args) throws IOException {
        String path="/Users/liudmylakushchak/Documents/Batch12/Book4.xlsx";
        List<Map<String,String>> exelData=ExelReader.getData(path,"Sheet1");
    }
}

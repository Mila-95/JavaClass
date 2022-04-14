package com.syntax.Class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExelReader {
    public static List<Map<String,String >> getData(String path,String sheetName) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet(sheetName);
        //A list of map to store the data frim axel each map will store the data from each row
        List<Map<String,String>> exelData=new ArrayList<>();
        //getting the header from exel file so that we can use the data from this header row as a
        // key from map like firstname lastname etc
        Row headerRow=sheet.getRow(0);
        //we write a loop to get all the rows from this sheet exept the first row because it contains the header
        for(int j=0; j< sheet.getPhysicalNumberOfRows(); j++){
            //getting all rows starting from row number 2 skipping the first one because it contains header
            Row row=sheet.getRow(j);
            //for each row we create a new map so that we don't override the data foe all the rows
            LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap();
            //once we have got the row we fetch all th data from all the cell with the help of the loop
            for( int i=0; i< row.getPhysicalNumberOfCells(); i++) {
                //we use header row to get the keys and the rows to get the values for the data
                linkedHashMap.put(headerRow.getCell(i).toString(),row.getCell(i).toString());
            }
            //once we are done storing all the data from a row inside  a map  we put that map
            // inside the list that we create
            exelData.add(linkedHashMap);

        }
       return exelData;
    }
}

package com.syntax.Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo1 {
    public static void main(String[] args) throws IOException {


        String path = "/Users/liudmylakushchak/Documents/Batch12/Book2.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        //special class that reads the exel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //First we ge the sheets by specifying the name of the sheets
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //we read the data row by row
        Row row=sheet.getRow(0);
        //reading the data cell by cell (coloumn)
        Cell cell=row.getCell(0);
        System.out.println(cell);



    }
}

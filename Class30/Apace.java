package com.syntax.Class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Apace {
    public static void main(String[] args) throws IOException {
         String path="/Users/liudmylakushchak/Downloads/poi-bin-5.2.2//Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row =sheet.getRow(0);
        System.out.println(row.getCell(0));


    }
}

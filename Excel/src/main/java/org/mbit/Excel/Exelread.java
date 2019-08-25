package org.mbit.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;



public class Exelread {
	
	
	public static String getData(int row,int col) throws IOException {
		
		File f= new File("E:\\Karthivelu\\Excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(row);
		
		org.apache.poi.ss.usermodel.Cell cell = r.getCell(col);
		
		
		int type = cell.getCellType();
		
		String name="";
		
		if(type==1)
		{
		name=cell.getStringCellValue();
	
		
		}
		
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
			
			Date dt = cell.getDateCellValue();
			SimpleDateFormat f1=new SimpleDateFormat("dd-mmm-yy");
				name=f1.format(dt);
				System.out.println(name);
				
		}
		
		else {
			double d=cell.getNumericCellValue();
			long l=(long)d;
			name=String.valueOf(l);
		}	
			
		}
		return name;
		
		

	}

	public static void main(String[] args) throws IOException {
		
		
		getData(4, 1);

	}

}

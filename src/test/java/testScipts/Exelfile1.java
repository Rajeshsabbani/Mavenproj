package testScipts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelfile1{

public static void main(String[] args) throws Exception {
		
		InputStream inp = new FileInputStream("C:\\Users\\pradeep\\fint_workspace\\MavenPrject\\src\\test\\resources\\list1.xlsx");

	    Workbook wb = WorkbookFactory.create(inp);
	    Sheet sheet = wb.getSheetAt(0);
	    for (int i =0;i<=3;i++)
	    {
	    Row row = sheet.getRow(i);
	    Cell cell = row.getCell(0);
	    System.out.println(cell);
	    
	    }
	}

}

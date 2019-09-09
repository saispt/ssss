package seleniumip;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.*;
public class Read_write_excel {

	
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//FileInputStream file=new FileInputStream("D:\\classroom\\Age_validation.xlsx");
	
		File src=new File("D:\\classroom\\Age_validation.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		/*String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data From Excel is " +data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data From Excel is" +data1 );
		String data2=sheet1.getRow(0).getCell(2).getStringCellValue();
		System.out.println("Data From Excel is" +data2);*/
		int rowcount=sheet1.getLastRowNum();
		System.out.println("total rows" +rowcount);
		for(int i=0;i<rowcount;i++)
		{
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("test data from excel is" + data0);
		}
		
	}

}

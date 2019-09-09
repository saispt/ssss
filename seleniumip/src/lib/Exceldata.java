package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Exceldata {
	 public class String {
	
	}

	XSSFWorkbook wb;
	 XSSFSheet sheet1;
	//private static String excelPath;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		public java.lang.String excelPath)
		{
			File src=new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
	}
		
	}

	private static void Exceldata(Object excelPath2) {
		// TODO Auto-generated method stub
		
	}
}

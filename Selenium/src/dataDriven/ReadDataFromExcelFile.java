package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//STEP 1: Create FIS Object
		FileInputStream fis = new FileInputStream("./TestData/ExcelFIleSelenium.xlsx");//'.' represents current project
		
		//STEP 2:Create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//STEP 3:Call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String email = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		
		String pwd = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(pwd);
		
		double number = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(number);
		
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		Date date = workbook.getSheet("Sheet1").getRow(1).getCell(5).getDateCellValue();
			System.out.println(date);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	}

}

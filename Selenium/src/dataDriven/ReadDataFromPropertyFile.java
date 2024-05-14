package dataDriven;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
			
			FileInputStream fis = new FileInputStream("./TestData/DataDriven.properties");
			Properties prop = new Properties();
			prop.load( fis );
			 String URL = prop.getProperty("url");
			 System.out.println(URL);
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(URL);
			 
			
	}

}

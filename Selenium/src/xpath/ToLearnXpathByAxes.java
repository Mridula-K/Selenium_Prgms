package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {

	public static void main(String[] args) {
    ChromeDriver driver= new ChromeDriver();
    
    driver.get("file:///E:/SeleniumTable.html");
    String collection = driver.findElement(By.xpath("//td[contains(text(),'Jai Bhim')]/following-sibling::td[1]")).getText();
    String imdb = driver.findElement(By.xpath("//td[contains(text(),'Jai Bhim')]/following-sibling::td[2]")).getText();
    System.out.println("collection is "+collection+" and "+"imdb is "+imdb);
    
    
    
	}

}

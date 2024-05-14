package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAttribute 
{
public static void main(String[] args)
{
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
driver.findElement(By.xpath("//input[@value='Vote']")).click();
}
}

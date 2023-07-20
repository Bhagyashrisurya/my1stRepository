package demo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void AjioTest() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  
	  //Assert.fail();
	  
	  driver.close();
	  
	  Thread.sleep(3000);
	  
  }
}

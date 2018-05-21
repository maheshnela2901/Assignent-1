package opengoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Paralleltesting {
	@Test    
    public void executSessionOne(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.quit();
            
        }
        
    @Test    
        public void executeSessionTwo(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.quit();
        
        }
               
}


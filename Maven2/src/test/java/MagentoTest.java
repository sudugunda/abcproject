import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {

	@Test
	public void test() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w = new Welcome(driver);
		w.clickOnMyAcct();
		
		Login l = new Login(driver);
		l.typeEmail("sudusamaje@gmail.com");
		l.typePassword("sudu");
		l.clickOnLogin();
		
		Main m = new Main(driver);
		m.clickOnLogout();
		
		driver.quit();
	}

}

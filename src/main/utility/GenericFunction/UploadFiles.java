package GenericFunction;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.mvm.qa.base.TestBase;
public class UploadFiles extends TestBase {
   
	public void UploadImage() throws InterruptedException
		{
		   LOG.info("in upload fuction");
		    driver.findElement(By.id("upload-prod-img-btn")).click();
			StringSelection t=new StringSelection("C:\\Users\\Rohit jha\\Pictures\\Masala.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(t, null);
		
			try {
			Robot robot = new Robot();
			Thread.sleep(8000);
		
			// Press Enter
			robot.keyPress(KeyEvent.VK_ENTER);
		
			// Release Enter
			robot.keyRelease(KeyEvent.VK_ENTER);
		
			// Press CTRL+V
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
		
			// Release CTRL+V
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
		
			// Press Enter
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			}
			catch (AWTException e)
			{
			e.printStackTrace();
			}
			
		}
	
	
}


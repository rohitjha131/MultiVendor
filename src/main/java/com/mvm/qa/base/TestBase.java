package com.mvm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {

	public static WebDriver driver;
     protected static final Logger LOG = LogManager.getLogger(TestBase.class.getName());

	   public static Properties prop;
//	   public WebDriverWait wait ;
	  
	     public TestBase(){
	    	//  wait=new WebDriverWait(driver, 20);
	    	 try {
	    	 prop = new Properties();
	    	 FileInputStream ip =new FileInputStream("D:\\Workspace\\MultiVendor\\src\\main\\java\\com\\mvm\\qa\\config\\config.Properties");
	    	 prop.load(ip);
	    	 }catch (FileNotFoundException e) {
	    		 e.printStackTrace();
	    	 }catch (IOException e) {
	    		 e.printStackTrace();
	    	 }
	     }
	    
	     public static void initialization() {
	    		System.setProperty("webdriver.chrome.driver", "./Exe./chromedriver.exe");
	    		Date date= new Date();
	    		long time = date.getTime();
	    		/** for accessing main url **/
	    		// String url="https://sp-seller.webkul.com/index.php?";
	    		String url= prop.getProperty("server_url");
	    		String input2=prop.getProperty("admin_store")+time;
	    		TestBase t=new TestBase();
	    		String md5=(t.getMd5(input2));
	    		String shop=prop.getProperty("admin_store");
	    		 driver=new ChromeDriver();
	    		driver.manage().window().maximize();
	    		// WebDriverWait wait=new WebDriverWait(driver, 10);
	    		driver.get(""+url+"p=marketplace&shop="+shop+"&mkey="+md5+"&timestamp="+time+"");
//	    		adminProductCreate.normalProduct t1=new adminProductCreate.normalProduct();
//	    		t1.run();

//	    		return driver;
	    		}
	     public String getMd5(String input)
			{
			try {

			// Static getInstance method is called with hashing MD5
			MessageDigest md = MessageDigest.getInstance("MD5");

			// digest() method is called to calculate message digest
			// of an input digest() return array of byte
			byte[] messageDigest = md.digest(input.getBytes());

			// Convert byte array into signum representation
			BigInteger no = new BigInteger(1, messageDigest);

			// Convert message digest into hex value
			String hashtext = no.toString(16);
			while (hashtext.length() < 32)
			{
			hashtext = "0" + hashtext;
			}
			return hashtext;
			}

			// For specifying wrong message digest algorithms
			catch (NoSuchAlgorithmException e)
			{
			throw new RuntimeException(e);
			}
			
			}
//	     public static void main(String...s) {
//	    	 TestBase t= new TestBase();
//	     }
	     
	     }
		

	


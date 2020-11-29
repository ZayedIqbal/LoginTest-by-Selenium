package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginTest {

	public static void main(String[] args) {
		WebDriver driver= Base.getDriver();
		 
		//go to automationpractice.com
		driver.get("http://automationpractice.com");
		
		//click signIn
		   //find signIn element
		  WebElement element=  driver.findElement(By.className("login"));
		  //click the button
                element.click();
                
           //enter email
                //find email textbox
                element= driver.findElement(By.id("email"));
                //enter email
                element.sendKeys("test@zayed.com");
                
              //Enter password
                 
                driver.findElement(By.id("passwd")).sendKeys("test123456789");
                
              //Enter SignIn
                  //find signin button
                element=driver.findElement(By.id("SubmitLogin"));
                
                //click on signin button
                
                element.click();
                
                
                //verify if logged in or not
                
                WebElement signout=driver.findElement(By.className("logout"));
                WebElement  heading=driver.findElement(By.className("page-heading"));
                
                String heading_text=heading.getText();
                
                
                if(heading_text.equals("MY ACCOUNT")) {
                	System.out.println("Login Test Passed");
                	
                }
                else {
                	System.out.println("Login Test Failed..!!");
                }
                
                
	}

}

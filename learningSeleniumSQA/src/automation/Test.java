package automation;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {


		WebDriver driver = Base.getDriver();
		
		driver.get("http://www.google.com");  //navigate website

	}

}

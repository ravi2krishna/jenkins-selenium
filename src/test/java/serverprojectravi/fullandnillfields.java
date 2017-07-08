package serverprojectravi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fullandnillfields {
@Test
	public  void validandinvalid() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");

		WebDriver driver= new ChromeDriver();
		 driver.get("http://localhost:8081/registration");
		//Full Name//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
	//Address//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
	//in valid Age//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("22");

	//Qualification//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("btech");
	//Percentage//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
	//Year of passing//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
	//Register Button//
driver.findElement(By.xpath("html/body/div[1]/form/input")).click();

Thread.sleep(5000);
driver.get("http://localhost:8081/registration");
//Full Name//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("");
//Address//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("");
//in valid Age//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("");

//Qualification//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("");
//Percentage//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("");
//Year of passing//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("");
//Register Button//
driver.findElement(By.xpath("html/body/div[1]/form/input")).click();


System.out.println("completed");
Thread.sleep(5000);

driver.get("http://localhost:8081/registration");
	//Full Name//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("adapasairamadapasairamadapasairamadapasaira");
//Address//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
//in valid Age//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("22");

//Qualification//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("btech");
//Percentage//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
//Year of passing//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
//Register Button//
driver.findElement(By.xpath("html/body/div[1]/form/input")).click();
System.out.println("We are exectuing with valid inputs:and the result for valid input is ");
	
	String valinp =driver.getTitle();
	if(valinp.contains("Display")){
		System.out.println("It is accepting valid inputs in all the fields");
	}
	else{
		System.out.println("It is not accepting the valid input data");
	}
	}

}

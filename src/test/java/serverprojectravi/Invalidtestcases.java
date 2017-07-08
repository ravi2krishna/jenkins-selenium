package serverprojectravi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invalidtestcases {
	@Test
	public  void wrongtestcase() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver=new ChromeDriver();
		//invalid name age verification//
		driver.get("http://localhost:8081/registration");
		 					//Full Name//
	 driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
	 					//Address//
	 driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaaa");
	 					//in valid Age//
	 driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("twenty two");
	 
	 					//Qualification//
	 driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("btech");
	 					//Percentage//
	 driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
	 					//Year of passing//
	 driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
	 					//Register Button//
	 driver.findElement(By.xpath("html/body/div[1]/form/input")).click();
	 System.out.println("We are exectuing with invalid age field and the result for valid input is:--> ");
		
		String aggg =driver.getTitle();
		if(aggg.contains("User Data")){
			System.out.println("It is accepting invalid 'age' field");
		}
		else{
			System.out.println("It is not accepting the valid input data");
		}
	 Thread.sleep(5000);
	 // invalid qualification verification//
	 driver.get("http://localhost:8081/registration");
		//Full Name//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
	//Address//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
	//in valid Age//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("22");

	//Qualification//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("btech@#24#q");
	//Percentage//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
	//Year of passing//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
	//Register Button//
driver.findElement(By.xpath("html/body/div[1]/form/input")).click();

Thread.sleep(5000);
String quala =driver.getTitle();
if(quala.contains("User Data")){
	System.out.println("It is accepting invalid 'QUALIFICATION' field as invalid input");
}
else{
	System.out.println("It is not accepting the 'QUALIFICATION' as inavld");
}

// invalid percentage verification//
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
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sixty two percentage");
//Year of passing//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
//Register Button//
driver.findElement(By.xpath("html/body/div[1]/form/input")).click();

Thread.sleep(5000);

String percen =driver.getTitle();
if(percen.contains("User Data")){
	System.out.println("It is accepting invalid 'percentage' field as invalid input");
}
else{
	System.out.println("It is not accepting the 'percentage' as inavld");
}
//invalid passout verification//
driver.get("http://localhost:8081/registration");
	//Full Name//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
//Address//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
//in valid Age//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("22");

//Qualification//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("btech@#24#q");
//Percentage//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
//Year of passing//
driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("two thousand sixiteen");
//Register Button//
driver.findElement(By.xpath("html/body/div[1]/form/input")).click();

String yoop =driver.getTitle();
if(yoop.contains("User Data")){
	System.out.println("It is accepting invalid 'year of passed out' field as invalid input");
}
else{
	System.out.println("It is not accepting the 'year of passed out' as inavalid");
}


System.out.println("completed");
Thread.sleep(5000);
	}
}

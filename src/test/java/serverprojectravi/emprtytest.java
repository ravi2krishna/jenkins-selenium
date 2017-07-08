package serverprojectravi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class emprtytest {
	
	
	@Test

		public void  oneemptytest() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			WebDriver driver= new ChromeDriver();
			driver.get("http://localhost:8081/registration");
			//Full Name empty field//
				
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("");
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
String ss=driver.getTitle();
		
		System.out.println("we are executing on 'INVALID INPUT' ");
		if(ss.endsWith("User Data")){
			System.out.println("It is not accepting 'Full Name' field as empty ");
		}
		else{
			System.out.println("It is accepting 'Full Name'  field as empty.");
		}
		
		
		Thread.sleep(5000);
		driver.get("http://localhost:8081/registration");
		
		//Address empty field//
		
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
			//Address//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("");
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

		
String add=driver.getTitle();
		
		System.out.println("we are executing on 'INVALID INPUT' ");
		if(add.contains("User Data")){
			System.out.println("It is not accepting 'Address' field as empty ");
			}
			else{
				System.out.println("It is accepting 'Address' field as empty.");
			}
			
		
		Thread.sleep(5000);
		
		//age empty field//
		driver.get("http://localhost:8081/registration");
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
			//Address//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
			//in valid Age//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("");

			//Qualification//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("btech");
			//Percentage//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
			//Year of passing//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
			//Register Button//
		driver.findElement(By.xpath("html/body/div[1]/form/input")).click();

		
		String ag=driver.getTitle();
		System.out.println("we are executing on 'INVALID INPUT' ");
		if(ag.contains("User Data")){
			System.out.println("It is not accepting 'Age' field as empty ");
			}
			else{
				System.out.println("It is accepting 'Age' field as empty.");
			}
		Thread.sleep(5000);
	//qualification empty field//
		
		
		
		
		driver.get("http://localhost:8081/registration");
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
			//Address//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
			//in valid Age//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("22");

			//Qualification//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("");
			//Percentage//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
			//Year of passing//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
			//Register Button//
		driver.findElement(By.xpath("html/body/div[1]/form/input")).click();
		String qul=driver.getTitle();
				System.out.println("we are executing on 'INVALID INPUT' ");
				if(qul.contains("User Data")){
					
					System.out.println("It is not accepting 'Qualification' field as empty ");
					}
					else{
						System.out.println("It is accepting 'Qualification' field as empty.");
					}
		Thread.sleep(5000);
		
		
		
	//qualification empty field//
		driver.get("http://localhost:8081/registration");
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
			//Address//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
			//in valid Age//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("22");

			//Qualification//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Btech");
			//Percentage//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("");
			//Year of passing//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("2016");
			//Register Button//
		driver.findElement(By.xpath("html/body/div[1]/form/input")).click();
		String per=driver.getTitle();
		if(per.contains("User Data")){
			System.out.println("It is not accepting 'percentage'  field as empty ");
			}
			else{
				System.out.println("It is accepting 'percentage' field as empty.");
			}
		Thread.sleep(5000);
		
		
		driver.get("http://localhost:8081/registration");
		
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sairam");
			//Address//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("2-256/1,aaaa");
			//in valid Age//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("22");

			//Qualification//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Btech");
			//Percentage//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("62");
			//Year of passing//
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("");
			//Register Button//
		driver.findElement(By.xpath("html/body/div[1]/form/input")).click();
		String yop=driver.getTitle();
		if(yop.contains("User Data")){
			System.out.println("It is not accepting 'Year of passout'  field as empty ");
			}
			else{
				System.out.println("It is accepting 'Year of passout' field as empty.");
			}
	
		System.out.println("completed");
		
		
		}
}

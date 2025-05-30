package Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P2 {
	public static void main(String [] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");	

		driver.findElement(By.xpath("//input[@type='submit']" )).click();

		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("CRM/SFA" )).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Create Lead" )).click();		

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_companyName\"]")).sendKeys("KannathasanECCND");	

		driver.findElement(By.xpath("//*[@id=\"createLeadForm_firstName\"]")).sendKeys("Kanna");	

		driver.findElement(By.xpath("//*[@id=\"createLeadForm_lastName\"]")).sendKeys("thasan");	

		driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryPhoneNumber\"]")).sendKeys("9078563412");	

		driver.findElement(By.className("smallSubmit" )).click();
		
		Thread.sleep(2000);		

		driver.findElement(By.linkText("Find Leads" )).click();	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/form/div/div[2]/div/div/div/div/div[4]/div[1]/input" )).sendKeys("KannathasanECND");	

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();	
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("KannathasanCN" )).click();	
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("Edit" )).click();	
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();	
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("ElangovanCN");	
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Update']")).click();	
		
		String a = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		String ActualName = a.split(" ")[0];
		
		String b = "ElangovanCN";
		
		if( ActualName.equals(b)) {

			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

	}}

package Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P1 {
	public static void main(String [] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");	

		driver.findElement(By.xpath("//input[@type='submit']" )).click();

		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("CRM/SFA" )).click();

		Thread.sleep(3000);

		String HomepageTitle = driver.getTitle();

		System.out.println(HomepageTitle);

		WebElement a = driver.findElement(By.tagName("b")); 

		String  ActualName = a.getText();

		String b = "DemoSalesManager";

		if( ActualName.equals(b)) {

			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		Thread.sleep(3000);

		driver.findElement(By.linkText("Create Lead" )).click();		

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"createLeadForm_companyName\"]")).sendKeys("KannathasanCN");	

		driver.findElement(By.xpath("//*[@id=\"createLeadForm_firstName\"]")).sendKeys("Kanna");	

		driver.findElement(By.xpath("//*[@id=\"createLeadForm_lastName\"]")).sendKeys("thasan");	

		driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryPhoneNumber\"]")).sendKeys("9078563412");	

		driver.findElement(By.className("smallSubmit" )).click();		

		String f = driver.findElement(By.id("viewLead_companyName_sp")).getText(); 

		String j = f.split(" ")[0];

		System.out.println("The name is "+j);

		String q = "KannathasanCN";

		if( j.equals(q)) {

			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

		System.out.println(j);	
	}}

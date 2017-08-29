import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {

		String name, email, message;
		public WebDriver driver = null;

		public StepDefinition() {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@Given("^I am on the QAWorks Site$")
		public void i_am_on_the_QAWorks_Site() {
			driver.get("http://QAWorks.com");
			String expTitle = "Home Page - QAWorks";
			String actTitle = driver.getTitle();

			Assert.assertEquals(expTitle, actTitle);
		}

		@Then("^I should be able to contact QAWorks with the following information$")
		public void i_should_be_able_to_contact_QAWorks_with_the_following_information(DataTable details) {

			//click on Contact
			driver.findElement(By.xpath(".//*[@id='menu']/li[1]/a")).click();
			
			List<List<String>> detail = details.raw();
			name = detail.get(0).get(1);
			email = detail.get(1).get(1);
			message = detail.get(2).get(1);

			driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_NameBox']")).sendKeys(name);
			driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_EmailBox']")).sendKeys(email);
			driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_MessageBox']")).sendKeys(message);

			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_MessageBox']")).click();
			
		}
	}



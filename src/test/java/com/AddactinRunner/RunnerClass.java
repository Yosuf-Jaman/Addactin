package com.AddactinRunner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//AddactinFeature",
glue="com.AddactinStepdefinition",
monochrome=true,
dryRun=false,
strict=true,
//tags="@smokeTest",
plugin={"html:Reports/Html_Report",
		"pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
})




public class RunnerClass {
	public static WebDriver driver;	
 
	
	@BeforeClass	
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	

}

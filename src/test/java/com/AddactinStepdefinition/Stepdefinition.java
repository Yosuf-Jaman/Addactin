package com.AddactinStepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AddactinRunner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	public static WebDriver driver=RunnerClass.driver;
	

	@Given("^user Launch The Adactin Applications$")
	public void user_Launch_The_Adactin_Applications() throws Throwable {
		driver.get("https://adactinhotelapp.com/index.php");
	   
	}

	@When("^user Enter The Username In Username Fields$")
	public void user_Enter_The_Username_In_Username_Fields() throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Jivita04");
	}

	@When("^user Enter the Password In Password Fields$")
	public void user_Enter_the_Password_In_Password_Fields() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");  
	}

	@Then("^User Click the Login Button sand It Navigates To Search Hotel Pages$")
	public void user_Click_the_Login_Button_sand_It_Navigates_To_Search_Hotel_Pages() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}


//Search Hotel
	
	@When("^User search the location$")
	public void user_search_the_location() throws Throwable {
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Thread.sleep(2000);
		Select l=new Select(location);
		l.selectByIndex(2);
	   
	}

	@When("^User Search The Hotels$")
	public void user_Search_The_Hotels() throws Throwable {
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Thread.sleep(2000);
		Select h=new Select(hotels);
		h.selectByIndex(4);
	   
	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		WebElement Roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Thread.sleep(2000);
		Select rt=new Select(Roomtype);
		rt.selectByIndex(4);
	   
	}

	@When("^User Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {

		WebElement No_Room= driver.findElement(By.xpath("//select[@id='room_nos']"));
		Thread.sleep(2000);
		Select nr=new Select(No_Room);
		nr.selectByIndex(5);
	 
	}

	@When("^User Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		
	   
	}

	@When("^User Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		WebElement adult_Room= driver.findElement(By.xpath("//select[@id='adult_room']"));
		Thread.sleep(2000);
		Select ar=new Select(adult_Room);
		ar.selectByIndex(4);
	   
	}

	@When("^User Select The Cheildren Per Room$")
	public void user_Select_The_Cheildren_Per_Room() throws Throwable {
		WebElement children= driver.findElement(By.xpath("//select[@id='child_room']"));
		Thread.sleep(2000);
		Select cr=new Select(children);
		cr.selectByIndex(4);
	    
	}

	@Then("^User Click The Search Button And It Navogates to Select Hotel$")
	public void user_Click_The_Search_Button_And_It_Navogates_to_Select_Hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
	}
	
	//select Hotel
	
	@When("^User Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	   
	}

	@Then("^User Click The Continue Button And It Navogates To The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navogates_To_The_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	//Book a hotel
	
	@When("^User Entered The First Name$")
	public void user_Entered_The_First_Name() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Mathew");
		Thread.sleep(1000);
	   
	}

	@When("^USer Entered The Last Name$")
	public void user_Entered_The_Last_Name() throws Throwable {
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Marcruz");
		Thread.sleep(1000); 
	}

	@When("^User Entered The Billing Class$")
	public void user_Entered_The_Billing_Class() throws Throwable {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Nungambakkam"+"\n"+" Chennai");
		Thread.sleep(1000);
	    
	}

	@When("^User Entered The Credit Card No$")
	public void user_Entered_The_Credit_Card_No() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("7382742949414531");
		Thread.sleep(1000);
	    
	}

	@When("^User Credit Card Type$")
	public void user_Credit_Card_Type() throws Throwable {
		WebElement card_type= driver.findElement(By.xpath("//select[@id='cc_type']"));
		Thread.sleep(2000);
		Select ct=new Select(card_type);
		ct.selectByIndex(1);
	}

	@When("^User Select The Expiry Month$")
	public void user_Select_The_Expiry_Month() throws Throwable {
		WebElement card_expiry_month= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Thread.sleep(2000);
		Select em=new Select(card_expiry_month);
		em.selectByIndex(12);
	}

	@When("^User Select The Year$")
	public void user_Select_The_Year() throws Throwable {
		WebElement card_expiry_year= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Thread.sleep(2000);
		Select ey=new Select(card_expiry_year);
		ey.selectByIndex(20);
	}

	@When("^User Select The CVV Number$")
	public void user_Select_The_CVV_Number() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("872");

	}

	@Then("^User Select The Book Now Button Booking Confirmation$")
	public void user_Select_The_Book_Now_Button_Booking_Confirmation() throws Throwable {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(12000);
	}
	
	//check details and logout
	
	@When("^User check the booking details in the Page$")
	public void user_check_the_booking_details_in_the_Page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,270)", "");
		
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
	   
	}

	@Then("^User Click the logout button And It Navigates To The Logout Page$")
	public void user_Click_the_logout_button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='logout']")).click(); 
	}
	
//Relogin Again
	
	@Then("^User Click \"([^\"]*)\" And It Navigates To The Login Page$")
	public void user_Click_And_It_Navigates_To_The_Login_Page(String arg1) throws Throwable {
	   driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")).click();
	}


}

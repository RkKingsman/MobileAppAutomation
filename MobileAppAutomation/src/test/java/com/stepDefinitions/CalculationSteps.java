package com.stepDefinitions;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.timeout.TimeoutException;
import pageObjects.BasePage;

public class CalculationSteps extends BasePage {

	@Given("User is on calculator home screen")
	public void user_is_on_calculator_home_screen() throws MalformedURLException {
		setUp();
	}

	@When("User clicks on five")
	public void user_clicks_on_five() {
		waitForElementToBeClickable(By.xpath("//*[@text='5']"));
		driver.findElement(By.xpath("//*[@text='5']")).click();
	}

	@When("User clicks on plus")
	public void user_clicks_on_plus() {
		WebElement plus = driver.findElement(By.xpath("//*[@text='+']"));
		plus.click();
	}

	@When("User clicks on eight")
	public void user_clicks_on_eight() {
		WebElement eight = driver.findElement(By.xpath("//*[@text='8']"));
		eight.click();
	}

	@When("User clicks on equals")
	public void user_clicks_on_equals() {
		WebElement equals = driver.findElement(By.xpath("//*[@text='=']"));
		equals.click();
	}

	@Then("User should see result message")
	public void user_should_see_result_message() throws InterruptedException {
		waitForElementToBeClickable(By.xpath("//*[@text='=13']"));
		WebElement result = driver.findElement(By.xpath("//*[@text='=13']"));
		boolean displayed = result.isDisplayed();
		if (displayed) {
			System.out.println("The result is 13");
		} else {
			System.out.println("The result is not 13");
		}
		tearDown();
	}

	public void waitForElementToBeClickable(By byValue) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15))
					.pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.elementToBeClickable(byValue));
		} catch (TimeoutException e) {
			System.out.println("Timed out waiting for that element");
		}
	}
}

PROJECT SETUP:

1. Setting up POM.xml with proper dependencies required to run the test
2. Creating Cucumber feature file in gherkin language to show the steps involved in the test
3. Create StepDefinition package and add a CalculationSteps class (empty)
4. Create Test Runner class to map the feature file , to gule the step definition package and also plugins to generate cucumber reports all these from Cucumber options.
5. Craate BasePage to have all the desired capabilities and commonly used methods
6. From TestRunner Run as JUnit -> Whch generates snippets on console. Copy and paste on CalculationSteps class
7. Get the locators using Appium instepctor by launching the app on emulator
8. Find the elements for all the steps to function
9. Fluent wait method is used to wait for the elemet to be visible.
10. Run the test from TestRunner class by Run as Test NG or JUnit or from Terminal cd /MobileAppAutomation> mvn clean install.

Note:
Latest Java version 22 was downgrated to JAVA 1.8 inorder to use Fluent wait. Preferences> java> Complier> java1.8
Dependencies versions was modified accordingly to solve Jsonconversion error and rotatable errors.


APPIUM SERVER:
Install appium server and keep it running on backround.

Note:
Appium Server URL : "http://127.0.0.1:4723/wd/hub"


ANDROID STUDIO:
Install Android studio to create and launch mobile device emulator with preferred android version from Device Manager.

Note:
Deivce: Pixel 6
Platform: Android
Andorid version: Lollipop V5.1.1


APPIUM INSPECTOR:
Install and set desired capabilities and start session to connect with the emulator device.
Use emulator to find all the locators and package name

Note:
Emulator Name : emulator-5554
APP : "C:\\Users\\rathnac\\....\\Calculator.apk"
APK: Calculator v1.1



DEPENDENCIES USED:
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>Test</groupId>
	<artifactId>MobileAutomationTestAssignment</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<dependencies>
		<dependency>
			<groupId>io.appium</groupId>
			<artifactId>java-client</artifactId>
			<version>8.2.1</version>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.6.0</version>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-api</artifactId>
			<version>4.6.0</version>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-remote-driver</artifactId>
			<version>4.6.0</version>
		</dependency>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.6.1</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.13.2</version>
		</dependency>
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>7.11.0</version>
		</dependency>
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>7.11.0</version>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-simple</artifactId>
			<version>1.7.36</version>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<!-- Maven Compiler Plugin -->
			<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>3.8.1</version>
			<configuration>
			<source>11</source>
			<target>11</target>
			</configuration>
			</plugin>
		</plugins>
	</build>
</project>


STEPS TO RUN THE TEST:

Scenario: User performs summing operation
    Given User is on calculator home screen
    When User clicks on five
    When User clicks on plus
    When User clicks on eight
    When User clicks on equals
    Then User should see result message

1. From TestRunner Class > Run as > Jnuit. or from Terminal cd .../MobileAppAutomation> mvn clean install
2. Excecution Order @Given > @When > @Then - driver.quit


REPORTS:
Reports will be generated on target folder as Cucumber.html.
Console and Terminal provides immediate process and results of the current test.





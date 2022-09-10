package sampleTest1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class SampleTest1 {
public void loginTest() throws IOException {
	WebDriverManager.chromedriver().setup();

	WebDriver wd = new ChromeDriver();
	wd.get("https://www.google.com/");
	wd.manage().window().maximize();
	File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File( "C:\\SeleniumWorkspace\\GitTest\\screenshot\\google.png"));
}
}

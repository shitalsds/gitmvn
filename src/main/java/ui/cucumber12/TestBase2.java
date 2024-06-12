package ui.cucumber12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase2 {
	public static Properties prop;
	public WebDriver driver;
	public WebDriver launchDriver() throws IOException {
		File f=new File(System.getProperty("user.dir")+"//src//test//resources//config.properties");
		FileInputStream fs=new FileInputStream(f);
		prop=new Properties();
		prop.load(fs);
		
		String browserName=(String) prop.get("browser");
		if(driver==null) {
			if(browserName.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			} else if(browserName.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			} else if(browserName.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			} 
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
		return driver;
	}
}



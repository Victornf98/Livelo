package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@teste",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)
      public class Executa extends Driver {
	  public static void abrirNavegador(boolean headless) {
			String url = "https://www.livelo.com.br/";
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			if(!headless) {
			chromeOptions.addArguments("--headless");
			}
			chromeOptions.addArguments("star-maximized");
			driver = new ChromeDriver(chromeOptions);
			driver.get(url);
			driver.manage().window().maximize();
		}
		}



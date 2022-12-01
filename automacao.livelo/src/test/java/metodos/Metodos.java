package metodos;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver.Driver;

public class Metodos extends Driver{
	
	
	public void fecharNavegador() {
		driver.quit();
	}
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	public void pausa(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}
	public void scroll() {
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,280)");
	}
	public void currentUrl (String urlDesejada) {
		assertEquals(urlDesejada, driver.getCurrentUrl());	
	}
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println("O texto capturado " + textoCapturado);
		assertEquals(textoEsperado, textoCapturado);
	}
	public void evidenciarTeste(String nomeEvidencia) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}
	public void submit (By elemento) {
		driver.findElement(elemento).submit();		
	}
	public void validarPopUp (By elemento, int qtdClicks) {
		WebElement popUp = driver.findElement(elemento);
		do {
			clicar(elemento);
			qtdClicks --;
	   }while (popUp.isDisplayed()&& qtdClicks > 0);		
	   }
	public void moverMouse (By elemento) {
		
        WebElement hoverable = driver.findElement(By.id("a-second-level-menu-1-2"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
	}
	}


package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By btnCookie = By.id("btn-authorizeCoookies");
	public By usarPontos = By.xpath("//li[@id='li-first-level-menu-1']");
	public By comViagens = By.xpath("//span[@id='span-second-level-menu-1-2']");
	public By alguelDeCarro = By.xpath("//span[@id='span-third-level-menu-1-2-3']");
	public By localRetirada = By.id("inpt-originVehicles");
	public By sãoPaulo = By.xpath("//ul[@id='ul-searchOriginVehiclesCities']/li[1]");
	public By data = By.xpath("//*[@id=\"inpt-goingVehicles\"]");
	public By dataIda = By.xpath("//a[@title='Select Sunday, Nov 20, 2022']");
	public By dataVolta = By.xpath("//a[@title='Select Wednesday, Nov 23, 2022']");
	public By horario = By.xpath("//input[@placeholder='Horários']");
	public By retirada = By.xpath("//select[@id='inpt-goingCarTime']");
	public By pesquisar = By.xpath("//button[@id='btn-searchVehicles']");
	public By btnDevolucao = By.xpath("//span[@id='span-labelLocationVehicles']");
	public By devolucaoLocalDif = By.xpath("//*[@id='ul-typeVehicles']/li[1]/span");
	public By localOrigem = By.id("inpt-originVehicles");
	public By confirmacaoOrigem = By.xpath("//*[@id=\"ul-searchOriginVehiclesCities\"]/li[1]");
	public By localDestino = By.id("inpt-destinyVehicles");
	public By confirmacaoDestino = By.xpath("//*[@id=\"ul-searchDestinyVehiclesCities\"]/li[1]");
	public By primeiraData = By.xpath("//a[@title='Select Saturday, Nov 19, 2022']");
	public By segundaData = By.xpath("//a[@title='Select Thursday, Dez 1, 2022']");
	public By localRetiradaPortoAlegre = By.xpath("//*[@id=\"ul-searchOriginVehiclesCities\"]/li[1]");
	public By btnResgatar = By.xpath("//*[@id='div-vehiclesItem-0']/div[2]/div/p[5]/button");
	public By aeroporto = By.xpath("//*[@id='mCSB_5_container']/div[1]/div/div/div/label[1]/div");
	public By aeroportoConfirm = By.xpath("//*[@id='mCSB_6_container']/div[1]/div/div/div/label[1]/div");
	public By btnContinuar = By.xpath("//*[@id=\"vehicles-locations\"]/div[2]/div/div[2]/button");
	public By nome = By.id("inpt-firstName");
	public By sobrenome = By.id("inpt-lastName");
	public By dataNascimento = By.id("inpt-birthday");
	public By telefone = By.id("inpt-phone");
	public By dataCnh = By.id("inpt-autorizationDate");
	public By requisito = By.xpath("//label[@for='inpt-readFifth']");
	public By btnReservaFinal = By.xpath("//*[@id=\"wi8900765-requirements-id\"]/div[3]/button/span");
	public By primeiroReq = By.xpath("//label[@for='inpt-readFirst']");
	public By segundoReq = By.xpath("//*[@id=\"wi8900765-requirements-id\"]/div[3]/div[2]/label/span/span[1]");
	public By terceiroReq = By.xpath("//label[@for='inpt-readThird']");
	public By quartoReq = By.xpath("//label[@for='inpt-readFourth']");
	public By quintoReq = By.xpath("//label[@for='inpt-readFifth']");
	public By sextoReq = By.xpath("//label[@for='inpt-readSixth']");
	public By setimoReq = By.xpath("//label[@for='inpt-readSeventh']");
	public By oitavoReq = By.xpath("//label[@for='inpt-readEigth']");
	
	
}

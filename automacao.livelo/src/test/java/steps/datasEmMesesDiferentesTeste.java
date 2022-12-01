package steps;
import java.io.IOException;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.pageAluguelDeCarro;

public class datasEmMesesDiferentesTeste {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	pageAluguelDeCarro page = new pageAluguelDeCarro();

	@Given("preencha local de retirada")
	public void preenchaLocalDeRetirada() {
		 page.preencherLocalRetirada(el.localRetirada, "Porto Alegre");
		 metodos.pausa(2000);
		 page.clicarLocalRetiradaPortoAlegre(el.localRetiradaPortoAlegre);
	}
	@Given("data com meses diferentes")
	public void dataComMesesDiferentes() {
		page.preenhcerDataInicioEFinal(el.data, el.primeiraData, el.segundaData);
	}
	@When("selecionar botao busca")
	public void selecionarBotaoBusca() {
		page.clicarLupa(el.pesquisar);
	}
	@Then("valida tela")
	public void validaTela() throws IOException {
		metodos.pausa(6000);
		metodos.currentUrl("https://www.livelo.com.br/carros?&pickupLocationZone=8002&devolutionLocationZone=8002&pickupIata=POA&pickupLocationType=CITY&pickupDate=2022-11-19T11:00:00&devolutionDate=2022-12-01T11:00:00&devolutionIata=POA&devolutionLocationType=CITY&partnersCode=CVC&itemsPerPage=&pageNumber=&sortBy=&features=&minPrice=&maxPrice=&category=&rentalCompanies=&originDescription=Porto%20Alegre%20-%20Rio%20Grande%20Do%20Sul,%20Brasil&originName=Porto%20Alegre%20-%20Rio%20Grande%20Do%20Sul,%20Brasil&destinationDescription=Porto%20Alegre%20-%20Rio%20Grande%20Do%20Sul,%20Brasil&destinationName=Porto%20Alegre%20-%20Rio%20Grande%20Do%20Sul,%20Brasil&pickupCity=Porto%20Alegre&pickupState=Rio%20Grande%20Do%20Sul&pickupCountry=Brasil");
		page.printScreen("Sucesso");
		metodos.fecharNavegador();
	}
}


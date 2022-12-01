package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.pageAluguelDeCarro;
import runner.Executa;

public class paginaAluguelCarrosTeste {
	Metodos metodos = new Metodos();
	pageAluguelDeCarro page = new pageAluguelDeCarro();
	Elementos el = new Elementos();

	@Given("esteja na página de aluguel de carros")
	public void estejaNaPáginaDeAluguelDeCarros() {
		Executa.abrirNavegador(true);
		metodos.pausa(5000);
		page.preencherCamposAteAluguelDeCarros(el.btnCookie, el.usarPontos, el.comViagens, el.alguelDeCarro);
		metodos.pausa(2000);
		metodos.scroll();
	}
	@Given("preencher o campo local de retirada")
	public void preencherOCampoLocalDeRetirada() {
	    page.preencherLocalRetirada(el.localRetirada, "São Paulo");
	    metodos.pausa(2000);
	    page.clicarLocalRetiradaSaoPaulo(el.sãoPaulo); 
	}
	@Given("data")
	public void data() {
		page.preencherData(el.data,el.dataIda,el.dataVolta); 
	}
	@Given ("horario")
	public void horario() {
		page.preencherHorario(el.horario);	
	}
	@When("clicar na lupa de busca")
	public void clicarNaLupaDeBusca() {
		page.clicarLupa(el.pesquisar);    
	}
	@Then("a pagina carrega com sucesso")
	public void aPaginaCarregaComSucesso() throws IOException {   
		metodos.pausa(6000);
		page.validarTexto("span", "Filtros");
		page.printScreen("Teste concluído");
		metodos.fecharNavegador();
	}
}


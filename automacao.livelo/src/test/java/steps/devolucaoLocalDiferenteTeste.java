package steps;
import java.io.IOException;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.pageAluguelDeCarro;

public class devolucaoLocalDiferenteTeste {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	pageAluguelDeCarro page = new pageAluguelDeCarro();

	@Given("marcar o campo devolucao em local diferente")
	public void marcarOCampoDevolucaoEmLocalDiferente() {
		metodos.scroll();
		page.devolucao(el.btnDevolucao, el.devolucaoLocalDif);
		metodos.clicar(el.devolucaoLocalDif);	
	}
	@Given("escrever os locais")
	public void escreverOsLocais() throws IOException {
		metodos.pausa(4000);
		page.printScreen("Teste bloqueado");
		metodos.fecharNavegador();
		metodos.moverMouse(el.localOrigem);
		page.origem(el.localOrigem, "São Paulo");
		metodos.clicar(el.confirmacaoOrigem);
	    page.destino(el.localDestino, "Porto Alegre");
	    metodos.clicar(el.confirmacaoDestino);    
	}
	@Given("marcar a data")
	public void marcarAData() {
		page.preencherData(el.data,el.primeiraData, el.segundaData); 
	}
	@When("apertar lupa")
	public void apertarLupa() {
		page.clicarLupa(el.pesquisar);   
	}
	@Then("a funcao tem sucesso")
	public void aFuncaoTemSucesso() throws IOException {
		metodos.pausa(5000);
		page.validarTexto("div", "Veja os resultados");
		//page.printScreen("Teste concluído");
		metodos.fecharNavegador();
	}
}

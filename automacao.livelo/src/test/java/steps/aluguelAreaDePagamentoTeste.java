package steps;
import java.io.IOException;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.pageAluguelDeCarro;

public class aluguelAreaDePagamentoTeste {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	pageAluguelDeCarro page = new pageAluguelDeCarro();
	
	@Given("selecionar o carro desejado")
	public void selecionarOCarroDesejado() {
		page.preencherLocalRetirada(el.localRetirada, "Porto Alegre");
		metodos.pausa(2000);
		page.clicarLocalRetiradaPortoAlegre(el.localRetiradaPortoAlegre);
	    page.preenhcerDataInicioEFinal(el.data, el.primeiraData, el.segundaData);
	    page.clicarLupa(el.pesquisar);
	    metodos.pausa(3000);
	    metodos.scroll();
	    page.btnResgatar(el.btnResgatar);
	    metodos.pausa(2000);
	    page.aeroporto(el.aeroporto, el.aeroportoConfirm);
	    page.btnContinuar(el.btnContinuar);
	    metodos.pausa(2000);
	}
	@When("preencher todos os dados do condutor")
	public void preencherTodosOsDadosDoCondutor() {
		page.dadosCondutor(el.nome, "Victor", el.sobrenome, "Ferreira", el.dataNascimento, "21/09/1998", el.telefone, "(11)959458256", el.dataCnh, "04/07/2018");
		metodos.scroll();	
	}
	@When("não marcar todos os requisitos")
	public void nãoMarcarTodosOsRequisitos() throws IOException {
    page.marcarRequisito(el.requisito);
    page.reservaFinal(el.btnReservaFinal);
    page.printScreen("Teste realizado com sucesso");
	}
	@Then("aparece mensagem de erro")
	public void apareceMensagemDeErro() {	
	}
}

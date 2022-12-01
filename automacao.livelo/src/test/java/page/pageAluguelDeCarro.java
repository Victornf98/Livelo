package page;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import driver.Driver;
import elementos.Elementos;
import metodos.Metodos;

public class pageAluguelDeCarro extends Driver {

		Metodos metodos = new Metodos();
		Elementos el = new Elementos();

		// Teste 1
		public void preencherCamposAteAluguelDeCarros(By elemento1, By elemento2, By elemento3, By elemento4) {
			metodos.clicar(el.btnCookie);
			metodos.clicar(el.usarPontos);
			metodos.moverMouse(el.comViagens);
			metodos.clicar(el.alguelDeCarro);
		}
		public void preencherLocalRetirada(By elemento, String Texto) {
		metodos.escrever(el.localRetirada, "Porto Alegre");
		}
		public void clicarLocalRetiradaSaoPaulo(By elemento) {
			metodos.clicar(el.sãoPaulo);
		}
		public void clicarLocalRetiradaPortoAlegre(By elemento) {
			metodos.clicar(el.localRetiradaPortoAlegre);	
		}
		public void preencherData(By elemento, By elemento2, By elemento3) {
			metodos.clicar(el.data);
			metodos.clicar(el.dataIda);
			metodos.clicar(el.dataVolta);
		}
		public void preencherHorario(By elemento) {
			metodos.clicar(el.horario);
		}
		public void clicarLupa(By elemento) {
			metodos.clicar(el.pesquisar);
		}
		public void validarTexto(String atributo, String texto) {
			String textoCapturado = driver.findElement(By.xpath("//" + atributo + "[text()='" + texto + "']")).getText();
			assertEquals(texto, textoCapturado);
		}
		public void printScreen(String nomeEvidencia) throws IOException {
			metodos.evidenciarTeste("Captura realizada com sucesso - Teste 2");
		}
		
		//Teste 2
		
		public void preenhcerDataInicioEFinal(By elemento1, By elemento2, By elemento3) {
			metodos.clicar(el.data);
			metodos.clicar(el.primeiraData);
			metodos.clicar(el.segundaData);
		}

		// Teste 3

		public void devolucao(By elemento1, By elemento2) {
			metodos.clicar(el.btnDevolucao);
			metodos.pausa(1500);
			metodos.clicar(el.devolucaoLocalDif);
			metodos.pausa(1500);
		}
		public void origem (By elemento, String texto) {
			metodos.escrever(el.localOrigem, "São Paulo");
			metodos.clicar(el.confirmacaoOrigem);	
		}
		public void destino (By elemento, String texto) {
			metodos.escrever(el.localDestino, "Porto Alegre");
			metodos.clicar(el.confirmacaoDestino);
		}
		
		//Teste 4
		public void btnResgatar (By elemento) {
			metodos.clicar(el.btnResgatar);	
		}
		public void aeroporto (By elemento1, By elemento2) {
			metodos.clicar(el.aeroporto);
			metodos.pausa(1500);
			metodos.clicar(el.aeroportoConfirm);
		}
		public void btnContinuar (By elemento) {
			metodos.clicar(el.btnContinuar);
			metodos.pausa(2000);
		}
		public void dadosCondutor(By elemento, String texto, By elemento2, String texto2, By elemento3, String texto3, By elemento4, String texto4, By elemento5, String texto5) {
			metodos.escrever(el.nome, "Victor");
			metodos.escrever(el.sobrenome, "");
			metodos.escrever(el.dataNascimento, "21/09/1998");
			metodos.escrever(el.telefone, "(11)959458256");
			metodos.escrever(el.dataCnh, "04/07/2018");
		}
		public void marcarRequisito (By elemento) {
			metodos.clicar(el.requisito);	
		}
		public void reservaFinal (By elemento) {
			metodos.clicar(el.btnReservaFinal);
		}	
	}

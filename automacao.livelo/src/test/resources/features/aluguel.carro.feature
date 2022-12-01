Feature: Usar pontos com viagens aluguel de carro
  Eu como usuario quero alugar um carro através do site da Livelo
  
  Background: Acessar aluguel de carros 
  Given esteja na página de aluguel de carros
  
  @teste
  Scenario: Acessar a pagina de Aluguel de carro
    And preencher o campo local de retirada
    And data
    And horario
    When clicar na lupa de busca
    Then a pagina carrega com sucesso
    
   @datas
  Scenario: Datas em meses diferentes
    And preencha local de retirada
    And data com meses diferentes
    When selecionar botao busca
    Then valida tela
    
  @troca
  Scenario: Devolução do carro em local diferente
    And marcar o campo devolucao em local diferente
    And escrever os locais
    And marcar a data
    When apertar lupa
    Then a funcao tem sucesso
    
  @pagamento
  Scenario: ALuguel ate a area de pagamento  
   And selecionar o carro desejado
   When preencher todos os dados do condutor
   But não marcar todos os requisitos
   Then aparece mensagem de erro
   
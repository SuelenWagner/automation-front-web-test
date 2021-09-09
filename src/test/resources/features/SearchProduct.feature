@Test
Feature: Pesquisar sobre o SuperGet no site da Getnet

     Background: Acesso a aplicação da Getnet
          Given que o usuario acessa o site da Getnet

     Scenario: Pesquisar sobre acesso a conta SuperGet com sucesso
          When pesquisa por "superget"
          And seleciona a opcao para verificar a conta SuperGet
          Then deve apresentar na tela a modal contendo "Como acesso a minha conta SuperGet?"

     Scenario: Pesquisar sobre um dado invalido
          When pesquiso por "inexistente"
          Then deve apresentar na tela a mensagem no resultado da pesquisa "Não há resultados para a busca"
# Prova Getnet

Este é um projeto/prova técnica de automação web front-end, utilizando o JDK 11, Maven, JUnit e Cucumber.

### Para rodar o projeto de automação é necessário:

- Abrir o projeto em uma IDE como Eclipse ou IntelliJ;
- Possuir JDK >= 8 instalado na máquina;
- Ao abrir o projeto, baixar as dependências do Maven;
- Projeto já possui a versão mais atualizada do chromedriver (versão 93.0.4577.63);
- Clonar o projeto utilizando HTTPS.

### Para executar os testes:
- Executar a classe "Runner" dentro do package "runner".

### Para gerar o relatório dos resultados dos testes:

1. Em um terminal, executar o comando para dar build no projeto: `mvn clean test`.
2. Após build com sucesso, executar os testes (com isto, será gerado o arquivo "cucumber.json" dentro da pasta gerada automaticamente "target" - exemplo do que ocorre no IntelliJ).
3. Com a execução finalizada, executar o comando: `mvn verify -DskipTests` (irá gerar uma pasta, dentro da pasta "target", chamada "cucumber-report-html", a qual conterá os arquivos html para visualização dos resultados - exemplo do que ocorre no IntelliJ).
4. Após isto, dar reload no projeto e verificar a pasta "cucumber-report-html" com seus arquivos gerados automaticamente dos resultados.
5. Ir na pasta do projeto e acessar esses arquivos html para visualizar no navegador o report dos testes.

### Possível erro que pode ocorrer na execução dos testes:
- Chromedriver desatualizado (seu browser pode ter sido atualizado automaticamente, porém a versão do chromedriver está a uma versão de diferença no projeto, sendo necessário atualizá-lo no package "drivers").
     - site para baixar a atualização: https://chromedriver.chromium.org/downloads

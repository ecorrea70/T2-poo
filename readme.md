# Trabalho 2 - Utilização de Streams e Lambdas em Java

## Objetivo

A partir de uma aplicação pré-existente que gerencia uma biblioteca, você deve
implementar funcionalidades específicas utilizando os conceitos de streams e expressões
lambda em Java vistos em aula.

## Descrição

O código-fonte fornecido contém as classes Livro, Usuario, Emprestimo e Biblioteca que
modelam um sistema para gerenciamento de biblioteca. Uma classe adicional Teste contém
uma função main para testar as funcionalidades do sistema. Sua tarefa é modificar o código
para adicionar as seguintes funcionalidades:

### Consultas:

- **C1: Consulta de Livros por Título:**

  - Entrada: uma string contendo parte do título.
  - Saída: uma lista de livros cujo título contém a string fornecida.

- **C2: Consulta de Livros Emprestados para um Usuário Específico:**
  - Entrada: matrícula do usuário.
  - Saída: lista de livros emprestados para o usuário.

### Ordenações:

- **O1: Ordenar os livros por ano de publicação utilizando a interface Comparable.**
- **O2: Ordenar os livros por título utilizando a interface Comparator.**
- **O3: Ordenar empréstimos por data de devolução (mais recente primeiro).**

### Relatórios:

- **R1: Relatório de Livros Mais Emprestados:**

  - Saída: uma lista de livros ordenada pela quantidade de vezes que foram emprestados, do mais emprestado para o menos emprestado.

- **R2: Relatório de Usuários que Mais Pegam Livros Emprestados:**

  - Saída: uma lista de usuários ordenada pela quantidade de empréstimos que fizeram, do usuário que mais pegou livros para o que menos pegou.

- **R3: Relatórios de Livros que Nunca Foram Emprestados:**

  - Saída: uma lista de livros que nunca foram emprestados.

- **R4: Média Geral de Empréstimos por Usuário:**

  - Saída: a média de livros emprestados por usuário.

- **R5: Relatório de Usuários com Mais de N Empréstimos:**
  - Entrada: um número N.
  - Saída: uma lista de usuários que fizeram mais do que N empréstimos.

Você deve criar um método na classe Biblioteca para implementar cada uma das funcionalidades (ordenação, consulta ou relatório) e adicionar código de teste para o método na classe Teste. A consulta C1 já foi implementada, siga o mesmo modelo para as demais funcionalidades.

## Entrega

O trabalho pode ser realizado de forma individual. A entrega deverá ser feita como um arquivo ".zip" contendo todos os arquivos fonte do projeto, bem como informações para sua compilação e execução. Atente para os prazos de entregas definidos no Moodle.

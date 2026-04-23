# Projeto de Lógica de Programação

Este projeto foi desenvolvido em aula com o objetivo de ensinar lógica de programação em Java por meio de exemplos simples e progressivos.

## Situação Atual do Projeto

Atualmente, o projeto contém exemplos introdutórios de programação e uma implementação inicial de calculadora, usados em sala para demonstrar conceitos básicos da linguagem e de construção de algoritmos.

Os principais pontos abordados neste momento são:
- saída de dados no console
- declaração e uso de variáveis
- operações matemáticas
- estruturas condicionais
- estruturas de repetição
- uso de listas
- criação e uso de classes e métodos

## Classes Disponíveis

O projeto possui, neste momento, as seguintes classes em src/main/java/com/logica:

- HelloWorld.java: exemplo inicial de execução e impressão no console.
- Variables.java: demonstra tipos de dados, operações, condicionais, laços de repetição, datas, conversões e listas.
- Calculadora.java: classe com métodos de soma e subtração.
- MainCalculadora.java: classe de execução para testar a calculadora.

## Estrutura do Projeto

```text
src/
├── main/
│   ├── java/
│   │   └── com/logica/
│   │       ├── Calculadora.java
│   │       ├── HelloWorld.java
│   │       ├── MainCalculadora.java
│   │       └── Variables.java
│   └── resources/
└── test/
    ├── java/
    └── resources/
```

## Tecnologias Utilizadas

- Java
- Maven
- JUnit 5 para apoio a testes

## Como Compilar

### Pré-requisitos

- Java instalado
- Maven instalado

### Compilação

```bash
mvn clean compile
```

## Como Executar

Após a compilação, as classes principais podem ser executadas pelo terminal.

### Executar o exemplo Hello World

```bash
java -cp target/classes com.logica.HelloWorld
```

### Executar o exemplo da calculadora

```bash
java -cp target/classes com.logica.MainCalculadora
```

## Finalidade Didática

Este repositório é um projeto educacional, utilizado em aula como apoio no ensino de lógica de programação. Ele pode continuar evoluindo com novos exemplos conforme o conteúdo da disciplina avançar.

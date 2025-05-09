# Exercícios - Java e JavaScript

Este repositório foi desenvolvido para realizar um desafio técnico para a vaga na empresa Target Sistemas. Contém uma série de exercícios que foram resolvidos utilizando as linguagens **Java** e **JavaScript**. O motivo dessas duas escolhas é que são as linguagens nas quais tenho mais domínio. Além disso, o JavaScript pode ser mais ágil para algumas tarefas, como a manipulação de arquivos, enquanto o Java se destaca em outras, como o trabalho com estruturas de dados. Ambas as linguagens também se aproximam de outras utilizadas na empresa, como o C#, nas quais possuo um bom conhecimento.

### Estrutura do Projeto

```
─ exercicios_java
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── org
│   │   │   │       └── example
│   │   │   │           ├── Main.java
│   │   │   │           └── util
│   │   │   │               ├── Fibonacci.java
│   │   │   │               ├── InvertText.java
│   │   │   │               └── SumAcc.java
│   │   │   └── resources
│   │   └── test
│   │       └── java
│   └── target
│       ├── classes
│       │   └── org
│       │       └── example
│       │           ├── Main.class
│       │           └── util
│       │               ├── Fibonacci.class
│       │               ├── InvertText.class
│       │               └── SumAcc.class
│       └── test-classes
├── exercicios_js
│   ├── exercicio3.js
│   ├── exercicio4.js
│   └── json
│       └── faturamento.json
└── README.md
```

### **Exercícios em Java**

O diretório `exercicios_java` contém os exercícios implementados em Java. 

Aqui estão as classes implementadas:

* **Fibonacci.java**: Calcula o n-ésimo número da sequência de Fibonacci usando recursão.

* **InvertText.java**: Inverte uma string de texto através de troca de caracteres.

* **SumAcc.java**: Calcula a soma dos números de 1 até um número `n`, utilizando um laço `while` para somar.


### **Exercícios em JavaScript**

No diretório `exercicios_js`, alguns exercícios foram resolvidos utilizando **JavaScript**

* **exercicio3.js**: Resolve um problema de faturamento, calculando o menor e maior valor de faturamento, além de determinar quantos dias tiveram faturamento superior à média.

* **exercicio4.js**: Calcula o percentual de faturamento de cada estado dentro do total de faturamento mensal.

### **Tática Utilizada**

A tática adotada para a resolução dos problemas foi a utilização de algoritmos simples e bem estabelecidos, onde:

* Em **Java**, utilizei a recursão para a sequência de Fibonacci, manipulação de strings com troca de caracteres para inverter um texto e laços `while` para somar números, abordagens eficientes para problemas com exigências claras.

* Em **JavaScript**, utilizei recursos como funções de agregação (`reduce`, `forEach`) para calcular totais e percentuais de faturamento, aproveitando a facilidade da linguagem para trabalhar com dados em formato JSON.

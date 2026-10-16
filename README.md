# polimorfismoAV1
Sistema de Cadastro com Herança e Polimorfismo
Objetivos da Atividade:
Construir a estrutura de um sistema de cadastro escolar em Java, aplicando os conceitos de Herança (extends), Reaproveitamento de Construtor (super), Polimorfismo (@Override) e Listas Polimórficas (ArrayList).

​ O Desafio: Sistema de Cadastro do Colégio
​Crie um projeto Java no VS Code contendo a seguinte hierarquia de classes:

​1. A Classe Mãe: Pessoa.java (A Superclasse)
​Atributos privados (private): nome (String) e cpf (String).
​Construtor: Recebe nome e cpf inicializando os atributos com o uso de this.
​Getters: Métodos de leitura para todos os atributos.
​Método Comum: Crie o método public void exibirDados(), que imprime no terminal:
Pessoa: [Nome] | CPF: [CPF]

​2. As Classes Filhas: Aluno.java e Professor.java (Subclasses)
​Aluno.java:
​Herda de Pessoa (extends Pessoa).
​Atributo privado próprio: matricula (String).
​Construtor que recebe (nome, cpf, matricula) utilizando o super(nome, cpf) para reaproveitar os dados da classe mãe.
​Polimorfismo: Sobrescreva o método @Override public void exibirDados() para imprimir:
ALUNO: [Nome] | CPF: [CPF] | Matrícula: [Matricula]
​Professor.java:
​Herda de Pessoa (extends Pessoa).
​Atributo privado próprio: disciplina (String).
​Construtor que recebe (nome, cpf, disciplina) utilizando o super(nome, cpf).
​Polimorfismo: Sobrescreva o método @Override public void exibirDados() para imprimir:
👨‍🏫 PROFESSOR: [Nome] | CPF: [CPF] | Disciplina: [Disciplina]

​3. A Execução Principal: Main.java
​Instancie um ArrayList<Pessoa> chamado listaDePessoas (uma lista mãe capaz de guardar qualquer tipo de pessoa).
​Use o Scanner para ler do teclado os dados de 1 Aluno e 1 Professor e adicione-os na mesma lista.
​Crie um laço de repetição (for) para percorrer o ArrayList e chame o método .exibirDados() de cada item para testar o Polimorfismo no terminal.


​📦 Regras de Entrega
​Como enviar: Anexe os arquivos (.java).
​Critério de Avaliação:
​[0,3 pt] Implementação correta da Herança (extends e super).
​[0,3 pt] Uso do Polimorfismo (@Override) nas duas classes filhas.
​[0,4 pt] Execução no Main.java com Scanner e laço no ArrayList<Pessoa>.

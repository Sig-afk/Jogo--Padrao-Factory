# Padrões de Projeto - Exercício: Factory Method (Jogo de Ação)

Este repositório contém a solução para a prática do padrão de projeto **Factory Method** aplicada ao sistema de criação de inimigos em um **Jogo de Ação em Localizações Brasileiras**, referente à Lista Avaliativa I da disciplina de Padrões de Projetos Orientados a Objetos (IFPE Campus Belo Jardim).

# 📌 Visão Geral da Solução

O objetivo desta atividade é permitir que diferentes fases do jogo (localizações brasileiras) gerem seus próprios inimigos específicos sem que o cliente (motor do jogo/jogador) precise conhecer as classes concretas desses inimigos.

* **Amazônia:** Gera o inimigo `MutantAnimal` (Animal Mutante).

* **Sertão:** Gera o inimigo `Cangaceiro`.

* **Expansão Futura (ex: Rio de Janeiro):** Pode ser adicionada facilmente criando novas classes sem alterar o código existente, respeitando o Princípio Aberto/Fechado (OCP).

## 📐 Diagrama de Classes UML

```
     +-----------------+
     | <<interface>>   |
     |      Enemy      |
     +-----------------+
     | + attack()      |
     +-----------------+
        ^           ^
        |           |
+---------------+ +---------------+
| MutantAnimal  | |  Cangaceiro   |
+---------------+ +---------------+

     +-----------------------+
     | <<abstract>>          |
     |       Location        |
     +-----------------------+
     | # createEnemy()*      |
     | + spawnEnemyAndAttack()|
     +-----------------------+
        ^                 ^
        |                 |
+-------------------+ +-------------------+
| AmazoniaLocation  | |   SertaoLocation  |
+-------------------+ +-------------------+


```

## 📜 Histórico de Commits e Evolução (Passo a Passo)

### Commit 1

* **Mensagem:** `Adiciona interface Enemy`

* **Descrição/Prompt:** Definição do contrato comum para todos os produtos (inimigos).

* **Ajustes e Justificativa:** Criada a interface `Enemy` com o método `attack()`. Desta forma, o cliente só precisa conhecer a abstração para ordenar o ataque.

### Commit 2

* **Mensagem:** `Implementa MutantAnimal (inimigo da Amazônia)`

* **Descrição/Prompt:** Criação da classe concreta do primeiro inimigo.

* **Ajustes e Justificativa:** Implementado `MutantAnimal` com comportamento de ataque personalizado para a região amazônica.

### Commit 3

* **Mensagem:** `Cria classe abstrata Location com método fábrica`

* **Descrição/Prompt:** Criação do Criador Abstrato contendo o Factory Method.

* **Ajustes e Justificativa:** Criada a classe `Location` contendo o método abstrato `protected abstract Enemy createEnemy()` e o método concreto `spawnEnemyAndAttack()`, que delega a criação para o método fábrica e executa o ataque sem saber a classe concreta do inimigo.

### Commit 4

* **Mensagem:** `Implementa AmazoniaLocation`

* **Descrição/Prompt:** Subclassificação de `Location` para a Amazônia.

* **Ajustes e Justificativa:** `AmazoniaLocation` sobrescreve `createEnemy()` retornando uma instância de `MutantAnimal`.

### Commit 5

* **Mensagem:** `Adiciona suporte ao Sertão (Cangaceiro + SertaoLocation)`

* **Descrição/Prompt:** Expansão do jogo para incluir a nova fase do Sertão.

* **Ajustes e Justificativa:** Foram criadas as classes `Cangaceiro` e `SertaoLocation` sem alterar nenhuma linha do código previamente escrito, comprovando a flexibilidade e extensibilidade do Factory Method.

### Commit 6

* **Mensagem:** `Adiciona simulação em Main`

* **Descrição/Prompt:** Implementação da classe principal para testar o sistema.

* **Ajustes e Justificativa:** Em `Main`, as instâncias foram atribuídas a referências do tipo `Location`, demonstrando que o código cliente interage exclusivamente com as abstrações.

## 🚀 Como Executar

1. Compile as classes do pacote `game`:

   ```
   javac game/*.java
   
   
   ```

2. Execute a simulação:

   ```
   java game.Main
   
   
   ```

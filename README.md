# Jogo da Velha 🕹️

Esse projeto é a implemetação do clássico jogo da velha em Java, com o objetivo de aprimorar e praticar a lógica em programação orientada a objetos, controle de fluxo, entrada de dados e muito mais em uma interface gráfica muito simples.

## Funcionalidades

- _Jogo para dois jogadores:_ Jogadores alternam entre X e O.
- _Verificação de vitória:_ Verifica automaticamente se um jogador venceu ou se houve empate.
- _Interface de usuário:_ Simples interface gráfica para interação com o jogo.
- _Controle de turnos:_ Alterna automaticamente entre os jogadores.

## Estrutura do projeto

Toda a estrutura está contida dentro da pasta `src` do projeto. Nela encontramos diferentes diretórios para a melhor divisão de camadas do jogo:

- `application`: pasta que mantém o controle da entrada e saída de dados, ou seja, a interface gráfica e rodadas do jogo.
- `boardGame`: responsável por mantém a lógica principal do jogo e do tabuleiro, com troca de turnos e validação de vitória ou empate.

## Como executar

Clone o repositório para sua máquina local:
```
git clone https://github.com/mclara831/jogo-da-velha-java.git
```

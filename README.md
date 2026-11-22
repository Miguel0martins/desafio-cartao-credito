# Desafio Cartão de Crédito

Programa em Java que simula um cartão de crédito: você informa o limite e vai registrando compras, e o programa diz se cada uma foi aprovada de acordo com o saldo disponível.

## O que o programa faz

- Pede o limite do cartão.
- Repete o registro de compras (descrição e valor) até o usuário decidir sair.
- Aprova a compra se o saldo for suficiente e desconta o valor do saldo; caso contrário, avisa "Saldo insuficiente!".
- No final, mostra as compras realizadas ordenadas por valor, do menor para o maior, e o saldo restante do cartão.

## Como rodar

1. Clone o repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Execute a classe `Main`.
4. Siga as instruções no console.

## Exemplo de uso

Limite: 1000. Compras: Tenis (300) e Meia (20). Resultado: Meia - 20.0, depois Tenis - 300.0, com saldo final de 680.0.

## Conceitos praticados

- Orientação a Objetos: classes `Compra` e `CartaoDeCredito`, encapsulamento e construtores.
- Coleções: `ArrayList` de compras.
- Ordenação: `Comparable` com `compareTo` e `Collections.sort`.
- Entrada de dados com `Scanner` e laço `while`.

## O que eu construí sozinho

- O método `lancarCompra`, que confere o saldo, desconta o valor e só então adiciona a compra à lista.
- O método `compareTo` da `Compra`, que ordena as compras pelo valor com `Double.compare`.
- Os testes de limite: compra aprovada, compra acima do saldo e lista ordenada.

## O que aprendi

- O `boolean` devolvido pelo `lancarCompra` é a resposta que a `Main` usa para decidir se a compra foi realizada ou recusada.
- O `add` fica dentro do `if`, para que compras recusadas nunca entrem na lista.
- O limite é fixo e o saldo diminui a cada compra aprovada, por isso são dois atributos separados.
- Bug pode aparecer em qualquer parte (no `boolean`, no `Comparable`, na `Main`). Revisar o código linha por linha, pensando onde pode quebrar, ajuda a achar o problema antes de rodar.

## Limitações e melhorias futuras

- Hoje, uma compra recusada encerra o programa. Uma melhoria é deixar o usuário continuar e tentar uma compra de valor menor.
- A descrição aceita só uma palavra, porque o `Scanner` usa `next()`.

## Créditos

O enunciado e a estrutura inicial do menu vêm do desafio da Alura. A lógica do cartão e a ordenação por valor foram desenvolvidas por mim durante o estudo.

## Autor

Miguel Martins Ferreira Barros - [GitHub](https://github.com/Miguel0martins)

Desafio proposto pela Alura.
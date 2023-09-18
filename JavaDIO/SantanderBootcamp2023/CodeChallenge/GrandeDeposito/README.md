# Desafio
Você foi contratado por um banco para desenvolver um programa que auxilie seus clientes a realizar depósitos em suas contas. O programa deve solicitar ao cliente o valor do depósito e verificar se o valor é válido. Se o valor for maior do que zero, o programa deve adicionar o valor ao saldo da conta. Caso contrário, o programa deve exibir uma mensagem de erro e solicitar um novo valor. O programa deve continuar solicitando valores de depósito até que seja digitado um valor válido.

### Entrada
O programa deve utilizar o Scanner para receber os valores de depósito digitados pelo cliente. Os valores podem ser decimais, representando valores em reais.

### Saída
O programa deve exibir uma mensagem de sucesso quando um valor de depósito válido for informado e o saldo da conta for atualizado. Caso um valor inválido seja digitado, o programa deve exibir uma mensagem de erro e solicitar um novo valor.

### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|Entrada      |	Saída                           |
| ------------| --------------------------------|
| 500.50      | Deposito realizado com sucesso! Saldo atual: R$ 500.50
|-100         | Valor invalido! Digite um valor maior que zero.
| 0           | Encerrando o programa...


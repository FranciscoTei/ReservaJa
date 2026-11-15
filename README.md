# ReservaJá

Sistema de Gestão de Mesas, Reservas e Pedidos para restaurantes desenvolvido em Java, aplicando os conceitos de Programação Orientada a Objetos (POO).

## 🔥 Introdução

O **ReservaJá** foi projetado para modernizar e organizar a rotina operacional de restaurantes, substituindo controles manuais em papel por uma gestão centralizada e em tempo real. 

### 🎯 Objetivos
* Eliminar filas na recepção e evitar choques de horários no agendamento de mesas.
* Permitir que a equipe do restaurante acompanhe o status do salão (mesas livres, reservadas ou ocupadas) de forma rápida e precisa.
* Integrar o controle de mesas ao lançamento de pedidos e ao fechamento automático de contas.

### 🚀 Funcionalidades Principais
* **Autenticação e Acesso:** Login diferenciado para **Clientes** e **Restaurantes** utilizando credenciais próprias.
* **Gestão de Clientes e Mesas:** Cadastro de clientes e monitoramento em tempo real da capacidade e disponibilidade de cada mesa do restaurante.
* **Agendamento de Reservas:** Marcação antecipada de data e hora vinculando cliente e mesa, com bloqueio automático para evitar duplicidade de horários.
* **Cardápio e Pedidos:** Gerenciamento de itens do menu por restaurante, lançamento de produtos na comanda da mesa ocupada e cálculo automático do valor total para fechamento da conta.

### 🧱 Arquitetura do Sistema
O projeto está estruturado em 6 classes principais:
* `Restaurante`: Gerencia os dados do estabelecimento, acesso via senha, suas mesas e os itens do cardápio.
* `Cliente`: Armazena os dados de identificação e senha de acesso dos clientes.
* `Mesa`: Controla a numeração, capacidade, vínculo com o restaurante e status atual no salão.
* `Reserva`: Associa um cliente a uma mesa em uma data e horário específicos.
* `Pedido`: Gerencia o consumo de uma mesa ocupada, agregando uma lista de itens do menu e calculando o total.
* `ItemMenu`: Representa os produtos oferecidos no cardápio de um restaurante.

📦 Sistema de Controle de Estoque (Java Puro)

Projeto desenvolvido exclusivamente para fins de estudo, com o objetivo de praticar os conceitos fundamentais da linguagem Java, programação orientada a objetos (POO) e operações de CRUD, utilizando apenas Java puro (console).

Este sistema segue a mesma ideia de um sistema bancário em Java, porém aplicado ao domínio de controle de estoque.

🎯 Objetivos do Projeto

Praticar Java puro sem frameworks

Aplicar conceitos de POO

Implementar operações de CRUD

Trabalhar com menus em console

Organizar o projeto em pacotes

Simular regras de negócio reais (entrada e saída de estoque)

⚙️ Funcionalidades

📌 Cadastrar produto

📋 Listar produtos cadastrados

➕ Entrada de produtos no estoque

➖ Saída de produtos do estoque

❌ Remover produto

🔎 Buscar produto por ID

Durante as movimentações de estoque, o sistema exibe mensagens claras para o usuário, como:

Saindo 20 Canetas
Quantidade atual em estoque: 80
🧱 Estrutura do Projeto
src
├── model
│   └── Produto.java
│
├── service
│   └── GerenciaProduto.java
│
├── util
│   └── menu
│       └── MenuEstoque.java
│
└── Main.java
📁 Descrição dos Pacotes

model → Classes de domínio (entidades)

service → Regras de negócio e gerenciamento (CRUD)

util.menu → Menu e interação com o usuário

Main → Classe principal, responsável apenas por iniciar o sistema

▶️ Como Executar o Projeto

Clone o repositório:

git clone <link-do-repositorio>

Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)

Execute a classe:

Main.java

Utilize o menu no terminal para interagir com o sistema

🛠️ Tecnologias Utilizadas

Java (Java SE)

Scanner para entrada de dados

Vetores para armazenamento em memória

📚 Conceitos Aplicados

Programação Orientada a Objetos (POO)

Encapsulamento

Separação de responsabilidades

CRUD em memória

Organização em pacotes

Menu interativo em console

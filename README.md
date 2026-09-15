## Fluxo Cliente e Servidor

**Cliente**: Postman ou navegador.
**Servidor**: A API Spring Boot.
**O que o cliente solicita**: Uma requisição HTTP do tipo `GET /cursos`.
**O que o servidor devolve**: Uma resposta HTTP contendo os dados solicitados.

**Fluxo completo**: O cliente envia uma request HTTP do tipo `GET /cursos` para o servidor. O servidor recebe essa chamada, executa o processamento necessário no back-end (consultando o banco de dados) e devolve uma response HTTP contendo os dados de volta ao cliente.

---

## Responsabilidades do Back-end

Ações executadas pelo back-end ao receber um cadastro de curso:
* Receber os dados enviados pelo cliente.
* Transformar os dados em um objeto Java.
* Verificar as regras do curso.
* Salvar o curso.
* Devolver uma resposta ao cliente.

---

## Contrato Inicial da API

A API oferece os seguintes endpoints para consumo externo:
* **GET /cursos** — Retorna a listagem de todos os cursos cadastrados.
* **POST /cursos** — Cadastra um novo curso no sistema.
* **GET /cursos/{id}** — Busca os dados de um curso específico pelo identificador.
* **PUT /cursos/{id}** — Atualiza as informações de um curso existente.
* **DELETE /cursos/{id}** — Remove um curso do banco de dados.

# API Cursos

API REST desenvolvida em Java com Spring Boot para o gerenciamento de cursos, parte da atividade acadêmica da faculdade.

## 🚀 Tecnologias Utilizadas
* **Java 21**
* **Spring Boot**
* **Maven**
* **Spring Web**

---

## 📋 Endpoints da API

Abaixo estão listadas as rotas disponíveis para consumo da API:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/cadastrar` | Cadastra um novo curso no sistema |
| **GET** | `/listar` | Retorna a lista com todos os cursos cadastrados |
| **GET** | `/buscarId/{id}` | Busca um curso específico informando o ID |
| **PUT** | `/atualizar/{id}` | Atualiza os dados de um curso existente pelo ID |
| **DELETE** | `/deletar/{id}` | Remove um curso do sistema pelo ID |

---

## 🛠️ Como Executar o Projeto

1. Clone este repositório em sua máquina.
2. Abra o projeto na sua IDE (recomendo o **IntelliJ IDEA**).
3. Aguarde o **Maven** carregar todas as dependências.
4. Execute a classe principal `ApiCursosApplication`.
5. A API estará rodando localmente na porta **8080** (`http://localhost:8080`).
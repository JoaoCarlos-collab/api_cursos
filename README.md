Fluxo Cliente e Servidor
Quando um cliente (como o Postman ou navegador) deseja consultar os dados, ele envia uma request HTTP do tipo GET /cursos para o servidor (a nossa API Spring Boot). O servidor recebe essa chamada, executa o processamento necessário no back-end (consultando o banco de dados) e devolve uma response HTTP contendo os dados solicitados de volta ao cliente.

Responsabilidades do Back-end
Ao receber a solicitação de cadastro de um curso, o back-end executa um fluxo estruturado de processamento e não funciona apenas como uma tela estática:

Recebe os dados brutos enviados pelo cliente.

Transforma os dados em um objeto Java utilitário (Entity).

Verifica as regras de negócio e validações do curso.

Salva o registro de forma definitiva no banco de dados.

Devolve uma response com o status de sucesso para o cliente.

Contrato Inicial da API
A API do projeto oferece os seguintes endpoints para consumo externo:

GET /cursos: Retorna a listagem de todos os cursos cadastrados.

POST /cursos: Cadastra um novo curso no sistema.

GET /cursos/{id}: Busca os dados de um curso específico pelo identificador.

PUT /cursos/{id}: Atualiza as informações de um curso existente.

DELETE /cursos/{id}: Remove um curso do banco de dados.
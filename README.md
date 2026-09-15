Fluxo Cliente e Servidor:<b><b>
Quando um cliente (como o Postman ou navegador) deseja consultar os dados, ele envia uma request HTTP do tipo GET /cursos para o servidor (a nossa API Spring Boot). O servidor recebe essa chamada, executa o processamento necessário no back-end (consultando o banco de dados) e devolve uma response HTTP contendo os dados solicitados de volta ao cliente.<b>

Responsabilidades do Back-end:<b><b>
Ao receber a solicitação de cadastro de um curso, o back-end executa um fluxo estruturado de processamento e não funciona apenas como uma tela estática:<b>

Recebe os dados brutos enviados pelo cliente.<b>
Transforma os dados em um objeto Java utilitário (Entity).<b>
Verifica as regras de negócio e validações do curso.<b>
Salva o registro de forma definitiva no banco de dados.<b>
Devolve uma response com o status de sucesso para o cliente.<b>

Contrato Inicial da API:<b><b>
A API do projeto oferece os seguintes endpoints para consumo externo<b>

GET /cursos: Retorna a listagem de todos os cursos cadastrados.<b>
POST /cursos: Cadastra um novo curso no sistema.<b>
GET /cursos/{id}: Busca os dados de um curso específico pelo identificador.<b>
PUT /cursos/{id}: Atualiza as informações de um curso existente.<b>
DELETE /cursos/{id}: Remove um curso do banco de dados.

# Curso: Spring Boot 2026 – REST APIs do Zero à AWS e GCP com Java e Docker

---

## Sessão 2 – Fundamentos Teóricos de REST

### Aula 1 – O que são Web Services?

Web Services são **serviços de software reutilizáveis** disponibilizados através do protocolo **HTTP**, permitindo a comunicação entre sistemas heterogêneos.

Podem ser consumidos por:

* Navegadores
* Ferramentas como Postman ou Insomnia
* Outros sistemas ou aplicações

Em essência, expõem funcionalidades ou dados pela web de forma padronizada.

---

### Aula 2 – SOAP x REST

#### SOAP

* Protocolo formal baseado em **XML**
* Estrutura rígida e fortemente padronizada
* Uso de contratos formais (**WSDL**)
* Suporte a múltiplos protocolos (HTTP, SMTP, TCP, etc.)
* Comum em sistemas legados e ambientes corporativos

#### REST

* Estilo arquitetural baseado em **HTTP**
* Uso correto dos métodos HTTP (GET, POST, PUT, DELETE)
* Recursos identificados por **URLs**
* Comunicação **stateless**
* Uso comum de **JSON**
* Mais leve e performático em comparação ao SOAP

---

### Aula 3 – O que é REST?

REST (*Representational State Transfer*) define um conjunto de **restrições arquiteturais** para sistemas distribuídos.

Principais restrições:

* Cliente-Servidor
* Stateless
* Cache
* Interface uniforme
* Sistema em camadas
* Suporte a múltiplos formatos de representação

---

### Aula 8 – Tipos de Parâmetros

* **Path Params**
* **Query Params**
* **Header Params**
* **Body Params**

---

### Aula 9 – Status Codes HTTP

* **2xx** – Sucesso (200, 201, 204)
* **4xx** – Erro do cliente (400, 401, 403, 404)
* **5xx** – Erro do servidor (500)

---

### Aula 10 – Verbos HTTP (CRUD)

* POST (Create)
* GET (Read)
* PUT (Update)
* DELETE (Delete)

---

### Aula 11 – Verbos HTTP menos conhecidos

PATCH, HEAD, TRACE, OPTIONS, CONNECT

---

### Aula 13 – HATEOAS

Princípio onde a API retorna **links** que guiam o cliente sobre próximas ações possíveis.

---

### Aula 14 – Swagger e OpenAPI

Ferramentas para **documentação automática de APIs**, facilitando testes e integração.

---

### Aula 16 – Versionamento de APIs REST

* Via Path (recomendado)
* Via Query Param
* Via Header

---

### Aula 18 – Boas Práticas em APIs REST

Paginação, filtros, cache, versionamento, documentação, segurança, testes e monitoramento.

---

## Sessão 4 – Primeiros Passos com Spring Boot

### Aula 25 – O que é Spring Boot

Framework que simplifica o desenvolvimento Java com:

* Configuração automática
* Servidor embutido
* Gerenciamento de dependências
* Integração com Maven e Gradle

---

### Aula 29 – Maven e pom.xml

Ferramenta de build e gerenciamento de dependências da plataforma Java.

---

### Aula 30 – Primeiro Endpoint da API

* **Model**: representa os dados
* **Controller**: recebe requisições e retorna respostas HTTP

---

## Sessão 5 – Entendendo Annotations e Tratamento de Exceções

### Aula 34 – Entendendo Annotations

* **@SpringBootApplication**
  Inicializa a aplicação Spring Boot e carrega todo o contexto.

* **@RestController**
  Define um controller REST que retorna dados no corpo da resposta HTTP.

* **@RequestMapping**
  Mapeia URLs para classes ou métodos.

* **@PathVariable**
  Captura valores da URL e os utiliza como parâmetros no método.

---

### Aula 37 – Tratamento de Exceções

* **@ControllerAdvice**
  Centraliza o tratamento global de exceções da aplicação.

* **@ExceptionHandler**
  Define métodos responsáveis por tratar exceções específicas.

* **@ResponseStatus**
  Define o status HTTP retornado em caso de erro ou execução de métodos.

---

## Sessão 6 – Uso dos Verbos HTTP e Testes com Postman

### Aula 46 – Injeção de Dependências

* **@Service**
  Classe onde fica a lógica de negócio da aplicação.

* **@Autowired**
  Permite que o Spring injete automaticamente dependências gerenciadas.

---

## Sessão 7 – Spring Data JPA e Integração da API com MySQL

### Aula 50 – Spring Data JPA

Framework que simplifica o acesso a dados em aplicações Java.

Principais conceitos:

* Repositórios JPA
* Query Methods (consultas baseadas em nome)
* **@Transactional** para gerenciamento de transações
* Suporte a paginação e ordenação

**Resumo**: reduz código repetitivo, promove boas práticas e facilita operações de banco de dados.

---

### Aula 52 – Implementando Entidade Person e Repositório

* **@Entity**
  Indica que a classe representa uma tabela do banco de dados.

* **@Table**
  Define detalhes da tabela.

* **@Id**
  Define a chave primária.

* **@GeneratedValue**
  Define a estratégia de geração do ID.

* **@Column**
  Configura propriedades da coluna.

* **@Repository**
  Indica a camada responsável pelo acesso a dados.

---

### Aula 53 – Refatorando Controller Person

* **@RequestMapping**
  Define o mapeamento base dos endpoints.

* **@GetMapping, @PostMapping, @PutMapping, @DeleteMapping**
  Especializações que tornam o código mais limpo, semântico e seguro.

---

## Sessão 8 – Trabalhando com Logs no Spring Boot

### Aula 57 – O que são logs e qual sua importância

Logs são **registros detalhados** do que acontece dentro da aplicação. São fundamentais para:

* Diagnóstico de erros
* Monitoramento do sistema
* Auditoria
* Manutenção e análise de comportamento da aplicação em produção

No Spring Boot, o uso correto de logs ajuda a identificar falhas rapidamente e entender o fluxo da aplicação.

#### Níveis de Log

* **TRACE**
  Nível mais detalhado. Registra praticamente tudo, incluindo detalhes internos do sistema. Pouco utilizado em produção.

* **DEBUG**
  Voltado para desenvolvimento. Mostra informações detalhadas do fluxo da aplicação para depuração.

* **INFO**
  Registra eventos importantes do funcionamento normal da aplicação.

* **WARN**
  Indica situações inesperadas ou potencialmente problemáticas, mas que não interrompem a execução.

* **ERROR**
  Indica falhas que impedem uma operação de ser concluída corretamente.

* **FATAL**
  Erro grave que pode causar a interrupção total da aplicação.

---


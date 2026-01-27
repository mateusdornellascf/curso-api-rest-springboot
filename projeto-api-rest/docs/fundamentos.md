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

## Sessão 9 – Padrão de Projeto DTO

### Aula 63 – Padrão DTO

**DTO (Data Transfer Object)** é um objeto simples utilizado exclusivamente para **transportar dados** entre camadas da aplicação ou entre sistemas.

Características principais:

* Não representa diretamente o banco de dados
* Não contém regras de negócio
* Estrutura simples, focada apenas nos dados necessários

Benefícios do uso de DTOs:

* Melhora a eficiência na troca de dados
* Aumenta a segurança (evita exposição indevida de entidades)
* Promove desacoplamento entre camadas
* Melhora a clareza e a manutenibilidade da API

---

### Aula 64 – Dozer Mapper

Ferramenta utilizada para **mapeamento automático de objetos** em aplicações Java, muito comum na conversão entre Entidades e DTOs.

O Dozer permite três abordagens de mapeamento:

* **Arquivos XML configuráveis**
  Permitem definir os mapeamentos de forma externa às classes.

* **Configuração programática**
  Oferece maior flexibilidade para ajustes dinâmicos em tempo de execução.

* **Annotations**
  Define o mapeamento diretamente nas classes de modelo.

#### Como funciona o mapeamento no Dozer

1. Recebe dois objetos (origem e destino)
2. Analisa as propriedades usando reflexão
3. Compara nomes e tipos dos atributos
4. Copia valores compatíveis automaticamente
5. Aplica regras customizadas, quando configuradas

---

## Sessão 10 – Versionamento de API

### O que é?

Versionamento de API é a prática de **gerenciar mudanças ao longo do tempo**, permitindo que diferentes versões da mesma API coexistam sem quebrar integrações já existentes.

Ele garante estabilidade para os consumidores da API, mesmo quando novas funcionalidades ou alterações estruturais são introduzidas.

---

### Como é utilizado?

Boa prática é criar **novas versões da API** sempre que houver mudanças incompatíveis, por exemplo:

* `/v1`
* `/v2`

Dessa forma:

* Contratos antigos continuam funcionando
* Novas regras podem ser implementadas sem impactar consumidores existentes
* Classes, endpoints ou estruturas de dados podem evoluir de forma controlada

O versionamento facilita a manutenção, a evolução da API e a compatibilidade entre diferentes clientes.

---
## Sessão 12 – Adicionando Suporte a Migrations com Flyway

### O que são Migrations?

Migrations são **scripts versionados de alteração do banco de dados** que descrevem, de forma incremental e controlada, a evolução do esquema do banco.

Elas permitem manter o banco sincronizado com a aplicação ao longo do tempo.

### Flyway

Framework de **versionamento e migração de banco de dados**, executa migrations automaticamente, controla quais scripts já foram aplicados, garantindo **ordem, integridade e consistência**.

### Estrutura de pastas padrão

```
resources/db/migration/
  V1__primeira_migration.sql
  V2__segunda_migration.sql
```

Cada script representa uma nova versão do banco de dados.

### Configuração básica no application.yml

```yaml
flyway:
  enabled: true
``` 

---

## Sessão 13 – Customização do JSON

A customização do JSON permite **controlar como os dados são serializados e expostos** nas respostas da API.

Essa configuração deve ser aplicada **nos DTOs**, e não nas entidades, para evitar acoplamento com a camada de persistência e exposição indevida de dados internos.


### Principais Annotations do Jackson

- **@JsonIgnore**  
  Oculta um campo no JSON retornado.  
  Usado para evitar a exposição de dados sensíveis, como senhas ou informações internas.

- **@JsonProperty**  
  Define explicitamente o nome do campo no JSON, independentemente do nome do atributo na classe.

- **@JsonInclude**  
  Controla quando um campo deve aparecer no JSON.  
  Exemplo comum: incluir apenas campos não nulos.

- **@JsonFormat**  
  Define o formato de datas, horas ou números no JSON, garantindo padronização nas respostas da API.



### Boas práticas

- Aplicar annotations de JSON apenas em **DTOs**
- Evitar customização de serialização diretamente nas entidades
- Padronizar formatos de data e hora em toda a API

---

## Sessão 13 – Content Negotiation

Content Negotiation é a capacidade do **cliente e do servidor negociarem o formato da representação dos dados** em uma requisição HTTP.

O recurso acessado é o mesmo; o que muda é o **formato dos dados retornados**, de acordo com o que o cliente solicita e o servidor suporta.

Os formatos mais utilizados em APIs REST são:
- **JSON**
- **XML**
- **YAML**

No Spring Boot, essa negociação geralmente é feita com base nos **headers HTTP**, especialmente o header `Accept`.

Boa prática:  
O uso de headers é a abordagem mais recomendada, pois segue corretamente o padrão HTTP e os princípios REST, tornando a API mais **flexível, padronizada e profissional**.

---

## Sessão 14 — HATEOAS

É um princípio do REST que define que as respostas da API devem conter **links** que indiquem as **próximas ações possíveis** para o cliente.

**Conceito-chave:**  
O servidor guia o cliente por meio de links (hipermídia), reduzindo o acoplamento e permitindo que o cliente descubra como navegar pela API.


## Mockito

Framework de **testes unitários** utilizado para **simular (mockar) instâncias de classes e o comportamento de métodos**, permitindo testar componentes de forma **isolada**, sem depender de banco de dados, APIs externas ou outras camadas da aplicação.

---
## Sessão 15 – Swagger

Swagger é um framework baseado na especificação **OpenAPI** que facilita a **definição, documentação e consumo de APIs REST**, mantendo a documentação sempre sincronizada com o código da aplicação.

Permite:
- Documentar endpoints, parâmetros, respostas e modelos (DTOs)
- Testar a API por meio de uma interface visual interativa
- Gerar código e templates automaticamente
- Padronizar contratos de API entre times e sistemas

### Principais ferramentas do Swagger

- **Swagger UI**  
  Interface visual interativa para explorar e testar os endpoints da API.

- **Swagger Editor**  
  Ferramenta para criação e validação da especificação OpenAPI.

- **Swagger Codegen**  
  Gera código automaticamente a partir da definição da API.

### Swagger no Spring Boot

No Spring Boot, o Swagger é utilizado por meio de bibliotecas baseadas em OpenAPI, sendo a mais moderna e recomendada:

- **springdoc-openapi**

Essa biblioteca faz a leitura automática das annotations do Spring e gera a documentação da API de forma dinâmica.

### Principais annotations do Swagger / OpenAPI:

- **@Operation**  
  Define a descrição e o propósito de um endpoint.

- **@ApiResponses / @ApiResponse**  
  Documenta os possíveis códigos de resposta HTTP.

- **@Parameter**  
  Documenta parâmetros de entrada da API.

- **@Schema**  
  Documenta DTOs e seus campos.

### Boas práticas:

- Documentar todos os endpoints importantes
- Usar descrições claras e objetivas
- Documentar DTOs, não entidades
- Padronizar nomes, exemplos e códigos HTTP
- Documentar erros e exceções
- Integrar com mecanismos de segurança (JWT, OAuth2)
- Não expor dados sensíveis
- Manter a documentação sempre sincronizada com o código

---
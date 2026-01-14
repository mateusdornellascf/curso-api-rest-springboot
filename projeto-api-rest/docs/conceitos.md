# Curso: Spring Boot 2026 – REST APIs do Zero à AWS e GCP com Java e Docker

## Sessão 2 – Fundamentos Teóricos de REST

### Aula 1 – O que são Web Services?
Web Services são **serviços de software reutilizáveis** disponibilizados através do protocolo **HTTP**, que permitem a comunicação entre sistemas heterogêneos.

Eles podem ser consumidos por:
- Navegadores
- Ferramentas como Postman ou Insomnia
- Outros sistemas ou aplicações

Em essência, são serviços que expõem funcionalidades ou dados pela web de forma padronizada.

---

### Aula 2 – SOAP x REST

#### SOAP
- Protocolo formal de troca de mensagens baseado em **XML**
- Estrutura rígida e fortemente padronizada
- Uso de contratos formais (**WSDL**)
- Pode utilizar diferentes protocolos (HTTP, SMTP, TCP, etc.)
- Amplamente utilizado em sistemas legados e ambientes corporativos (bancos, governo)

#### REST
- Estilo arquitetural baseado em **HTTP**
- Uso correto dos métodos HTTP:
  - GET → buscar
  - POST → criar
  - PUT → atualizar
  - DELETE → remover
- Recursos identificados por **URLs**
- Comunicação **stateless**
- Uso comum de **JSON**
- Mais leve, eficiente e com melhor desempenho quando comparado ao SOAP

#### Conceitos relacionados
- **API**: Interface que define como um software pode ser acessado
- **Web Service**: API acessível pela web, geralmente via HTTP
- **REST**: Estilo arquitetural para criação de Web Services escaláveis
- **SOAP**: Protocolo formal para Web Services baseado em XML

---

### Aula 3 – O que é REST?
REST (*Representational State Transfer*) é um conjunto de **restrições arquiteturais** para o desenvolvimento de sistemas distribuídos.

Principais restrições:
- **Cliente-Servidor**: separação clara de responsabilidades
- **Stateless**: o servidor não mantém estado do cliente
- **Cache**: respostas podem ser cacheáveis
- **Interface uniforme**:
  - Identificação de recursos via URI
  - Manipulação por representações
  - Mensagens auto descritivas
- **Sistema em camadas**
- **Suporte a múltiplos formatos**: JSON, XML, CSV, TXT, HTML, PDF, binário, entre outros

#### Vantagens
- Arquitetura leve
- Melhor desempenho
- Desenvolvimento mais rápido e simples

---

### Aula 8 – Tipos de Parâmetros
- **Path Params**: obrigatórios, identificam recursos específicos na URL
- **Query Params**: opcionais, usados para filtros, ordenação e paginação
- **Header Params**: enviados no cabeçalho HTTP (metadados, autenticação, cache, idioma)
- **Body Params**: envio de dados para criação ou atualização de recursos

---

### Aula 9 – Status Codes HTTP

- **1xx** – Informacional
- **2xx** – Sucesso
  - 200 OK
  - 201 Created
  - 204 No Content
- **3xx** – Redirecionamento
  - 301 Moved Permanently
- **4xx** – Erro do cliente
  - 400 Bad Request
  - 401 Unauthorized
  - 403 Forbidden
  - 404 Not Found
- **5xx** – Erro do servidor
  - 500 Internal Server Error

---

### Aula 10 – Verbos HTTP (CRUD)
- **POST (Create)**: cria recursos (200 ou 201)
- **GET (Read)**: consulta recursos (200, 400 ou 404)
- **PUT (Update)**: atualiza recursos (200 ou 204)
- **DELETE (Delete)**: remove recursos (204 recomendado)

---

### Aula 11 – Verbos HTTP menos conhecidos
- **PATCH**: atualizações parciais
- **HEAD**: semelhante ao GET, sem corpo da resposta
- **TRACE**: depuração de requisições
- **OPTIONS**: verifica operações suportadas
- **CONNECT**: estabelece túneis HTTP

---

### Aula 13 – HATEOAS
Princípio onde a API retorna, além dos dados, **links** que orientam o cliente sobre próximas ações possíveis.

---

### Aula 14 – Swagger e OpenAPI
Ferramentas utilizadas para **documentação automática de APIs**, facilitando desenvolvimento, testes e integração.

---

### Aula 16 – Versionamento de APIs REST
- Via Path: `/v1/recurso` (**mais recomendada**)
- Via Query Param: `?version=1` (mais comum em desenvolvimento)
- Via Header: `Accept` ou `api-version` (menos indicada)

---

### Aula 18 – Boas Práticas em APIs REST
Paginação, filtros, definição clara de recursos, tolerância a falhas, cache, timeouts, documentação, uso de SSL, versionamento, testes, monitoramento e limitação de requisições.

---

## Sessão 4 – Primeiros Passos com Spring Boot

### Aula 25 – O que é Spring Boot
O Spring Framework simplificou o desenvolvimento Java, porém exigia muitas configurações. O **Spring Boot** surgiu para tornar esse processo ainda mais rápido e produtivo.

#### Características
- Aplicações autossuficientes
- Servidor embutido
- Configuração automática
- Gerenciamento de dependências
- Integração com Maven e Gradle

#### Conceitos importantes
- **Starters**: pacotes prontos de dependências
- **Actuator**: monitoramento e gerenciamento da aplicação

---

### Aula 29 – Maven e pom.xml

#### Maven
Ferramenta de gerenciamento de dependências e build mais popular da plataforma Java. Automatiza o download e a organização de bibliotecas e plugins.

Também permite a criação de **Maven Archetypes**, que são estruturas base de projetos.

#### pom.xml
Arquivo de configuração que descreve:
- Dependências
- Plugins
- Repositórios
- Metadados do projeto

---

### Aula 30 – Primeiro Endpoint da API

Conceitos fundamentais:
- **Model**: representa dados e regras de negócio
- **Controller**: recebe requisições HTTP e retorna respostas

---



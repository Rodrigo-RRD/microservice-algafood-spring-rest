# API REST com Spring Boot: Microserviço de Informações Acessadas Apartir de Autenticação Baseada em Tokens

## Descrição

Esta API é um microserviço desenvolvido com **Spring Boot 3** e **Java 17**, que consome informações do banco de dados de forma segura utilizando tokens de autenticação provenientes de uma API de autorização externa (OAuth 2.0). O sistema é projetado para ser modular, escalável e integrado com tecnologias modernas como **Redis**, **AWS S3**, e **JasperReports**.

## Tecnologias Utilizadas

### Frameworks e Bibliotecas
- **Spring Boot**:
  - `spring-boot-starter-web`: Para construção da API REST.
  - `spring-boot-starter-security`: Para segurança e autenticação.
  - `spring-boot-starter-data-jpa`: Para persistência de dados.
  - `spring-boot-starter-validation`: Para validações nos DTOs.
  - `spring-boot-starter-mail`: Para envio de emails.
  - `spring-boot-starter-thymeleaf`: Para templates de email.
  - `spring-boot-starter-data-redis`: Para cache e gerenciamento de sessões.

- **Spring Security OAuth**:
  - `spring-security-oauth2-resource-server`: Para autenticação baseada em tokens.
  - `spring-security-oauth2-authorization-server`: Para integração com servidores de autenticação.

- **Flyway**: Para versionamento do banco de dados.

- **ModelMapper**: Para mapeamento entre entidades e DTOs.

- **JasperReports**: Para geração de relatórios.

- **SpringDoc**: Para documentação de APIs usando OpenAPI/Swagger.

### Banco de Dados
- **MySQL**: Como banco relacional principal.

### Cloud e Integrações
- **AWS S3 SDK**: Para armazenamento de arquivos.

### Logging
- **Logback com Loggly**: Para logs centralizados.

### Testes
- **RestAssured**: Para testes de integração das APIs.
- `spring-boot-starter-test`: Para testes unitários.

### Build e Containerização
- **Dockerfile Maven Plugin**: Para containerização e deploy.

## Requisitos

- **Java 17** (Certifique-se de ter configurado corretamente o JDK).
- **Maven** (Gerenciamento de dependências e build).
- **MySQL** (Banco de dados configurado e acessível).
- **Redis** (Cache e sessões, opcional).

## Estrutura do Projeto

- **Configurações**: Arquivos de configuração do Spring Boot.
- **Controladores**: Endpoints expostos para consumo de dados.
- **Serviços**: Contém a lógica de negócio.
- **Repositórios**: Interface para comunicação com o banco de dados.
- **Segurança**: Configurações para validação de tokens e autenticação.

## Documentação da API

A documentação Swagger está disponível em:  
`http://<SEU-SERVIDOR>:<PORTA>/swagger-ui.html`

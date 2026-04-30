# 🧠 Psicologia API

## 📌 Sobre o projeto

A **Psicologia API** é uma aplicação backend desenvolvida em **Java com Spring Boot**, com o objetivo de gerenciar um sistema de atendimentos psicológicos.

A API permite o cadastro e gerenciamento de:

* Pacientes
* Psicólogos
* Consultas

O sistema simula um ambiente real de clínica psicológica, facilitando o controle de atendimentos e usuários.

---

## Diagrama do Sistema


<img width="1285" height="469" alt="Captura de tela 2026-04-29 211531" src="https://github.com/user-attachments/assets/15436e3f-79b2-4882-8d22-a9e89803d7e9" />






## Banco de Dados

<img width="928" height="268" alt="Captura de tela 2026-04-29 212941" src="https://github.com/user-attachments/assets/45f2065b-be7f-48a6-a67a-2efa2af24e0c" />





## 🛠️ Tecnologias utilizadas

* ☕ Java
* 🌱 Spring Boot
* 🗄️ Spring Data JPA
* 🐬 MySQL
* 🔧 Maven

---

## ⚙️ Funcionalidades

* ✔️ Cadastro de pacientes
* ✔️ Cadastro de psicólogos
* ✔️ Agendamento de consultas
* ✔️ Listagem de dados
* ✔️ Tratamento de exceções
* ✔️ Estrutura em camadas (Controller, Entity, Config, Exception)

---

## 🏗️ Estrutura do projeto

```
src/main/java/com/br
│── controller        # Endpoints da API
│── entity            # Entidades do sistema
│── config            # Configurações
│── exception         # Tratamento de erros
│── PsicologiaApiApplication.java
```

---

## 🚀 Como executar o projeto

### 🔧 Pré-requisitos

Antes de começar, você precisa ter instalado:

* Java 17+
* Maven
* MySQL

---

### ▶️ Passos

```bash
# Clone o repositório
git clone https://github.com/robertprogramador7/ProjetoFinal.git

# Entre na pasta
cd ProjetoFinal

# Execute o projeto
./mvnw spring-boot:run
```

---

## ⚙️ Configuração do banco de dados

1. Crie um banco no MySQL (ex: `psicologia_db`)
2. Configure o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/psicologia_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📡 Endpoints principais

### 👤 Pacientes

* `GET /pacientes`
* `POST /pacientes`

### 🧑‍⚕️ Psicólogos

* `GET /psicologos`
* `POST /psicologos`

### 📅 Consultas

* `GET /consultas`
* `POST /consultas`

---

## ❗ Tratamento de erros

A aplicação possui tratamento global de exceções, incluindo:

* Recurso não encontrado
* Erros de autenticação
* Regras de negócio

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com foco em:

* Praticar desenvolvimento backend com Spring Boot
* Estruturar uma API REST completa
* Aplicar boas práticas de organização de código
* Trabalhar com banco de dados relacional

---

## 📈 Melhorias futuras

* 🔄 Implementar autenticação com JWT
* 🔄 Criar interface frontend
* 🔄 Adicionar testes automatizados
* 🔄 Melhorar validações

---

## 👨‍💻 Autor

Desenvolvido por Robert, Amara, Iago e Estevão 

* GitHub: https://github.com/robertprogramador7

---

## 📄 Licença

Este projeto está sob a licença MIT.

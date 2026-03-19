# 🎬 API Catálogo de Filmes

API REST desenvolvida em **Java + Spring Boot** para listagem de filmes, consumindo dados de uma API externa e aplicando boas práticas de arquitetura.

---

## 📌 Objetivo

Este projeto foi desenvolvido com foco em:

* Separação de responsabilidades
* Aplicação de princípios **SOLID**
* Organização em camadas
* Consumo de API externa
* Padronização de resposta (DTO)

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

```
Controller → Service → Client → Mapper → Model → DTO
```

### 📂 Estrutura de pacotes

```
br.com.clrf
│
├── controller
├── service
├── client
├── mapper
├── model
└── dto
```

---

## 🔄 Fluxo da aplicação

1. O **Controller** recebe a requisição HTTP
2. O **Service** executa o caso de uso
3. O **Client** consome a API externa
4. O **Mapper** transforma o JSON em objeto
5. O **DTO** define o formato da resposta

---

## 🚀 Tecnologias utilizadas

* Java 17
* Spring Boot
* Maven
* Jackson (JSON)
* Lombok
* SonarQube (análise de código)

---

## ▶️ Como executar o projeto

### Pré-requisitos

* Java 17+
* Maven

### Executar

```bash
mvn clean install
mvn spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 🔍 Endpoint

### Buscar filmes mais bem avaliados

```http
GET /filmes/top
```

### 📥 Resposta

```json
{
  "data": [
    {
      "title": "The Shawshank Redemption",
      "image": "url",
      "rating": 9.2
    }
  ]
}
```

---

## 🌐 Integração externa

A API consome dados de:

```
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json
```

---

## 📊 Qualidade de código

O projeto utiliza **SonarQube** para análise de qualidade:

* Code smells
* Boas práticas
* Manutenibilidade

---

## 💡 Decisões técnicas

* Uso de DTO para padronizar resposta da API
* Separação de camadas para evitar alto acoplamento
* Client dedicado para integração externa
* Mapper para conversão de dados

---

## 📎 Observação

Este projeto foi desenvolvido com fins de estudo e demonstração de boas práticas em APIs REST.

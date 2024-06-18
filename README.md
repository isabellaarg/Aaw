# JWT Rest API

## Visão Geral
Este é um projeto Spring Boot para uma API REST JWT (JSON Web Token). A aplicação permite o registro de usuários, login e fornece endpoints protegidos para usuários autenticados e administradores. Utiliza o MongoDB como banco de dados e JWT para autenticação e autorização.
## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Security
- Spring Data MongoDB
- JWT (JSON Web Token)
- Maven

## Pré-requisitos
- JDK 17 ou superior
- Maven
- MongoDB

## Configuração

### Configuração do MongoDB

1. Certifique-se de que o MongoDB está instalado e em execução.
2. Configure o arquivo `application.properties`

## Endpoints
A aplicação estará disponível em http://localhost:8080

### Registro de Usuário
URL: /register
Método: POST

Corpo da Requisição:
{
  "username": "examploUser",
  "password": "examploPassword",
  "role":
}
![image](https://github.com/isabellaarg/Aaw/blob/main/JWT_RestAPI/JWT_RestAPI/assets%20aaw/Captura%20de%20tela%202024-06-16%20192218.png)

### Login de Usuário
Login
URL: /login
Método: POST

Corpo da Requisição:
{
  "username": "examploUser",
  "password": "examploPassword"
}

### Extrair Nome de Usuário do Token
URL: /username/{token}
Método: GET

Resposta:
{
  "username": "exampleUser"
}

### Endpoint de Admin
URL: /admin
Método: GET
Cabeçalho: Authorization: Bearer {jwtToken}

Resposta:
{
  "username": "adminUser"
}

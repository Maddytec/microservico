# Micro serviço com Postgres e Docker

## 1. Baixar projeto
`$ git clone https://github.com/Maddytec/microservico.git`

## 2. Disponibilizar banco de dados Postgres no container Docker
`$ cd microservico`
`$ docker-compose up -d`

## 3. Executar a API "microservico"
`$ mvn spring-boot:run`

## 4. Endpoint disponiveis na API

#### 4.1 **POST** - SALVAR CLIENTE
Exemplo:  http://localhost:8080/cliente
{
    "nome": "JOAO TESTE1",
    "foneMovel": "(71) 98169-0000",
    "foneFixo": "(71) 3302-0000",
    "email": "joaoteste1@teste.com.br",
    "cpf": "95332883021",
    "dataNascimento": "10/10/1980",
    "enderecos": [
        {
            "logradouro": "Rua do Tesouro 10",
            "numero": "AP 1",
            "bairro": "Tesouro",
            "complemento": "TORRE DO TESOURO",
            "cidade": "TESOURO BEACH",
            "uf": "TT",
            "cep": "48120010"
        }
    ]
} 
#### 4.2 **GET** - PESQUISAR TODOS OS CLIENTE
Exemplo: http://localhost:8080/cliente

#### 4.3 **GET** - PESQUISAR POR ID DO CLIENTE 
Exemplo: http://localhost:8080/cliente/1
#### 4.4 **GET** - PESQUISAR CLIENTE COM PAGINAÇÃO
Exemplo: http://localhost:8080/cliente/lazy e passar valores inteiros para os parametros page e size, onde page é o número da página e size é quantos cliente serão exibido por página.
   #### 4.5 **PUT** - EDIÇÃO DO CLIENTE
Exemplo: http://localhost:8080/cliente/1
{
    "nome": "MARIA TESTE",
    "foneMovel": "(71) 9000-0002",
    "foneFixo": "(71) 3302-0002",
    "email": "maria@teste.com.br",
    "cpf": "57461971069",
    "dataNascimento": "10/10/1982",
    "enderecos": [
        {
            "logradouro": "Rua do Tesouro 11",
            "numero": "AP 11",
            "bairro": "Tesouro 11",
            "complemento": "TORRE DO TESOURO 11",
            "cidade": "TESOURO BEACH2 11",
            "uf": "TT",
            "cep": "48120011"
        }
    ]
}
#### 4.6 **DELETE** - EXCLUSÃO DO CLIENTE
Exemplo: http://localhost:8080/cliente/15 e o cliente com id 15 será excluído.

**Observação:** na raiz do projeto encontra-se o arquivo Testes.postman_collection.json para importação no Postman para testar os endpointes.

## 5. License
Este código é open source.

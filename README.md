# API Calculadora em Java

Uma API REST escrita em **Java** para a resolução de cálculos matemáticos simples.

Este projeto foi desenvolvido com o objetivo de estudo da linguagem **Java** e do framework **Spring Boot**, explorando conceitos como:

* Programação Orientada a Objetos
* Estruturação de projetos com Spring
* Criação de endpoints REST
* Processamento e interpretação de expressões matemáticas

---

## 📌 Descrição

A API recebe uma expressão matemática em formato de string e retorna o resultado do cálculo.

### Exemplo de requisição

```json
{
  "eqc": "5*(2/3)"
}
```

---

## Como rodar o projeto

```bash
git clone https://github.com/pedrohebert/api-calculadora-em-java.git
cd api-calculadora-em-java
./mvnw spring-boot:run
```

A aplicação será iniciada e ficará disponível localmente em `http://localhost:8080/calc`.

---

## 🛠 Tecnologias utilizadas

* Java
* Spring Boot
* Maven

---

## 📚 Objetivo do projeto

Este projeto tem caráter educacional e foi criado para:

* Praticar desenvolvimento backend com Java
* Compreender melhor o funcionamento do Spring Boot
* Implementar um parser simples para expressões matemáticas

---

## 🚧 A ser feito

* [ ] Suporte a números negativos
* [ ] Suporte a operadores unitários

---

## 📄 Licença

Projeto desenvolvido para fins de estudo.

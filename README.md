# Desafio Empréstimos 💸

Desafio proposto pela comunidade [Back-End Brasil](https://github.com/backend-br).  
Saiba mais: [Empréstimos](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md).
 
---

#### ☕ Tecnologias utilizadas:

- Java
- Spring Boot

---

## ⚙️ Passo a passo

#### 1 - Inicie a aplicação e ela estará disponível em:

- http://localhost:8080/v1/customer-loans

#### 2 - Abra algum aplicativo para realizar suas requisições

- Algumas recomendações:  
[Insomnia](https://insomnia.rest/)  
[Postman](https://www.postman.com/)  
[Bruno](https://www.usebruno.com/)  

--- 

## 📨 Requisições

| Método | Url                            | Descrição                         | Corpo da requisição          |
| ------ | ------------------------------ | --------------------------------- | ---------------------------- |
| POST   | /v1/customer-loans             | Consulte as opções de empréstimo. | [JSON](#consultaremprestimo) |

---

## 📄 Corpo das requisições

##### <a id="consultaremprestimo">/v1/customer-loans - Consulte as opções de empréstimo.</a>

```json
{
  "age": 26,
  "cpf": "275.484.389-23",
  "name": "Vuxaywua Zukiagou",
  "income": 7000.00,
  "location": "SP"
}
```





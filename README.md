# PROJETO DE AMOSTRA  Springboot

Um projeto de amostra desenvolvido com **Spring Boot**. Confira a demonstração e experimente com as credenciais abaixo.

## 🎥 Demo
### 🖼️ Capturas de Tela
[assets](./assets)
---

## 🛠 Credenciais para Testes

### Usuário:
- **Login:** `test123@test.com`  
- **Senha:** `admin`  

### Admin:
- **Login:** `admin@gmail.com`  
- **Senha:** `admin`

---

## 🚀 Tecnologias Utilizadas
### Backend:
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-%23F29111.svg?style=for-the-badge&logo=hibernate&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Node.js](https://img.shields.io/badge/Node.js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white)

### Frontend:
![ReactJS](https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![Next.js](https://img.shields.io/badge/Next.js-000000?style=for-the-badge&logo=next.js&logoColor=white)
![CSS](https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white)

### Ferramentas de Build e Testes:
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-FFCA28?style=for-the-badge&logo=mockito&logoColor=black)


---

## 📝 Funcionalidades

### Para Clientes:
- Registro e Login: Crie sua conta ou faça login com suas credenciais.
- Navegação: Explore a vitrine principal e visualize produtos individualmente.
- Busca Avançada: Encontre produtos com base em critérios específicos.
- Carrinho de Compras: Adicione ou remova produtos do carrinho.
- Pedidos: Finalize compras com os produtos selecionados.
- Perfil: Altere sua senha e veja o histórico de pedidos.

### Para Administradores:
- Gerenciamento de Produtos: Adicione, edite ou remova produtos.
- Gestão de Usuários: Atualize informações de qualquer usuário.
- Pedidos: Visualize os pedidos realizados por todos os usuários.

---

## 🛠️ Configuração Local

### Pré-requisitos:
- **Java 17+**  
- **Maven**  
- **PostgreSQL**   

### Passos:
1. Clone o repositório:
   ```bash
   git clone <link-do-repositório>
   cd picture-web-store
2. Configure o banco de dados no application.properties:
   ```properties
    spring.datasource.url=jdbc:postgresql://<host>:<porta>/<nome-do-banco>
    spring.datasource.username=<usuário>
    spring.datasource.password=<senha>

3. Compile e execute:
    ```bash
    Copiar código
    mvn clean install
    mvn spring-boot:run
---

## 📚 Testes

### Este projeto inclui testes unitários e de integração usando JUnit e Mockito. Execute os testes com:
     mvn test
---

## 🌐 Implantação

### A aplicação está hospedada na AWS EC2. Consulte a documentação para configurar o ambiente de implantação.

---

## 📩 Contato

### Para dúvidas ou sugestões: github.com/viniribeiroa

---

## 📜 Termos de Uso

Este projeto é fornecido "como está", sem qualquer garantia expressa ou implícita. É de responsabilidade do usuário garantir que o uso do software esteja em conformidade com as leis e regulamentações aplicáveis.
Ao utilizar este software, você concorda em não usá-lo para fins ilícitos, fraudulentos ou prejudiciais.

---

## 📄 Licença
Este projeto é licenciado sob a Licença MIT.
Consulte o arquivo [LICENSE](./LICENSE) para mais detalhes.

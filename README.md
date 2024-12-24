🏥 HealthSync
HealthSync é uma API REST desenvolvida para gerenciar dados de saúde de forma eficiente e segura. Este projeto utiliza as melhores práticas aprendidas no curso "Spring Boot 3: aplique boas práticas e proteja uma API Rest" pela Alura, garantindo um código limpo, bem estruturado e seguro.

✨ Funcionalidades
📋 Gerenciamento de Usuários: Cadastro, edição e exclusão de usuários.
🔒 Autenticação e Autorização: Segurança implementada com Spring Security e suporte a JWT.
📊 Monitoramento de Dados de Saúde: Endpoints para registrar e consultar dados de saúde.
📂 Boas Práticas: Aplicação de princípios como SOLID, injeção de dependência e validações robustas.
🛠️ Tecnologias Utilizadas
Java 17
Spring Boot 3
Spring Security
Spring Data JPA
Spring Validation
Hibernate (ORM)
H2 Database (ambiente de desenvolvimento)
PostgreSQL (produção)
JWT (JSON Web Token) para autenticação
Maven para gerenciamento de dependências
🚀 Como Executar
Pré-requisitos
Java 17+ instalado
Maven configurado
Banco de dados PostgreSQL (ou H2 para testes locais)
Passos
Clone o repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/healthsync.git  
cd healthsync  
Configure o arquivo application.properties com suas credenciais:

properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/healthsync  
spring.datasource.username=seu_usuario  
spring.datasource.password=sua_senha  
spring.jpa.hibernate.ddl-auto=update  
spring.security.jwt.secret=seu_segredo  
Compile e execute a aplicação:

bash
Copiar código
mvn spring-boot:run  
Acesse a API em:

arduino
Copiar código
http://localhost:8080  
🔒 Segurança
A API utiliza autenticação baseada em JWT para proteger os endpoints. A seguir, os principais níveis de proteção:

Autenticação: Apenas usuários autenticados podem acessar a maioria dos endpoints.
Autorização: Diferentes níveis de acesso baseados em roles (ROLE_USER, ROLE_ADMIN).
Validações: Dados de entrada são validados com Bean Validation para evitar inconsistências.
📚 Aprendizados
Durante o desenvolvimento do HealthSync, apliquei conceitos como:

Configuração de autenticação com JWT no Spring Security.
Princípios de boas práticas em APIs REST, como tratamento de erros centralizado.
Estruturação de código com separação de responsabilidades (Controllers, Services, Repositories).
Implementação de validações automáticas com Bean Validation.
👥 Contribuidores
Seu Nome - Desenvolvedor
Alura - Inspiração e conhecimento
📄 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para utilizá-lo e contribuir.

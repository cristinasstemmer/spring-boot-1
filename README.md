# Sistema de Matrículas: Relacionamento Many-to-Many entre Alunos e Cursos

Este projeto implementa um sistema de matrículas para uma escola, usando o Spring Boot e JPA para gerenciar o relacionamento **Many-to-Many** entre as entidades **Aluno** e **Curso**.

## Funcionalidades

- **CRUD** para Alunos e Cursos.
- **Relacionamento Many-to-Many** entre Alunos e Cursos.
- Operações:
  - Adicionar aluno.
  - Adicionar curso.
  - Matricular aluno em curso.
  - Remover aluno de curso.
  - Listar todos os cursos de um aluno.
  - Listar todos os alunos de um curso.

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para desenvolvimento.
- **JPA (Java Persistence API)**: Para persistência dos dados no banco de dados.
- **H2 Database**: Banco de dados em memória para testes.
- **Maven**: Gerenciador de dependências e build.

## Como Rodar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-repositorio.git
2. Navegue até o diretório do projeto:
   ```bash
    cd nome-repositorio
3. Compile e execute o projeto usando Maven:
   ```bash
    mvn spring-boot:run
  A aplicação estará rodando em http://localhost:8080.
  
## Endpoints

- POST /alunos: Adiciona um novo aluno.
- POST /cursos: Adiciona um novo curso.
- POST /alunos/{id}/cursos/{cursoId}: Matricula um aluno em um curso.
- DELETE /alunos/{id}/cursos/{cursoId}: Remove um aluno de um curso.
- GET /alunos/{id}/cursos: Lista todos os cursos de um aluno.
- GET /cursos/{id}/alunos: Lista todos os alunos de um curso.

# Projeto de Autenticação e Autorização com Spring Security

Este projeto visa implementar autenticação e autorização de usuários em uma aplicação com Spring Boot e Spring Security, criando perfis distintos (atendentes, médicos e pacientes) e controlando o acesso com base em permissões específicas. O foco é garantir a segurança dos dados e uma boa experiência para os usuários.

## Funcionalidades Implementadas

- **Criação de Usuários:** A partir das entidades de domínio, permitindo a associação de perfis através de `Enum` na classe `Usuario`.
- **Perfis de Usuário:** Diferentes permissões baseadas nos papéis de usuário (atendente, médico, paciente), controladas com `hasRole()` e `@PreAuthorize`.
- **Controle de Acesso:** Restrições de acesso aplicadas com `authorizeHttpRequests()`, `requestMatchers()` e `hasRole()`.
- **Exibição Dinâmica:** Menus e funcionalidades no front-end exibidos de acordo com o perfil do usuário logado.
- **Fluxos Seguros:** Implementação de alteração de senha e recuperação de conta com tokens únicos.

## Tecnologias Utilizadas

- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **Thymeleaf**
- **PostgreSQL**
- **Spring Validation**
- **Spring Mail**
- **Spring Security Test**

## Dependências

- `spring-boot-starter-security`
- `spring-boot-starter-data-jpa`
- `spring-boot-starter-thymeleaf`
- `thymeleaf-extras-springsecurity6`
- `spring-boot-starter-validation`
- `spring-boot-starter-mail`
- `spring-boot-devtools`
- `postgresql`
- `spring-security-test`

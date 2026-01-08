# techflow-task-management


### Este documento apresenta, de forma detalhada, todo o processo de desenvolvimento do projeto acadêmico “Sistema de Gerenciamento de Tarefas”, desenvolvido em Java com Spring Boot. O objetivo é demonstrar todas as etapas realizadas, desde a concepção inicial até a entrega final, incluindo decisões técnicas, uso de metodologias ágeis, controle de qualidade e gestão de mudanças.

1. Contexto do Projeto <br/>
   A TechFlow Solutions, empresa fictícia do projeto, foi contratada por uma startup de logística
   para desenvolver um sistema de gerenciamento de tarefas baseado em metodologias ágeis. O
   sistema deveria permitir o acompanhamento do fluxo de trabalho, priorização de tarefas e
   organização das atividades da equipe.
   <br/><br/>
2. Objetivo do Sistema <br/>
   O objetivo principal do sistema é fornecer uma API REST para criação, leitura, atualização e
   exclusão de tarefas (CRUD), permitindo que equipes acompanhem suas atividades de forma
   estruturada e organizada.
   <br/><br/>
3. Tecnologias Utilizadas
   - Linguagem: Java 21
   - Framework: Spring Boot
   - Gerenciador de Dependências: Maven
   - Banco de Dados: MySQL (produção) e H2 (testes)
   - Testes Automatizados: JUnit 5
   - Controle de Versão: Git e GitHub
   - Integração Contínua: GitHub Actions
     <br/><br/>
4. Metodologia Ágil Aplicada <br/>
   Foi utilizada a metodologia Kanban, por meio da funcionalidade GitHub Projects. As tarefas
   foram organizadas nas colunas A Fazer, Em Progresso e Concluído, permitindo visualizar
   claramente o andamento do projeto.


5. Estrutura do Projeto <br/>
   O projeto foi estruturado seguindo boas práticas do Spring Boot, separando responsabilidades
   em camadas:
- Controller: responsável pelas requisições HTTP
- Service: responsável pelas regras de negócio
- Repository: responsável pela persistência de dados
- Model: definição das entidades do sistema

6. Persistência de Dados <br/>
   O sistema utiliza MySQL como banco de dados principal. A persistência é realizada por meio do
   Spring Data JPA e Hibernate, que criam e atualizam automaticamente as tabelas com base nas
   entidades. As credenciais do banco foram externalizadas em variáveis de ambiente, evitando
   exposição de dados sensíveis.


7. Testes Automatizados <br/>
   Foram implementados testes automatizados utilizando JUnit 5 e Spring Boot Test. Os testes
   validam o carregamento do contexto da aplicação, garantindo que o sistema esteja configurado
   corretamente.


8. Integração Contínua (GitHub Actions) <br/>
   O projeto conta com um pipeline de integração contínua configurado com GitHub Actions. A
   cada push no repositório, o pipeline executa automaticamente o build e os testes. Em ambientes
   com runners compartilhados, algumas execuções permaneceram em estado de fila (Queued) e
   foram canceladas automaticamente pelo GitHub por indisponibilidade temporária de recursos,
   sem comprometer a configuração do pipeline.


9. Simulação de Mudança de Escopo <br/>
   Durante o desenvolvimento, foi simulada uma mudança de escopo solicitada pelo cliente: a
   inclusão de um responsável para cada tarefa. Essa alteração impactou o modelo de dados e foi
   registrada no Kanban, implementada por meio de um novo commit e documentada no projeto.


10. Gestão de Commits e Versionamento <br/>
    Os commits foram realizados de forma incremental e descritiva, refletindo cada etapa do
    desenvolvimento. Essa prática facilita o rastreamento das alterações e demonstra organização
    no processo de versionamento.


11. Conclusão <br/>
    O projeto atendeu a todos os requisitos propostos, demonstrando a aplicação prática de
    conceitos de Engenharia de Software, metodologias ágeis, controle de qualidade e integração
    contínua. O sistema desenvolvido é funcional, organizado e segue boas práticas do mercado.
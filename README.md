# springBasico
Visão geral da estrutura Spring
Spring facilita a criação de aplicativos corporativos Java. Ele fornece tudo que você precisa para adotar a linguagem Java em um ambiente corporativo, com suporte para Groovy e Kotlin como linguagens alternativas na JVM e com flexibilidade para criar vários tipos de arquiteturas dependendo das necessidades de um aplicativo. A partir do Spring Framework 6.0, o Spring requer Java 17+.

Spring oferece suporte a uma ampla variedade de cenários de aplicativos. Em uma grande empresa, os aplicativos geralmente existem há muito tempo e precisam ser executados em um JDK e em um servidor de aplicativos cujo ciclo de atualização está além do controle do desenvolvedor. Outros podem ser executados como um único jar com o servidor incorporado, possivelmente em um ambiente de nuvem. Outros ainda podem ser aplicativos autônomos (como cargas de trabalho em lote ou de integração) que não precisam de um servidor.

O spring é de código aberto. Possui uma comunidade grande e ativa que fornece feedback contínuo com base em uma ampla gama de casos de uso do mundo real. Isso ajudou o Spring a evoluir com sucesso ao longo de muito tempo


O que queremos dizer com "Spring"
O termo "Spring" significa coisas diferentes em contextos diferentes. Pode ser usado para se referir ao próprio projeto Spring Framework, que foi onde tudo começou. Com o tempo, outros projetos Spring foram construídos com base no Spring Framework. Na maioria das vezes, quando as pessoas dizem “Primavera”, elas se referem a toda a família de projetos. Esta documentação de referência concentra-se na base: o próprio Spring Framework.

O Spring Framework é dividido em módulos. Os aplicativos podem escolher quais módulos precisam. No centro estão os módulos do contêiner principal, incluindo um modelo de configuração e um mecanismo de injeção de dependência. Além disso, o Spring Framework fornece suporte fundamental para diferentes arquiteturas de aplicativos, incluindo mensagens, dados transacionais e persistência, e web. Também inclui o framework web Spring MVC baseado em servlet e, em paralelo, o framework web reativo Spring WebFlux.

Uma observação sobre os módulos: os jars da estrutura do Spring permitem a implantação no caminho do módulo do JDK 9 ("Jigsaw"). Para uso em aplicativos habilitados para Jigsaw, os jars do Spring Framework 5 vêm com entradas de manifesto "Automatic-Module-Name" que definem nomes de módulos de nível de linguagem estáveis ("spring.core", "spring.context", etc.) independentes de nomes de artefatos jar (os jars seguem o mesmo padrão de nomenclatura com "-" em vez de ".", por exemplo, "spring-core" e "spring-context"). É claro que os jars da estrutura do Spring continuam funcionando bem no classpath tanto no JDK 8 quanto no 9+.O que queremos dizer com "Spring"
O termo "Spring" significa coisas diferentes em contextos diferentes. Pode ser usado para se referir ao próprio projeto Spring Framework, que foi onde tudo começou. Com o tempo, outros projetos Spring foram construídos com base no Spring Framework. Na maioria das vezes, quando as pessoas dizem “Spring”, elas se referem a toda a família de projetos. Esta documentação de referência concentra-se na base: o próprio Spring Framework.

O Spring Framework é dividido em módulos. Os aplicativos podem escolher quais módulos precisam. No centro estão os módulos do contêiner principal, incluindo um modelo de configuração e um mecanismo de injeção de dependência. Além disso, o Spring Framework fornece suporte fundamental para diferentes arquiteturas de aplicativos, incluindo mensagens, dados transacionais e persistência, e web. Também inclui o framework web Spring MVC baseado em servlet e, em paralelo, o framework web reativo Spring WebFlux.

Uma observação sobre os módulos: os jars da estrutura do Spring permitem a implantação no caminho do módulo do JDK 9 ("Jigsaw"). Para uso em aplicativos habilitados para Jigsaw, os jars do Spring Framework 5 vêm com entradas de manifesto "Automatic-Module-Name" que definem nomes de módulos de nível de linguagem estáveis ("spring.core", "spring.context", etc.) independentes de nomes de artefatos jar (os jars seguem o mesmo padrão de nomenclatura com "-" em vez de ".", por exemplo, "spring-core" e "spring-context"). É claro que os jars da estrutura do Spring continuam funcionando bem no classpath tanto no JDK 8 quanto no 9+.
História do Spring e do Spring Framework
O Spring surgiu em 2003 como uma resposta à complexidade das primeiras especificações J2EE. Embora alguns considerem o Java EE e seu sucessor moderno Jakarta EE competindo com o Spring, eles são na verdade complementares. O modelo de programação Spring não abrange a especificação da plataforma Jakarta EE; em vez disso, integra-se com especificações individuais cuidadosamente selecionadas do guarda-chuva tradicional de EE:

API de servlet (JSR 340)

API WebSocket (JSR 356)

Utilitários de simultaneidade (JSR 236)

API de ligação JSON (JSR 367)

Validação de feijão (JSR 303)

APP (JSR 338)

JMS (JSR 914)

bem como configurações JTA/JCA para coordenação de transações, se necessário.

O Spring Framework também suporta as especificações Dependency Injection (JSR 330) e Common Annotations (JSR 250), que os desenvolvedores de aplicativos podem optar por usar em vez dos mecanismos específicos do Spring fornecidos pelo Spring Framework. Originalmente, eles eram baseados em pacotes javax comuns.

A partir do Spring Framework 6.0, o Spring foi atualizado para o nível Jakarta EE 9 (por exemplo, Servlet 5.0+, JPA 3.0+), baseado no namespace jakarta em vez dos pacotes javax tradicionais. Com EE 9 como mínimo e EE 10 já suportado, o Spring está preparado para fornecer suporte pronto para uso para a evolução futura das APIs Jakarta EE. Spring Framework 6.0 é totalmente compatível com Tomcat 10.1, Jetty 11 e Undertow 2.3 como servidores web, e também com Hibernate ORM 6.1.

Com o tempo, a função do Java/Jakarta EE no desenvolvimento de aplicativos evoluiu. Nos primórdios do J2EE e do Spring, os aplicativos foram criados para serem implementados em um servidor de aplicativos. Hoje, com a ajuda do Spring Boot, os aplicativos são criados de maneira amigável ao Devops e à nuvem, com o contêiner Servlet incorporado e fácil de alterar. A partir do Spring Framework 5, um aplicativo WebFlux nem mesmo usa a API do Servlet diretamente e pode ser executado em servidores (como o Netty) que não são contêineres de Servlet.

A Primavera continua a inovar e a evoluir. Além do Spring Framework, existem outros projetos, como Spring Boot, Spring Security, Spring Data, Spring Cloud, Spring Batch, entre outros. É importante lembrar que cada projeto tem seu próprio repositório de código-fonte, rastreador de problemas e cadência de lançamento. Consulte spring.io/projects para a lista completa de projetos Spring.

Design Philosophy
When you learn about a framework, it’s important to know not only what it does but what principles it follows. Here are the guiding principles of the Spring Framework:

Provide choice at every level. Spring lets you defer design decisions as late as possible. For example, you can switch persistence providers through configuration without changing your code. The same is true for many other infrastructure concerns and integration with third-party APIs.

Accommodate diverse perspectives. Spring embraces flexibility and is not opinionated about how things should be done. It supports a wide range of application needs with different perspectives.

Maintain strong backward compatibility. Spring’s evolution has been carefully managed to force few breaking changes between versions. Spring supports a carefully chosen range of JDK versions and third-party libraries to facilitate maintenance of applications and libraries that depend on Spring.

Care about API design. The Spring team puts a lot of thought and time into making APIs that are intuitive and that hold up across many versions and many years.

Set high standards for code quality. The Spring Framework puts a strong emphasis on meaningful, current, and accurate javadoc. It is one of very few projects that can claim clean code structure with no circular dependencies between packages.

Feedback and Contributions
For how-to questions or diagnosing or debugging issues, we suggest using Stack Overflow. Click here for a list of the suggested tags to use on Stack Overflow. If you’re fairly certain that there is a problem in the Spring Framework or would like to suggest a feature, please use the GitHub Issues.

If you have a solution in mind or a suggested fix, you can submit a pull request on Github. However, please keep in mind that, for all but the most trivial issues, we expect a ticket to be filed in the issue tracker, where discussions take place and leave a record for future reference.

For more details see the guidelines at the CONTRIBUTING, top-level project page.

Getting Started
If you are just getting started with Spring, you may want to begin using the Spring Framework by creating a Spring Boot-based application. Spring Boot provides a quick (and opinionated) way to create a production-ready Spring-based application. It is based on the Spring Framework, favors convention over configuration, and is designed to get you up and running as quickly as possible.

You can use start.spring.io to generate a basic project or follow one of the "Getting Started" guides, such as Getting Started Building a RESTful Web Service. As well as being easier to digest, these guides are very task focused, and most of them are based on Spring Boot. They also cover other projects from the Spring portfolio that you might want to consider when solving a particular problem.

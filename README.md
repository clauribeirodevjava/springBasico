# springBasico
Visão geral da estrutura Spring
Spring facilita a criação de aplicativos corporativos Java. Ele fornece tudo que você precisa para adotar a linguagem Java em um ambiente corporativo, com suporte para Groovy e Kotlin como linguagens alternativas na JVM e com flexibilidade para criar vários tipos de arquiteturas dependendo das necessidades de um aplicativo. A partir do Spring Framework 6.0, o Spring requer Java 17+.

Spring oferece suporte a uma ampla variedade de cenários de aplicativos. Em uma grande empresa, os aplicativos geralmente existem há muito tempo e precisam ser executados em um JDK e em um servidor de aplicativos cujo ciclo de atualização está além do controle do desenvolvedor. Outros podem ser executados como um único jar com o servidor incorporado, possivelmente em um ambiente de nuvem. Outros ainda podem ser aplicativos autônomos (como cargas de trabalho em lote ou de integração) que não precisam de um servidor.

O spring é de código aberto. Possui uma comunidade grande e ativa que fornece feedback contínuo com base em uma ampla gama de casos de uso do mundo real. Isso ajudou o Spring a evoluir com sucesso ao longo de muito tempo


O que queremos dizer com "Spring"
O termo "Spring" significa coisas diferentes em contextos diferentes. Pode ser usado para se referir ao próprio projeto Spring Framework, que foi onde tudo começou. Com o tempo, outros projetos Spring foram construídos com base no Spring Framework. Na maioria das vezes, quando as pessoas dizem “Spring”, elas se referem a toda a família de projetos. Esta documentação de referência concentra-se na base: o próprio Spring Framework.

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

Validação de bean (JSR 303)

APP (JSR 338)

JMS (JSR 914)

bem como configurações JTA/JCA para coordenação de transações, se necessário.

O Spring Framework também suporta as especificações Dependency Injection (JSR 330) e Common Annotations (JSR 250), que os desenvolvedores de aplicativos podem optar por usar em vez dos mecanismos específicos do Spring fornecidos pelo Spring Framework. Originalmente, eles eram baseados em pacotes javax comuns.

A partir do Spring Framework 6.0, o Spring foi atualizado para o nível Jakarta EE 9 (por exemplo, Servlet 5.0+, JPA 3.0+), baseado no namespace jakarta em vez dos pacotes javax tradicionais. Com EE 9 como mínimo e EE 10 já suportado, o Spring está preparado para fornecer suporte pronto para uso para a evolução futura das APIs Jakarta EE. Spring Framework 6.0 é totalmente compatível com Tomcat 10.1, Jetty 11 e Undertow 2.3 como servidores web, e também com Hibernate ORM 6.1.

Com o tempo, a função do Java/Jakarta EE no desenvolvimento de aplicativos evoluiu. Nos primórdios do J2EE e do Spring, os aplicativos foram criados para serem implementados em um servidor de aplicativos. Hoje, com a ajuda do Spring Boot, os aplicativos são criados de maneira amigável ao Devops e à nuvem, com o contêiner Servlet incorporado e fácil de alterar. A partir do Spring Framework 5, um aplicativo WebFlux nem mesmo usa a API do Servlet diretamente e pode ser executado em servidores (como o Netty) que não são contêineres de Servlet.

O Spring continua a inovar e a evoluir. Além do Spring Framework, existem outros projetos, como Spring Boot, Spring Security, Spring Data, Spring Cloud, Spring Batch, entre outros. É importante lembrar que cada projeto tem seu próprio repositório de código-fonte, rastreador de problemas e cadência de lançamento. Consulte spring.io/projects para a lista completa de projetos Spring.

Filosofia de design
Quando você aprende sobre uma estrutura, é importante saber não apenas o que ela faz, mas também quais princípios ela segue. Aqui estão os princípios orientadores do Spring Framework:

Fornece escolha em todos os níveis. Spring permite adiar decisões de design o mais tarde possível. Por exemplo, você pode alternar provedores de persistência por meio da configuração sem alterar seu código. O mesmo se aplica a muitas outras preocupações de infraestrutura e integração com APIs de terceiros.

Acomode diversas perspectivas. Spring abraça a flexibilidade e não tem opinião opinativa sobre como as coisas devem ser feitas. Ele oferece suporte a uma ampla gama de necessidades de aplicação com diferentes perspectivas.

Mantenha forte compatibilidade com versões anteriores. A evolução do Spring foi cuidadosamente gerenciada para forçar poucas mudanças significativas entre as versões. Spring oferece suporte a uma variedade cuidadosamente escolhida de versões JDK e bibliotecas de terceiros para facilitar a manutenção de aplicativos e bibliotecas que dependem do Spring.

Preocupe-se com o design da API. A equipe do Spring dedica muito tempo e reflexão para criar APIs que sejam intuitivas e que funcionem em muitas versões e por muitos anos.

Estabeleça padrões elevados de qualidade de código. O Spring Framework coloca forte ênfase em javadoc significativo, atual e preciso. É um dos poucos projetos que pode reivindicar uma estrutura de código limpa, sem dependências circulares entre pacotes.

Feedback e Contribuições
Para perguntas sobre como fazer ou diagnóstico ou depuração de problemas, sugerimos o uso do Stack Overflow. Clique aqui para obter uma lista de tags sugeridas para usar no Stack Overflow. Se você tiver certeza de que há um problema no Spring Framework ou quiser sugerir um recurso, use o GitHub Issues.

Se você tiver uma solução em mente ou uma sugestão de correção, poderá enviar uma solicitação pull no Github. No entanto, tenha em mente que, para todos os problemas, exceto os mais triviais, esperamos que um ticket seja preenchido no rastreador de problemas, onde ocorrem as discussões e deixe um registro para referência futura.

Para obter mais detalhes, consulte as diretrizes na página CONTRIBUINDO do projeto de nível superior.

Começando
Se você está apenas começando com o Spring, você pode querer começar a usar o Spring Framework criando um aplicativo baseado em Spring Boot. Spring Boot fornece uma maneira rápida (e opinativa) de criar um aplicativo baseado em Spring pronto para produção. Ele é baseado no Spring Framework, favorece a convenção em vez da configuração e foi projetado para colocá-lo em funcionamento o mais rápido possível.

Você pode usar start.spring.io para gerar um projeto básico ou seguir um dos guias de "Introdução", como Introdução à criação de um serviço Web RESTful. Além de serem mais fáceis de digerir, esses guias são muito focados nas tarefas e a maioria deles é baseada no Spring Boot. Eles também cobrem outros projetos do portfólio Spring que você pode considerar ao resolver um problema específico.
# Hello World
[Texto do Link](./README.md)


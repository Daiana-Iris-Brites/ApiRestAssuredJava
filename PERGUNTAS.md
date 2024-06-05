# Responda as questões a seguir:
1) O cliente adquiriu um novo modelo de máquina de cartão de crédito e ela aceita as
   bandeiras Visa, Master, Elo, Amex e Hiper e executa duas operações para cada
   bandeira débito e crédito. Quantos testes serão necessários para validação dessa
   máquina e qual técnica a ser utilizada?
```bash
Para validar a máquina, é necessário testar cada combinação de bandeira e operação. Com cinco bandeiras e duas operações por bandeira, temos:

Numero de testes =5(bandeiras)×2(operacoes) = 10 testes

A técnica a ser utilizada é a técnica de particão de equivalência, que envolve a criação de subconjuntos de entradas que são tratadas da mesma forma pela aplicação, permitindo que um teste representativo seja selecionado para cada conjunto.

```
2) A bandeira Visa disponibilizou um novo range de bin ́s no mercado que possui seis
   dígitos 232425 a 232460. Quais os testes deverão ser feitos desse range de bins para
   confirmar que está funcionando?
   a) 230000,232425,232460
   b) 0,232425,232460,240000
   c) 232425,232460
   d) 232424,232425,232459,232460,232461
```bash
Resposta seria a d) , pois é a mais completa e deve-se testar o valor mínimo, o valor máximo e valores adjacentes para garantir que a faixa está correta.

```
3) Cite uma abordagem desenvolvimento ágil e explique-a, responda em suas palavras.
```bash
A abordagem ágil no contexto de QA nos times de desenvolvimento de software envolve a integração contínua e colaborativa dos testes ao longo de todo o ciclo de vida do desenvolvimento. Em vez de tratar o QA como uma fase separada que ocorre após o desenvolvimento, o QA é incorporado em cada etapa do processo. Isso garante que os problemas sejam identificados e corrigidos mais rapidamente, promovendo uma entrega de software de maior qualidade e de maneira mais eficiente.

Exemplo de Abordagem Ágil com QA
Vamos considerar um exemplo prático de uma equipe de desenvolvimento de software que está criando uma aplicação web.

1. Planejamento da Sprint
Reunião de Planejamento da Sprint: Durante a reunião de planejamento da sprint, o QA participa ativamente junto com os desenvolvedores e o Product Owner. Eles ajudam a definir as histórias de usuário e a criar critérios de aceitação claros e testáveis.
2. Desenvolvimento e Testes
Desenvolvimento Incremental: À medida que os desenvolvedores trabalham em pequenas funcionalidades ou incrementos do produto, o QA também começa a criar casos de teste automatizados e manuais com base nos critérios de aceitação definidos e na gestão de bugs do time.
Integração Contínua: A equipe utiliza um pipeline de integração contínua (CI) onde cada commit no código dispara automaticamente uma série de testes. Isso inclui testes unitários, testes de integração e testes de regressão automatizados.
3. Dailys: Durante as reuniões diárias, os QAs discutem o progresso dos testes, destacam qualquer bloqueio ou defeito encontrado e colaboram com desenvolvedores para resolver esses problemas rapidamente.
4. Revisão e Retrospectiva
Revisão da Sprint (Sprint Review): No final da sprint, durante a reunião de revisão da sprint, os QAs demonstram os resultados dos testes e discutem quaisquer problemas de qualidade que possam impactar a entrega do incremento de software.
Retrospectiva da Sprint: Durante a retrospectiva, a equipe inteira, incluindo o QA, discute o que funcionou bem e o que pode ser melhorado. Isso pode incluir estratégias de teste, ferramentas, colaboração, entre outros aspectos.
Todas essas ações ajudam:
- Detecção Precoce de Defeitos
- Feedback Contínuo: 
- Melhoria Contínua
- Maior Colaboração

```
4) O que é CI/CD?
```bash
CI/CD significa Continuous Integration/Continuous Delivery (ou Continuous Deployment). É uma prática de desenvolvimento de software onde as mudanças no código são automaticamente testadas e integradas em um repositório compartilhado, seguido de entrega contínua para ambientes de produção ou preparação. CI/CD automatiza o processo de integração e entrega, reduzindo o tempo de liberação de novas funcionalidades e correções, melhorando a qualidade e eficiência

```
5) O que é TDD, BDD e ATDD e quando são aplicadas?
```bash
TDD (Test-Driven Development): É uma prática de desenvolvimento onde os testes são escritos antes do código. O ciclo TDD segue três passos: escrever um teste que falha, escrever o código mínimo necessário para passar o teste, e refatorar o código.
BDD (Behavior-Driven Development): É uma extensão do TDD focada no comportamento do software. Envolve escrever especificações em uma linguagem natural que descreve a funcionalidade do sistema de uma perspectiva de usuário.
ATDD (Acceptance Test-Driven Development): Semelhante ao BDD, mas focado em definir e testar os critérios de aceitação antes de iniciar o desenvolvimento. Os testes de aceitação são criados em colaboração com os stakeholders para garantir que os requisitos são bem compreendidos.
Elas são aplicadas para melhorar a qualidade do código, garantir que o software atende aos requisitos e facilitar a comunicação entre os desenvolvedores e stakeholders


```
6) Cite uma heurística de testes utilizada para testes de front e de back e explique-as
```bash
 - Front-end: ALTER FACE
ALTER-FACE é uma heurística específica para testes de usabilidade e interface de usuário (UI). Esta heurística ajuda a garantir que a aplicação seja fácil de usar e acessível. ALTER-FACE é um acrônimo que abrange os seguintes aspectos:

Accessibility (Acessibilidade): Verifique se a aplicação é acessível a todos os usuários, incluindo aqueles com deficiências. Isso inclui a conformidade com normas de acessibilidade, como WCAG (Web Content Accessibility Guidelines).

Localization (Localização): Teste se a aplicação funciona corretamente em diferentes idiomas e regiões. Verifique traduções, formatos de data/hora, moedas, e outras localizações específicas.

Training (Treinamento): Avalie se os usuários precisam de treinamento para usar a aplicação. Idealmente, a aplicação deve ser intuitiva o suficiente para ser usada sem treinamento extensivo.

Error Prevention and Recovery (Prevenção e Recuperação de Erros): Verifique se a aplicação ajuda a prevenir erros do usuário e fornece formas claras e eficientes de recuperar de erros quando eles ocorrem.

Feedback (Feedback): Avalie o feedback fornecido pela aplicação ao usuário. Isso inclui mensagens de confirmação, notificações de erros, e outros tipos de feedback que informam ao usuário o estado atual da aplicação.

Appearance (Aparência): Teste a aparência visual da aplicação. Isso inclui a estética, a consistência de design, e a conformidade com guias de estilo.

Consistency (Consistência): Verifique se a aplicação é consistente em todas as suas partes. Isso inclui a consistência de navegação, terminologia, e comportamento.

Efficiency (Eficiência): Avalie se a aplicação permite aos usuários completar suas tarefas de maneira eficiente. Isso inclui a otimização de fluxos de trabalho, tempos de resposta rápidos, e minimização de passos desnecessários.

- Back-end: VEDER
VEDER é uma heurística de testes focada em explorar diversas áreas da aplicação para garantir uma cobertura abrangente. VEDER é um acrônimo que representa os seguintes componentes:

Validation (Validação): Verifique se os dados inseridos ou processados pelo sistema são válidos e corretos. Isso inclui a validação de campos de entrada, formatos de dados, intervalos de valores, etc.

Error (Erro): Teste como o sistema lida com erros, tanto os erros previsíveis (como entradas inválidas) quanto os imprevisíveis (como falhas de rede). Verifique se o sistema fornece mensagens de erro apropriadas e se recupera de forma graciosa.

Data (Dados): Avalie como o sistema lida com dados. Isso inclui testar a persistência de dados, integridade de dados, e a correta manipulação de dados em diversas condições e estados do sistema.

Environment (Ambiente): Considere diferentes ambientes em que a aplicação pode operar, incluindo diferentes sistemas operacionais, navegadores, dispositivos, e configurações de rede. Teste a compatibilidade e o desempenho em cada um desses ambientes.

Range (Alcance): Teste a aplicação em diferentes condições de carga e uso. Isso inclui testes de performance, testes de stress, e testes de escalabilidade para garantir que o sistema funcione corretamente sob diferentes níveis de uso e pressão.

Ao aplicar as heurísticas VEDER e ALTER-FACE, podemos garantir que suas aplicações são não apenas funcionalmente corretas, mas também amigáveis ao usuário e robustas em uma variedade de condições.
```
7) Cite ferramentas de testes automatizados para Desktop, Web, API ́s e mobile
```bash
Desktop: RPA , TestComplete; 
Web: Selenium, Cypress e RobotFramework;
APIs: Postman, RestAssured, RobotFramework e Playwright;
Mobile: Appium, Espresso (Android), XCUITest (iOS) e Robot Framework

```
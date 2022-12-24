Projeto Base para construção de APPs Android
==================
Este repositório visa amenizar o tempo na criação de projetos android. Sempre é um processo trabalhoso e muitas das vezes enjoativo, visto que temos que configurar, procurar 
e adicionar dependencias, configurações do gradle / kotlin e para os apaixonantes em gradle kotlin, fazer a migração de groovy para kts. 
Com isso, esse repositório contém 3 branchs iniciais, sendo cada uma configurado de acordo com o que mais é usado em projetos android, sendo: Intengração com banco de dados,
integração com servidor, fazendo o papel de client aqui e até mesmo o mais básico, onde é "monolito", contendo somente um módulo do app. <br>
 * A branch <b>multiModuleNetworkRetrofit<b> está seguindo a arquitetura modularizada: ![image](https://user-images.githubusercontent.com/72824080/209443813-a347f48f-c5ec-45bd-a94b-03a0343faa89.png)
 * A branch <b> multiModuleNetworkDataSource<b> está seguindo a arquitetura modularizada: ![image](https://user-images.githubusercontent.com/72824080/209443861-28e70e0a-53e2-4a55-8184-9c36d149fa9e.png)
<br><b>É importante que você tenha conhecimento mínimo sobre modularização, sua importância e version Catologs, pois proporcionará maior sentido para você. Fique-se a vontade para contribuir e criar novos módulos, desde que faça sentido e evitando dependências cíclicas.<b>

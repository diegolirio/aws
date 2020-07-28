### Spring Boot :: Secrets Manager :: Parameter Store :: ElastiCache

![](https://cdn-images-1.medium.com/max/800/1*75GGV6zPFj9onJaQTl4GMQ.png)   
   
Configurações de Aplicações é algo que veio evoluindo com a necessidade e o passar do tempo, inicialmente utilizamos as configurações dentro do código, como variaveis, por exemplo host, porta e usuário de um banco de dados. Com o passar do tempo passavamos via parametros ao iniciar a aplicação ou criando arquivos de configurações fora da aplicação.    
   
Com o surgimento da Cloud e com a possibilidade de termos vários ambientes (desenvolvimento, homologação e produção), podendo ser IAAS, PAAS, SAAS, [FAAS](https://en.wikipedia.org/wiki/Function_as_a_service), BAAS e foi ficando cada vez mais complexo gerenciar essas configurações, e para adicionar ainda mais complexidade, temos escalabilidade horizontal, Blue-Green, Canary-Release e várias entregas em paralelo.   
   
Pensando nisso um grupo de desenvolvedores criaram os 12 fatores para a sua aplicação rodar na nuvem. E [Configurações](https://12factor.net/pt_br/config) é um desses 12 fatores.   
   
Você pode utilizar arquivos de properties para gerenciar essas configurações de aplicações criando uma para cada ambiente, no Spring temos o application.properties ou application.yml que facilita muito nossa vida (mas nem sempre foi assim).   
   
Em uma arquitetura de Cluster, ao alterar a configuração de um microservice, todas as instâncias devem ser alteradas. Nesse caso se você tem as configurações centralizadas, concorda que seria sensacional as instâncias fossem atualizadas On-The-Fly? Se você utiliza o ecossistema Spring, neste caso temos o Spring Cloud Config Server.   

No nosso caso como utilizamos Cloud pública AWS, podemos utilizar o [AWS ParameterStore](https://docs.aws.amazon.com/pt_br/systems-manager/latest/userguide/systems-manager-parameter-store.html) para centralizar nossas configurações.   

#### Parameter Store
É um produto da AWS onde podemos armazenar e gerenciar configurações e secredos utilizados pelas nossas aplicações. Os valores podem ser criptofados ou não. É possível recuperar os parametros pela sua API ou utilizando o SDK.

#### Secrets Manager
É um produto da AWS onde podemos armazenar e gerenciar segredos utilizados pelas nossas aplicações, como credenciais de banco de dados de produção por exemplo. Os secredos podem ser recuperados através das APIs do Secrets Manager ou utilizando o SDK.

Também é possível configurar rotatividade automática dos segredos para Amazon RDS, Amazon Redshift e Amazon DocumentDB. Podem ser configurados politicas para restringer o acesso aos segredos também. A cobrança é feita pelo número de chamadas para recuperar os segredos e pela quantidade de segredos registrados.

#### Parameter Store

Criando um parametro

#### Spring Clous AWS

...


![](AWS-Central-Configuration.png)


#### ElastiCache e CloudFormation

...

--- 

##### Config Server

![](./configserver_.png)
   
`Prós:`   
    - Configuração Centralizada   
    - Refresh Scope: Atualizar configurações OnTheFly   

`Contras:`   
    - Aplicações devem ser construídas em Java/Spring   
    - Serviço dedicado   


##### Configmap Kubernetes

`Prós:`   
    - Solução única indepêndente de Linguagem   
   
`Contras:`   
    - Arquivo local no Kubernets   
    - Para refletir atualização da configuração precisa de um novo deploy   

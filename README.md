# Devops ![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/amiltonrn/devops/maven.yml) ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/amilton2012/devops)
Projeto da disciplina Integração Contínua e DevOps 23E1_3

:construction: Projeto em construção :construction:
## Profiles:

- **dev** - Aponta para a base de desenvolvimento - **Padrão**.
- **test** - Aponta para a base de teste, por padrão o teste sempre roda com esse profile.
- **prod** - Aponta para a base de produção.

## Instruções para executar o projeto via maven (dev, test e prod)
No diretório do projeto, executar os seguintes comandos para construir o .jar da aplicação:

Para realizar o build e executar o projeto com o profile **dev**:
```bash
mvn clean package -DskipTests
mvn spring-boot:run
```

Para executar os testes com o profile de **test**:
```
mvn test
```

Para fazer o build e executar o projeto com o profile de **prod**:
```
mvn clean package -DskipTests
mvn spring-boot:run -D spring.profiles.active=prod
```


## Instruções para executar o projeto no docker(prod)
No diretório do projeto, executar os seguintes comandos para gerar o .jar, construir a imagem e executar o container no docker:

Para construir a aplicação:
````
 mvn clean package -DskipTests
````
Para construir a imagem docker:
````
 docker build -t amilton2012/devops .
````
Para executar somente o projeto:
````
 docker run -d -p 8080:8080 amilton2012/devops
````
Para executar o projeto com o Grafana, Prometheus e Zipkin
```
 docker-compose up
```

## Endpoints da aplicação e ferramentas configuradas via docker-compose

API: http://localhost:8080/user <br />
Documentação: http://localhost:8080 <br />
Prometheus: http://localhost:9090 <br />
Grafana: http://localhost:3000 <br />
Zipkin: http://localhost:9411

## Deploy no docker hub via Actions (Fork do projeto)

Vá para: Secrets and variables -> Actions

Adicione os seguintes secrets: <br />
**DOCKERHUB_USERNAME** - Username do docker hub. <br />
**DOCKERHUB_TOKEN** - Token do docker hub com suporte a Write/Escrita

## Instruções para executar o script do terraform
Exportar credenciais da AWS
```
export AWS_ACCESS_KEY_ID=<valor>
export AWS_SECRET_ACCESS_KEY_KEY=<valor>
```

Configurar AWS
```
aws configure
```
1. Verificar credenciais criadas na pasta usuario/.aws/credentials
2. Inserir credenciais
3. Inserir região
4. Inserir formato padrão de output

Entrar na pasta terraform e executar comandos
1. Formatação do script terraform (opcional)
```
terraform fmt
```
2. Inicialização do backend
```
terraform init
```
3. Criar o plano
```
terraform plan
```
4. Aplicar script
```
terraform apply
```
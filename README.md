# Devops ![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/amiltonrn/devops/maven.yml) ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/amilton2012/devops)
Projeto da disciplina Integração Contínua e DevOps 23E1_3

:construction: Projeto em construção :construction:

## Instruções para executar o projeto no docker
No diretório do projeto, executar os seguintes comandos para gerar o .jar, construir a imagem e executar o container no docker:
````
 mvn clean package
````
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

API: http://localhost:8080/user

Documentação: http://localhost:8080

Prometheus: http://localhost:9090

Grafana: http://localhost:3000

Zipkin: http://localhost:9411

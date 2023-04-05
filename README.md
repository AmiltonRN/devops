# Devops
Projeto da disciplina Integração Contínua e DevOps 23E1_3

:construction: Projeto em construção :construction:

## Instruções para executar o projeto no docker
No diretório do projeto, executar os seguintes comandos para gerar o .jar, construir a imagem e executar o container no docker:
````
 mvn clean package
````
````
 docker build -t br.edu.infnet/devops .
````

Para executar somente o projeto:
````
 docker run -d -p 8080:8080 br.edu.infnet/devops
````

Para executar o projeto com o Grafana e Prometheus

```
 docker-compose up
```

API: http://localhost:8080/user

Documentação: http://localhost:8080

Prometheus: http://localhost:9090

Grafana: http://localhost:3000

ZipKin: http://localhost:9411

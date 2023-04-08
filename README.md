# Devops
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

API: http://localhost:8080/user

Documentação: http://localhost:8080

Prometheus: http://localhost:9090

Grafana: http://localhost:3000

Zipkin: http://localhost:9411

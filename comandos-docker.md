# Principais comandos
## Como iniciar um container (que ainda não existe)?	## Como iniciar um container (que ainda não existe)?
```	```
    docker run NOME-DA IMAGEM	    docker run NOME-DA IMAGEM
    EX: docker run docker/getting-started	    EX: docker run docker/getting-started
```	```
## para listar os container que estão em execução	## para listar os container que estão em execução
```	```
    docker ps	    docker ps
```	```
# Se eu quiser parar a execuçõ de um container:	# Se eu quiser parar a execuçõ de um container:
```	```
    docker stop NOMEDOCONTAINER	    docker stop NOMEDOCONTAINER
    Ex: docker stop elated_poitras	    Ex: docker stop elated_poitras
```	```
# Se eu quiser iniciar um container que já existe:	# Se eu quiser iniciar um container que já existe:
```	```
    docker start NOMEDOCONTAINER	    docker start NOMEDOCONTAINER
    Ex: docker start elated_poitras	    Ex: docker start elated_poitras
```	```
# Para remover um container:	# Para remover um container:
Obs: o container deve estar parado!!!!!	Obs: o container deve estar parado!!!!!


```	```
    docker rm NOMEDOCONTAINER	    docker run NOMEDOCONTAINER
    Ex: docker rm elated_poitras	    Ex: docker rm elated_poitras
```	```


# Eu posso estipular o nome de um container

Obs: exemplo na criação do container
O nome da imagem sempre precisa ser o último parâmetro do docker run

```
    docker run  --nane NOMEDOCONTAINERDESEJO NOMEDAIMAGEM
    Ex: docker run --name hello-world docker/getting-started
```

# redirecionar a requisição da máquina hospedeira para um container docker

Obs: exemplo na criação do container


```
    docker run  --name NOMEDOCONTAINERDESEJO -p PORTA-HOSPEDEIRO:PORTA-CONTAINER  NOMEDAIMAGEM
    Ex: docker run --name hello-world -p 80:80  docker/getting-started
```
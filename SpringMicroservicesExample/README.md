# Spring Cloud Microservices Example

taken from amigoscode with <3

![https://www.youtube.com/playlist?list=PLwvrYc43l1Mwqpf9i-1B1gXfMeHOm6DeY](./img/microservice-archi.png)

- <https://www.youtube.com/playlist?list=PLwvrYc43l1Mwqpf9i-1B1gXfMeHOm6DeY>
- <https://github.com/amigoscode/microservices>

## Running

### docker (for the database)

    docker-compose up -d

    # create dbs
    docker-compose exec postgres createdb --username=amigoscode customer
    docker-compose exec postgres createdb --username=amigoscode fraud
    docker-compose exec postgres createdb --username=amigoscode notification

    # optional below
    docker-compose ps
    docker-compose logs -f

Then visit <http://localhost:5050/> to view PGAdmin.

Note the hostname is "postgres" (coming from the docker network) - not localhost.

### spring app

    # apply environment variables
    source DEV.env

    # build and run
    mvn spring-boot:run

or use intellij idea to run :3c

#### urls

Customer: <http://localhost:8090/>

### frontend

see [./amigoscodefrontend/](./amigoscodefrontend/)

## issues

### Invalid interpolation format

Your `docker-compose` version is probably old. Update with a binary from <https://github.com/docker/compose/releases>

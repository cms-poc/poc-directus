# Headless CMS Proof of Concept - Directus

A simple Spring Boot application that reads from and writes to a headless CMS. For this proof of concept, the headless
CMS solution being showcased is [Directus](https://directus.io/).

## Setting up Directus

Directus will be built from source and run in a Docker container. The instructions in the Directus documentation are
somewhat lacking. The following instructions will get the Directus API and Admin application built and running.

__Note__: The container image built from Directus source does not seem to run correctly on Docker for Windows.
Execute the following steps on a Linux machine that has both Docker and Docker Compose installed.

```bash
$ git clone -b build-v7 https://github.com/directus/directus.git
$ sudo chown -R www-data:www-data directus
$ cd directus
$ docker-compose up -d
$ docker exec -it api-php-apache bash
# bin/directus install:config -h api-mysql -n directus -u root -p root
# bin/directus install:database
# bin/directus install:install
# exit
```

You can now access the Directus admin application at `http://YOUR_DOCKER_HOST:8080/admin`. Log in using the username
`admin@example.com` and the password `password`.

## Configuring Proof of Concept Application

By default, the application will attempt to connect to the Directus API on `localhost:8080`. If the API is running
somewhere else, you can override the default behaviour by setting the `DIRECTUS_API_HOST` environment variable to
the correct host and port for your Directus API instance.

The Proof of Concept application will run on port 8080. If the Directus API is also running on port 8080, you will
need to run the Proof of Concept application on a different port. Change the port by setting the `SERVER_PORT`
environment variable.

## Running the Proof of Concept Application

```bash
$ mvn spring-boot:run
```

The application will be accessible at `http://localhost:8080`.

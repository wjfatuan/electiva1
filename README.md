# electiva1

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1cd355c8dfac4520a673cc3387d17620)](https://app.codacy.com/app/wilson.forero/sample-spring-boot?utm_source=github.com&utm_medium=referral&utm_content=wjfatuan/sample-spring-boot&utm_campaign=Badge_Grade_Dashboard)
[![CircleCI](https://circleci.com/gh/heroku/java-getting-started.svg?style=svg)](https://circleci.com/gh/heroku/java-getting-started)

A barebones Java app, which can easily be deployed to Heroku. This application is based on  the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out. You can access an online version of it in https://wjfatuan-electiva1.herokuapp.com/

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Course concepts

This application has examples of different design patterns from the class: DTO, DAO, Front Controller, ...

The original version of this sample project is implemented using Servlets and JSP, but this one is merged with the sample provided by Heroku. Navigate the source code to find the samples needed. 

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/wjfatuan/electiva1
$ cd electiva1
$ mvn install
$ heroku local:start
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

If you're going to use a database, ensure you have a local `.env` file that reads something like this:

```
DATABASE_URL=postgres://localhost:5432/java_database_name
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)

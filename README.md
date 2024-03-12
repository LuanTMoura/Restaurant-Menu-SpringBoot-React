# Restaurant-Menu-Spring-React
 This is my repository about a Spring Boot Application using React, where I present a simple website of a Restaurant Menu.

![demo](https://github.com/LuanTMoura/Restaurant-Menu-SpringBoot-React/assets/106880830/898b6660-e930-40b0-ab11-542f5e5d88ee)


 ## License

[![License: MIT (https://github.com/LuanTMoura/Study-CRUD-Java/blob/main/LICENSE)](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Specifications

- [**Maven - SpringBoot Project**](https://github.com/LuanTMoura/Restaurant-Menu-SpringBoot-React/blob/main/springboot/pom.xml);

- [**NPM - React Project**](https://github.com/LuanTMoura/Restaurant-Menu-SpringBoot-React/blob/main/react/restaurant-menu/package.json);

- [**Relational Database Version - PostGres**](https://www.postgresql.org/docs/release/16.1/);

## API Documentation

- [**Restaurant Menu API - Postman**](https://documenter.getpostman.com/view/32378462/2sA2xjyW3h);

## Resources

- [**Video tutorial part 1**](https://www.youtube.com/watch?v=lUVureR5GqI&t=15s&pp=ygUiQ0FSREFQSU8gRElHSVRBTCByZWFjdCBzcHJpbmcgYm9vdA%3D%3D);
- [**Video tutorial part 2**](https://www.youtube.com/watch?v=WHruc3_2z68);
- [**Spring Initializer**](https://start.spring.io/);

## What I've learned with this project?

- How to map objects using annotations;
- The use of DTO's (Data Transfer Object);
- Best practices with specific annotations with Spring Boot and Hibernate, like ``@NotNull`` and ``@NotBlank``, ``@GeneratedValue``;
- A little bit of the use of React properties and Tanstack Query libraries to do the connection between data on Back-End and interface on Front-End;
- What is CORS and what is the use on the browsers etc;
- A bit about Java Records;

# How to install and run on my machine?

## Installation

Search for your cmd program or PowerShell (for Windows Users) and run this:
```
git clone https://github.com/LuanTMoura/Restaurant-Menu-SpringBoot-React.git
```

If you prefer another way, inside this repository, search for the green button "``<Code>``" and choose between Open with GitHub Desktop or Download Zip.

## Run

**Recommendations and disclaimer:**

- Use IntelliJ or another IDE that support and gives the best experience with Java Applications.

- If something goes bad with images display, check out on the archive ``FoodController`` class from Spring Boot project inside the path ``controllers`` and search the code ``@CrossOrigin(origins = "http://localhost:{port}")``, just change the ``{port}`` for the port where react application is working, example: ``http://localhost:5173/``.

### Inside the Spring Boot path
Search for terminal and paste this command or just search for a button of Run or click above the archive ``SpringbootApplication.java`` with right side of your mouse and run the project.
```java
mvn spring-boot:run
```

### Inside the React Application path
Search for terminal and paste this command.
```tsx
npm install
npm run dev
```
Again, if something goes bad, just do the recommendation among the intructions.
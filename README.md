# TottenhamData
Springboot Java Project for the Premier League Team Tottenham Hotspur, data scraped in Python and imported into MySql database
Tottenham Hotspur Soccer Stats API
Project Overview
This is a backend REST API developed with Spring Boot and connected to a MySQL database to serve soccer analytics for the Premier League team, Tottenham Hotspur. The API allows users to retrieve various types of player and team statistics for analysis and review.

The data used in this project is scraped and stored in a MySQL database, then accessed through RESTful endpoints to deliver player and team performance data.

Key Features
Retrieve player statistics based on different categories like passing, shooting, and possession.

Access a variety of statistical data, including standard player stats, advanced goalkeeping stats, and more.

Built using the Spring Boot framework for easy integration and deployment.

Connects seamlessly to a MySQL database for efficient data storage and retrieval.

Technologies Used
Backend Framework: Spring Boot

Database: MySQL

Programming Language: Java

API Type: RESTful API

Libraries & Tools: Spring Data JPA, Spring Web

Installation
To set up and run the project locally, follow these steps:

Prerequisites
JDK 11 or higher installed.

MySQL database installed and running.

Maven for building and managing dependencies (can be used directly with IDEs like IntelliJ IDEA or Eclipse).

Steps
Clone the repository:

bash
Copy
git clone https://github.com/yourusername/tottenham-stats-api.git
cd tottenham-stats-api
Set up MySQL database and create a database for the project:

sql
Copy
CREATE DATABASE tottenham_stats;
Configure the application.properties file for your database connection:

In src/main/resources/application.properties:

properties
Copy
spring.datasource.url=jdbc:mysql://localhost:3306/tottenham_stats
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
Build the project:

bash
Copy
mvn clean install
Run the application:

bash
Copy
mvn spring-boot:run
The application will start running at http://localhost:8080.

API Endpoints
The following are the available endpoints to request data:

GET /players/search?player={name}: Search for player statistics by name.

GET /players/get-standard-player-stats: Retrieve all standard player statistics.

GET /players/get-advanced-goalkeeping-stats: Retrieve advanced goalkeeping statistics.

GET /players/get-defensive-actions: Retrieve defensive actions statistics.

GET /players/get-goal-and-shot-creation: Retrieve goal and shot creation statistics.

GET /players/get-goalkeeping-stats: Retrieve goalkeeping statistics.

GET /players/get-miscellaneous-stats: Retrieve miscellaneous statistics.

GET /players/get-passing-stats: Retrieve passing statistics.

GET /players/get-pass-types: Retrieve pass type statistics.

GET /players/get-playing-time: Retrieve playing time statistics.

GET /players/get-possession-stats: Retrieve possession statistics.

GET /players/get-shooting-stats: Retrieve shooting statistics.

Each of these endpoints will return a list of statistics from the database. You can customize your queries further by adjusting the parameters passed to the endpoints.

Example Usage
Search for player statistics by name:

To get stats for a player named "Harry Kane":

bash
Copy
GET http://localhost:8080/players/search?player=Harry%20Kane
Retrieve standard player stats:

bash
Copy
GET http://localhost:8080/players/get-standard-player-stats
Contributing
Feel free to fork the repository and submit pull requests if you have suggestions for improvements or new features!

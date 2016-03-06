# SpringDataExample
A Spring Data Example using Spring boot

#application.properties
under resource folder, create a new file named application.properties and type server.port=8085 to set the maven-embedded tomcat port to 8085.

sample output:
Registering beans for JMX exposure on startup
Tomcat started on port(s): 8085 (http)
== Customers found with findAll():
Customer[id=1, firstName='Jack', lastName='Bauer']
Customer[id=2, firstName='Chloe', lastName='O'Brian']
Customer[id=3, firstName='Kim', lastName='Bauer']
Customer[id=4, firstName='David', lastName='Palmer']
Customer[id=5, firstName='Michelle', lastName='Dessler']

== Customer found with findOne(1L):
Customer[id=1, firstName='Jack', lastName='Bauer']

== Customer found with findByLastName('Bauer'):
Customer[id=1, firstName='Jack', lastName='Bauer']
Customer[id=3, firstName='Kim', lastName='Bauer']

#Source
https://spring.io/guides/gs/accessing-data-jpa/

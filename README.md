# SpringDataExample
A Spring Data Example using Spring boot

#application.properties
under resource folder, create a new file named application.properties and type server.port=8085 to set the maven-embedded tomcat port to 8085.

output:
2016-03-06 14:44:48.806  INFO 13764 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2016-03-06 14:44:49.108  INFO 13764 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8085 (http)
2016-03-06 14:44:49.294  INFO 13764 --- [           main] hello.Application                        : Customers found with findAll():
2016-03-06 14:44:49.299  INFO 13764 --- [           main] hello.Application                        : -------------------------------
2016-03-06 14:44:49.614  INFO 13764 --- [           main] hello.Application                        : Customer [id=1, firstName=Jack, lastName=Bauer]
2016-03-06 14:44:49.619  INFO 13764 --- [           main] hello.Application                        : Customer [id=2, firstName=Chloe, lastName=O'Brain]
2016-03-06 14:44:49.628  INFO 13764 --- [           main] hello.Application                        : Customer [id=3, firstName=Kim, lastName=Bauer]
2016-03-06 14:44:49.633  INFO 13764 --- [           main] hello.Application                        : Customer [id=4, firstName=Michelle, lastName=Dessler]
2016-03-06 14:44:49.640  INFO 13764 --- [           main] hello.Application                        :
2016-03-06 14:44:49.660  INFO 13764 --- [           main] hello.Application                        : Customer found with findOne(1L)
2016-03-06 14:44:49.665  INFO 13764 --- [           main] hello.Application                        : -------------------------------
2016-03-06 14:44:49.670  INFO 13764 --- [           main] hello.Application                        : Customer [id=1, firstName=Jack, lastName=Bauer]
2016-03-06 14:44:49.676  INFO 13764 --- [           main] hello.Application                        :
2016-03-06 14:44:49.679  INFO 13764 --- [           main] hello.Application                        : Customer found with findByLastName('Bauer'
2016-03-06 14:44:49.684  INFO 13764 --- [           main] hello.Application                        : ------------------------------------------
2016-03-06 14:44:49.727  INFO 13764 --- [           main] hello.Application                        : Customer [id=1, firstName=Jack, lastName=Bauer]
2016-03-06 14:44:49.732  INFO 13764 --- [           main] hello.Application                        : Customer [id=3, firstName=Kim, lastName=Bauer]
2016-03-06 14:44:49.737  INFO 13764 --- [           main] hello.Application                        :
2016-03-06 14:44:49.744  INFO 13764 --- [           main] hello.Application                        : Started Application in 7.41 seconds (JVM running for 11.195)

## Maven commands

Run the tests with

``mvn tests``

Run the application with

``mvn spring-boot:run``

Build the application with

``mvn clean install``

## Consume the Broker using curl

Get Service Catalog

``curl http://localhost:8080/v2/catalog``

Create Service Instance

``curl -X PUT http://localhost:8080/v2/service_instances/927acdd9-7040-41a0-8429-996ea5357cac``

Get Last Operation

``curl http://localhost:8080/v2/service_instances/927acdd9-7040-41a0-8429-996ea5357cac/last_operation``

Delete Service Instnance

``curl -X DELETE http://localhost:8080/v2/service_instances/927acdd9-7040-41a0-8429-996ea5357cac``

## Deploy To Cloud Foundry

``mvn clean install``
``cf push mybroker -p target/dummy-service-broker-0.0.1-SNAPSHOT.jar``

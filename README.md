# primes
Primes Reactive Arch simple example

## Features

Rest Service that count how many primes (>1) exists between two numbers with cache in DB2

## Modules

```text

                            +------------------------------------------+
                            |                                          |
                            |            Application                   |
                            |                                          |
                            +------^---------------------------^-------+
                                   |                           |
                            +------+--------+           +------+-------+
                            |               |           |              |
                            |               |           |              |
                            |               |           |              |
                            |  WebAdapter   |           | Persistence  |
                            |               |           | Adapter      |
                            |               |           |              |
                            |               |           |              |
                            |               |           |              |
                            |               |           |              |
                            +------^--------+           +--------^-----+
                                   |                             |
                            +------+---------+          +--------+-----+
                            |                |          |              |
                            | PortsIn        |          | PortsOut     |
                            |                |          |              |
                            +-------^--------+          +-------^------+
                                    |                           |
                                    |                           |
                            +-------+---------------------------+------+
                            |                                          |
                            |                Service                   |
                            |                                          |
                            |                                          |
                            +---------------------+--------------------+
                                                  |
                                                  |
                             +--------------------v--------------------+
                             |                                         |
                             |                Domain                   |
                             |                                         |
                             +-----------------------------------------+
```

* Application - Configuration and launch the application
* Adapters - Responsible to handle the outside world communication (Rest And DB);
* Ports - Isolate the communication between Service and the Adapters;
* Service - Orchestrate the communication between the domain and ports;
* Domain - Domain Logic.

## Dependencies
* Java 11
* Maven
* Embedded H2 DB
* Spring Boot App

## Running
### Tests
```shell script
mvn clean test
``` 

### Package
```shell script
mvn clean package
``` 

### Install
```shell script
mvn clean install
``` 



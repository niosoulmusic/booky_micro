# Booky Demo app microservices v1.1
This is a bookmarks and ratings demo app to demonstrate java microservices development with spring cloud. 
I made this project after some training on microservices and i think it includes some decent good practises like:
- Event Bus inter communication
- TDD development
- Docker containerization & kubernetes clusterization
- Web components (i'm a backend developer)
- Build scripts
## Release Notes
This project ran on a mac pro 2008 with debian VM and docker on it , and has been tested on ubuntu and debian. Since my mac is too old and doesn't support native docker,
Testing of docker images and deployment has required some extra effort due to my memory and cpu limitations.
- Setup folder contains scripts for building,docker & kubernetes
- Be sure to have maven,bower + greadlink if you are using osx
- dev profile is active by default. If you run docker natively please edit configuration files 
## Application Schema
![Booky Microservices App](booky.png?raw=true "Booky Microservices App")

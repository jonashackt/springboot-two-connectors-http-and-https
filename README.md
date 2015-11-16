# springboot-two-connectors-http-and-https
[![Build Status](https://travis-ci.org/jonashackt/springboot-two-connectors-http-and-https.svg?branch=master)](https://travis-ci.org/jonashackt/springboot-two-connectors-http-and-https)
[![Coverage Status](https://coveralls.io/repos/jonashackt/springboot-two-connectors-http-and-https/badge.svg)](https://coveralls.io/r/jonashackt/springboot-two-connectors-http-and-https)

Show how to implement two Connectors within Spring Boot´s embedded Tomcat

As sometimes it could be necessary to implement a SSL-Connection within your SpringBoot App, but you additionally want to communicate through http only, you need to configure Spring Boot´s embedded Tomcat to run with two Connectors - one for https and one with http.

The [docs] states, that "It’s recommended to use application.properties to configure HTTPS as the HTTP connector is the easier of the two to configure programmatically", but the linked [sample-project] doesn´t show exactly that recommendation. So thats why there`s this simple project here :)

## HowTo

As we use nice [maven-wrapper], you don´t even need a running maven-installation, but it´s no problem if you have. Just clone project and inside the folder say

```
$ ./mvnw clean install
```

or

```
$ ./mvnw.cmd clean install
```

And furthermore you need to arm a keystore with some certificate. If GUIs are your flavor, you can try [KeyStore Explorer]
(yes, it´s really on sourceforge :) ) and if you´re on Mac, just type

```
brew cask install keystore-explorer
```





[docs]:http://docs.spring.io/spring-boot/docs/current/reference/html/howto-embedded-servlet-containers.html#howto-configure-ssl
[sample-project]:http://github.com/spring-projects/spring-boot/tree/v1.3.0.RELEASE/spring-boot-samples/spring-boot-sample-tomcat-multi-connectors
[maven-wrapper]:https://github.com/takari/maven-wrapper
[KeyStore Explorer]:http://keystore-explorer.sourceforge.net/downloads.php
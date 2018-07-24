Simple spring boot application illustrating how to use modules.

We have three modules in this example

 - domain module, contain all entity classes.
 - persistence module, contain all DAO and db seeder(populate db after application is started). It depends on domain module.
 - web module, contain all controllers and application main. It depends on domain and persistence modules.
 
 **Usage(Intellij):**
 -
 
 1. `Create a new spring boot project and specify project type as maven pom instead of maven project.
     This will create and empty project with only pom file. It has no src folder.`
 2. `Create a module as maven project but not a spring initializr.
     A module will be created with src folder and its own pom file.`
 3. `Create you three modules domain,persistence and web.`
 
 
 _Note*_
 - 
 
 - Parent module packaging type is <packaging>pom</packaging>
 - The other modules type is  <packaging>jar</packaging>
 - To enable spring boot application main module see your entities,jpa and component from other modules.
   You need to annotate the application main class as follow.
   
   @EnableJpaRepositories(basePackages = {"com.kamoche"})
   @EntityScan(basePackages = "com.kamoche")
   @ComponentScan(basePackages = "com.kamoche")
   
 - To package you application as a jar and run it. You need to add spring boot web dependency 
   in the module where spring boot application main is. "spring-boot-starter-web".
   
 - Clean and package as jar file. 
   mvn clean 
   mvn package 
   
   
   
_HAPPY CODING_
   
   
 
 
 
 
 
 
 
 
 
 



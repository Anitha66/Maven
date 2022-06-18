### Prerequisite 
- Install JDK & set it's path variable as JAVA_HOME in System Properties
- Install maven & set it's path variable as MAVEN_HOME in System Properties

#### Maven Project 
_By default it provides,_
Project Structure and pom.xml where we can add dependencies & plugins 

## Maven Lifecycle
1.mvn validate: validates all the required information of project

2.mvn clean: cleans all the unnecessary files.

3.mvn compile: compiles source code of the project

4.mvn test: executes all the testcases 

5.mvn package: creates jar file for the entire project

6.mvn install: deploys the jar file into your local repository

7.mvn deploy: deploys the jar file into remote maven repositories

_Note: _   When user runs mvn compile command for the first time the user may face MojoFailureException

[http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException](http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException)

To resolve this,
- Check windows->preferences->java->Installed JREs
- Make sure JRE is from JDK folder i.e., C:/programfiles/java/jdk
- Click on apply & close
- Update Project from maven
- run mvn install
- Build success






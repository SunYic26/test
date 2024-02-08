# RPG (Game)

Status

This project is still in very early stages of development.

# Build
## Installation
* Java Executable

### Download Apache Maven 3.9.6 to Build Project:
[Download Apache Maven](https://maven.apache.org/download.cgi)
* Extract files into an empty folder

#### WINDOWS: SETTING UP MAVEN

* Setting up Maven environmental variable ON WINDOWS
  * Navigate to Windows Start Menu > "Edit System Environment Variables" > Advanced > Environment Variables
  * Click New under System Variables, and name it `MAVEN_HOME`
    * In the variable value, copy-paste path to the downloaded Maven directory
  * After hitting OK, select `Path` variable, Click Edit > New, and enter `%MAVEN_HOME%\bin`
* Click OK to save all changes
    
In any command line: 
` mvn --version `to confirm version; output should look like:

`Maven home: C:\____apache-maven-3.9.6
Java version: 11.0.15, vendor: ____, runtime: C:\____
Default locale: en_US, platform encoding: Cp1252
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"`

After cloning the repository:
* Go to the directory of the file
  * `mvn package`
  * Maven will build from `pom.xml` into a usable jar file

`mvn compile` to compile the project

`mvn clean` to remove previous builds

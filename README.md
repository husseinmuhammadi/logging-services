# logging-services

In IntelliJ, for example, you'd go to Settings > Languages & Frameworks > Schemas and DTDs and click the green "+" to add an external resource.
Set "URI" to http://ch.qos.logback/xml/ns/logback and "Location" to the location of logback.xsd

logging with logback
https://www.javacodegeeks.com/2012/04/using-slf4j-with-logback-tutorial.html

logback.xml
In general file is quite intuitive, we are defining the appender (the output of log messages), in this case to console, a pattern, and finally root level logger (DEBUG) and a different level logger (INFO) for classes present in foo package.
Obviously this format is much readable than typical log4j.properties. Recall on additivity attribute, the appender named STDOUT is attached to two loggers, to root and to com.lordofthejars.foo. because the root logger is the ancestor of all loggers, logging request made by com.lordofthejars.foo logger will be output twice. To avoid this behavior you can set additivity attribute to false, and message will be printed only once.



## Configuring EAR project with logback
I ended up doing the following:

### logback.xml
logback load the logback.xml as below:
getClass().getClassLoader().getResourceAsStream("logback.xml");
Hence the class loader would be ear file so we are going 
to put the logback.xml in the ear file:

1. Create a new folder directly under the EAR folder. 
For example, create a new folder named "conf" --> MyEar/conf

2. Place your logback.xml file in this new folder: 
MyEar/conf/logback.xml

reference: http://mailman.qos.ch/pipermail/logback-user/2012-April/003087.html

### Add logback.xml to all modules Class-Path
3. In your WAR/EJB file's MANIFEST.MF file, add this new folder to the 
classpath:
        
       Class-Path: conf

### slf4j, binding and logging framework implementation libraries
Add dependencies with provided scope to all modules such as web, api, service and model

    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>${slf4j.version}</version>
        <scope>provided</scope>
    </dependency>

    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>${logback.version}</version>
        <scope>provided</scope>
    </dependency>

    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-core</artifactId>
        <version>${logback.version}</version>
        <scope>provided</scope>
    </dependency>

and these dependencies with scope compile to ear file as a shared library
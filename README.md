# logging-services

In IntelliJ, for example, you'd go to Settings > Languages & Frameworks > Schemas and DTDs and click the green "+" to add an external resource.
Set "URI" to http://ch.qos.logback/xml/ns/logback and "Location" to the location of logback.xsd

logging with logback
https://www.javacodegeeks.com/2012/04/using-slf4j-with-logback-tutorial.html

logback.xml
In general file is quite intuitive, we are defining the appender (the output of log messages), in this case to console, a pattern, and finally root level logger (DEBUG) and a different level logger (INFO) for classes present in foo package.


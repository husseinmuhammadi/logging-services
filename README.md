# logging-services

In IntelliJ, for example, you'd go to Settings > Languages & Frameworks > Schemas and DTDs and click the green "+" to add an external resource.
Set "URI" to http://ch.qos.logback/xml/ns/logback and "Location" to the location of logback.xsd

logging with logback
https://www.javacodegeeks.com/2012/04/using-slf4j-with-logback-tutorial.html

logback.xml
In general file is quite intuitive, we are defining the appender (the output of log messages), in this case to console, a pattern, and finally root level logger (DEBUG) and a different level logger (INFO) for classes present in foo package.
Obviously this format is much readable than typical log4j.properties. Recall on additivity attribute, the appender named STDOUT is attached to two loggers, to root and to com.lordofthejars.foo. because the root logger is the ancestor of all loggers, logging request made by com.lordofthejars.foo logger will be output twice. To avoid this behavior you can set additivity attribute to false, and message will be printed only once.



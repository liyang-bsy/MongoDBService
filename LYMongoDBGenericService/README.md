#LYTaskQueue

Release under LGPL license, consult your rights before using.

##How to use

### Java
>
>This project bring new grammar while using Project "Morphia" to access MongoDB
>
>You can make query easier like this:
>
>java.util.List list = xxxService.queryForList(new String[] { "condition1", "condition2" }, new Object[] { "value1", "value2" })
>
>Even more complex:
>
```java
Date date2 = new Date();
Double number3 = 1.234
xxxService.queryForList(
	new String[] { "cond1 in", "or(cond2 >","and(cond3","cond4 like",")",")" },
	new Object[] { Arrays.asList(new String[]{ "emu1", "emu2" }), date2, number3, "string4" });
	// All conditions should meet a value.
```
>
>Essential dependents:
>>Morphia Project : https://github.com/mongodb/morphia
>>
>>Apache : commons-logging.jar (org.apache.commons.logging.Log is used in this project)
>
>[!]This project is based on project "Morphia"
>

## Reading Finished? Freak out!
Thanks for reading this document and using my source!

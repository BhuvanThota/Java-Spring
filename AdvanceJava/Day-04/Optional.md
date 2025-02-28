

# Optional class 

- It is used to avoid the 'null point exception' in the java code


```java
List<String> names = List.of("Bhuvan", "Keerthi", "Nani", "Meenu");

// To find if there is name with "M" in it.

Optional<String> name = names.stream()
.filter( n -> n.contains("M"))
.findFirst();

System.out.println(name.orElse("Not Found any name with 'M'"));
```


- When we use findFirst() for a stream we get a Optional class so to reduce we could use .orElse() or get() after the findFirst() method.

```java
List<String> names = List.of("Bhuvan", "Keerthi", "Nani", "Meenu");

// To find if there is name with "M" in it.
String name = names.stream()
// For char insensitive check 
.filter( n -> n.toLowerCase().contains("M".toLowerCase())) 
.findFirst()
.orElse("Not Found any name with 'M'");

System.out.println(name);
```



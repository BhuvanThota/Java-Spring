


## String


- String is non-primitive data type

- String is a class based

```java
String name = new String("Bhuvan");

String name = "Bhuvan";
```

### String Methods

- To concat -> str.concat(str2) -> str + str2
- To find char at a index -> str.charAt(index) 
- To get the length of the str -> str.length()


### String Buffer vs String Builder

- String Buffer are Thread safe
- String Builder are not Thread safe
- We have many methods which are specific to String Builder or Buffer
    - .append()
    - .insert()
    - .setLength()



### Immutable

- The string is immutable
- String is saved in Heap of String constant pool

- This means if there are two strings with same string that means both the strings are refering to the same string the heap

- If s1 = "Bhuvan" & s2 = "Thota"

|String|Data|
|------|----|
|s1    |110 |
|s2    |120 |


- If s1 = "Bhuvan" & s2 = "Bhuvan"

|String|Data|
|------|----|
|s1    |110 |
|s2    |110 |


#### To check the immutable and mutablity of the string in java

```java
String str1 = "ABC";

System.out.println(str1);
System.out.println(str1.hashCode());

str1 = str1.replace('A', 'B');
System.out.println(str1);
System.out.println(str1.hashCode());

/////////////////

StringBuilder str2 = new StringBuilder("BBBBBC");

System.out.println(str2);
System.out.println(str2.hashCode());

str2 = str2.replace(0,1,"A");
System.out.println(str2);
System.out.println(str2.hashCode());
```

- Output: 
ABC
64578
BBC
65539
BBBBBC
798154996
ABBBBC
798154996

________________________


